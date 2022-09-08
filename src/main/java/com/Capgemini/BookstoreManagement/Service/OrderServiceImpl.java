package com.Capgemini.BookstoreManagement.Service;

import java.util.List;

import com.Capgemini.BookstoreManagement.Entity.Customer;
import com.Capgemini.BookstoreManagement.Entity.OrderDetails;
import com.Capgemini.BookstoreManagement.Repository.IOrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements IOrderService {
	
	@Autowired
	IOrderRepository iOrderServiceRepo;
	@Override
	public List<OrderDetails> listAllOrders() {
		// TODO Auto-generated method stub
		return iOrderServiceRepo.findAll();
		
	
	}

	@Override
	public List<OrderDetails> listOrderByCustomer(Customer c) {
		// TODO Auto-generated method stub
		return iOrderServiceRepo.findAll();
		
	}

	@Override
	public OrderDetails viewOrderFromCustomer(OrderDetails od) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDetails viewOrderFromAdmin(OrderDetails od) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDetails cancelOrder(OrderDetails od) {
		// TODO Auto-generated method stub
		iOrderServiceRepo.deleteById(od.getOrderId());
		return od;
		
	}

	@Override
	public OrderDetails addOrder(OrderDetails od) {
		// TODO Auto-generated method stub
		
		iOrderServiceRepo.save(od);
		return od;
	}

	@Override
	public OrderDetails updateOrder(OrderDetails od) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderDetails> viewOrderByBook() {
		// TODO Auto-generated method stub
		return null;
	}

}
