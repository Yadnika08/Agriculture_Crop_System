package com.yadni8.orders.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yadni8.orders.model.Order;
import com.yadni8.orders.repo.OrderRepo;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api")
public class OrderController {
	
	@Autowired
	private OrderRepo oRepo;
	
	  @RequestMapping(value="/orders", method=RequestMethod.GET)
	  public List<Order> getAllOrders() {
		  return oRepo.findAll();
	  }

	  @RequestMapping(value="/orders/{orderId}",method=RequestMethod.GET)
	  public Optional<Order> getOrder(@PathVariable String orderId) {
		return oRepo.findById(orderId);
	  }

	  @RequestMapping(value="/add_orders",method=RequestMethod.POST)
	  public void addOrders(@RequestBody Order orders) {
		  oRepo.insert(orders);
	  }

	  @RequestMapping(value="/orders/{orderId}",method=RequestMethod.PUT)
	  public void updateOrders(@PathVariable String ordererId, @RequestBody Order orders) {
		  oRepo.save(orders);
	  }

	  @RequestMapping(value="/delete/{ordersId}",method=RequestMethod.DELETE)
	  public void deleteorders(@PathVariable String orderId) {
	    oRepo.deleteById(orderId);
	  }

}
