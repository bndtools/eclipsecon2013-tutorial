package org.eclipsecon.masterosgi.orderentry;

import org.example.model.orders.Orders;
import org.example.model.orders.Orders.Order;
import org.example.model.orders.Orders.Order.Side;

import aQute.bnd.annotation.component.Activate;
import aQute.bnd.annotation.component.Component;
import aQute.bnd.annotation.component.Deactivate;

@Component(
	provide = Object.class,
	immediate = true,
	properties = {
		"osgi.command.scope=orderentry",
		"osgi.command.function=orders|bid"
	}
)
public class OrderEntry {

	public void orders() {
		System.out.println("Listing orders in the exchange:");
		// TODO: implement this command to list the current orders in the exchange
	}
	
	public void bid(String symbol, long quantity, long price) {
		Order newOrder = Orders.Order.newBuilder()
			.setSide(Side.BID)
			.setSymbol(symbol)
			.setQuantity(quantity)
			.setUnitPrice(price)
			.build();
		
		// TODO: submit this order into the exchange
	}

	@Activate
	void start() {
		System.out.println("OrderEntry component started");
	}
	@Deactivate
	void stop() {
		System.out.println("OrderEntry component stopped");
	}

}