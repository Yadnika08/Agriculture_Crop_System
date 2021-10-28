package com.yadni8.orders.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.yadni8.orders.model.Order;

public interface OrderRepo extends MongoRepository<Order, String> {


	
}
