package com.yadni8.farmers.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.yadni8.farmers.model.Crop;

@Repository
public interface CropRepo extends MongoRepository<Crop, String>{

}