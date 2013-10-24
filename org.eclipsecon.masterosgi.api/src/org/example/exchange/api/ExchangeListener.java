package org.example.exchange.api;

import static org.example.model.orders.Orders.Order;
import aQute.bnd.annotation.ConsumerType;

@ConsumerType
public interface ExchangeListener {

	void orderSubmitted(Exchange exchange, Order order);

}
