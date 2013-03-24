package org.example.exchange.api;

import java.util.Collection;

import aQute.bnd.annotation.ProviderType;

import static org.example.model.orders.Orders.Order;

@ProviderType
public interface Exchange {

	void submitOrder(Order order) throws Exception;
	
	Collection<Order> getAllOrders();
}
