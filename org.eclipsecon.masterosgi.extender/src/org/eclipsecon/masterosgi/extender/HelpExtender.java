package org.eclipsecon.masterosgi.extender;

import java.io.IOException;
import java.net.URL;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.util.tracker.BundleTracker;

import aQute.bnd.annotation.component.Activate;
import aQute.bnd.annotation.component.Component;
import aQute.bnd.annotation.component.Deactivate;
import aQute.lib.io.IO;

@Component(immediate = true, provide = Object.class, properties = {
	"osgi.command.scope=docs",
	"osgi.command.function=showHelp|listHelp"
})
public class HelpExtender {
	
	private ConcurrentMap<Long, String> docs = new ConcurrentHashMap<Long, String>();
	private BundleTracker tracker; 
	
	@Activate
	void start(BundleContext context) {
		tracker = new BundleTracker(context, Bundle.ACTIVE, null) {
			@Override
			public Object addingBundle(Bundle bundle, BundleEvent event) {
				URL url = bundle.getEntry("help.txt");
				if (url == null)
					return null;
				
				try {
					String helpText = IO.collect(url.openStream());
					docs.put(bundle.getBundleId(), helpText);
					return bundle;
				} catch (IOException e) {
					e.printStackTrace();
					return null;
				}
			}
			@Override
			public void removedBundle(Bundle bundle, BundleEvent event, Object object) {
				docs.remove(bundle.getBundleId());
			}
		};
		tracker.open();
	}
	
	@Deactivate
	void stop() {
		tracker.close();
	}
	
	public void showHelp(long bundleId) {
		String helpText = docs.get(bundleId);
		if (helpText != null) {
			System.out.printf("Help for bundle %d:%n", bundleId);
			System.out.println(helpText);
		} else {
			System.err.printf("No help available for bundle %d.%n", bundleId);
		}
	}
	
	public void listHelp() {
		System.out.printf("Found %d help documents:%n", docs.size());
		for (Entry<Long,String> entry : docs.entrySet()) {
			System.out.printf("%d: %s%n", entry.getKey(), entry.getValue().split("\r")[0]);
		}
	}

}