package com.yadni8.farmers.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yadni8.farmers.Repo.CropRepo;
import com.yadni8.farmers.model.Crop;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
@RestController
public class CropController {
	
	@Autowired
	private CropRepo crepo;
	
	@RequestMapping(value="/crops")
	public List<Crop> getAllCrops() {
		return crepo.findAll();
	}
	
	 @RequestMapping(value="/crops/{id}", method = RequestMethod.GET)
	  public Optional<Crop> getCrop(@PathVariable String id) {
		return crepo.findById(id);
	  }
	
	@RequestMapping (value = "/crops", method =RequestMethod.POST)
	public void addCrop( @RequestBody Crop crop) {
		crepo.insert(crop);
	}
	
	@RequestMapping(value="/crops/{id}",method=RequestMethod.PUT)
	  public void updateCrop(@PathVariable String id, @RequestBody Crop crop) {
		  crepo.save(crop);
	  }

	  @RequestMapping(value="/crops/{id}",method=RequestMethod.DELETE)
	  public void deleteCrop(@PathVariable String id) {
	    crepo.deleteById(id);
	  }

}
