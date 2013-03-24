package org.eclipsecon.masterosgi.ticker;

import org.example.exchange.api.Exchange;
import org.example.exchange.api.ExchangeListener;
import org.example.model.orders.Orders.Order;

import aQute.bnd.annotation.component.Component;

@Component
public class ConsoleExchangeListener implements ExchangeListener {

	public void orderSubmitted(Exchange exchange, Order order) {
		System.out.println("New order received: " + order);
	}

}
