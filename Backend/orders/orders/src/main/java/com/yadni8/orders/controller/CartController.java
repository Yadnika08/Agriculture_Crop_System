package com.yadni8.orders.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yadni8.orders.model.Cart;
import com.yadni8.orders.repo.CartRepo;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class CartController {
	
	@Autowired
	private CartRepo cRepo;
	
	  @RequestMapping(value="/cart", method=RequestMethod.GET)
	  public List<Cart> getAllCarts() {
		  return cRepo.findAll();
	  }

	  @RequestMapping(value="/add_cart",method=RequestMethod.POST)
	  public void addOrders(@RequestBody Cart cart) {
		  cRepo.insert(cart);
	  }

	

	  @RequestMapping(value="/delete_cart",method=RequestMethod.DELETE)
	  public void deleteOrders() {
	    cRepo.deleteAll();
	  }


}
