package org.eclipsecon.masterosgi.orderentry;

import java.util.Collection;

import org.example.exchange.api.Exchange;
import org.example.model.orders.Orders;
import org.example.model.orders.Orders.Order;
import org.example.model.orders.Orders.Order.Side;

import aQute.bnd.annotation.component.Activate;
import aQute.bnd.annotation.component.Component;
import aQute.bnd.annotation.component.Deactivate;
import aQute.bnd.annotation.component.Reference;

@Component(
	provide = Object.class,
	immediate = true,
	properties = {
		"osgi.command.scope=orderentry",
		"osgi.command.function=orders|bid"
	}
)
public class OrderEntry {
	
	private Exchange exchange;

	@Reference(target = "(name=NASDAQ)")
	public void setExchange(Exchange exchange) {
		this.exchange = exchange;
	}

	public void orders() {
		System.out.println("Listing orders in the exchange:");
		Collection<Order> orders = exchange.getAllOrders();
		System.out.printf("There are %d orders in the exchange:%n", orders.size());
		for (Order order : orders) {
			System.out.println(order);
		}
	}
	
	public void bid(String symbol, long quantity, long price) throws Exception {
		Order newOrder = Orders.Order.newBuilder()
			.setSide(Side.BID)
			.setSymbol(symbol)
			.setQuantity(quantity)
			.setUnitPrice(price)
			.build();
		exchange.submitOrder(newOrder);
		
		exchange.cancelOrder(newOrder);
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