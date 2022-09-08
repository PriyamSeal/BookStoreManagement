package com.Capgemini.BookstoreManagement.Service;

import java.util.List;

import com.Capgemini.BookstoreManagement.Entity.Customer;
import com.Capgemini.BookstoreManagement.Entity.OrderDetails;

public interface IOrderService {
	
	public List<OrderDetails> listAllOrders(); //admin
	public List<OrderDetails> listOrderByCustomer(Customer c); //user
	public OrderDetails viewOrderFromCustomer(OrderDetails od); //user
	public OrderDetails viewOrderFromAdmin(OrderDetails od); //order
	public OrderDetails cancelOrder(OrderDetails od);
	public OrderDetails addOrder(OrderDetails od);
	public OrderDetails updateOrder(OrderDetails od);
	public List<OrderDetails> viewOrderByBook();

}
