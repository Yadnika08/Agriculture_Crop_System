package com.yadni8.dealers.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.yadni8.dealers.model.Dealer;



public interface DealersRepo extends MongoRepository<Dealer, Integer>{

}
