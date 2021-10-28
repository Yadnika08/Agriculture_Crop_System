package com.yadni8.farmers.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.yadni8.farmers.model.Farmer;

public interface FarmerRepo extends MongoRepository<Farmer, Integer>{

}
