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

import com.yadni8.farmers.Repo.FarmerRepo;
import com.yadni8.farmers.model.Farmer;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api")
public class FarmerController {
	
	@Autowired
	private FarmerRepo repo;
	
	@RequestMapping(value="/farmer",method=RequestMethod.GET)
	  public List<Farmer> getAllFarmers() {
		  return repo.findAll();
	  }

	  @RequestMapping(value="/farmer/{FarmerId}",method=RequestMethod.GET)
	  public Optional<Farmer> getFarmer(@PathVariable int FarmerId) {
		return repo.findById(FarmerId);
	  }

	  @RequestMapping(value="/add_farmer",method=RequestMethod.POST)
	  public void addFarmer(@RequestBody Farmer farmer) {
		  repo.insert(farmer);
	  }

	  @RequestMapping(value="/farmer/{FarmerId}",method=RequestMethod.PUT)
	  public void updateFarmer(@PathVariable int FarmerId, @RequestBody Farmer farmer) {
		  repo.save(farmer);
	  }

	  @RequestMapping(value="/farmer/{FarmerId}",method=RequestMethod.DELETE)
	  public void deleteFarmer(@PathVariable int FarmerId) {
	    repo.deleteById(FarmerId);
	  }
	


}
