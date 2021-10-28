package com.yadni8.orders.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.yadni8.orders.model.Cart;

public interface CartRepo extends MongoRepository<Cart, String>{
	

}
