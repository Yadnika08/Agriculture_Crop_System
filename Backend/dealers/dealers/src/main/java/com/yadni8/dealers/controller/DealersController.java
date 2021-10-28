package com.yadni8.dealers.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.yadni8.dealers.model.Dealer;
import com.yadni8.dealers.repo.DealersRepo;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api")
public class DealersController {
	
	@Autowired
	 private DealersRepo drepo;
	
	@RequestMapping(value="/dealers",method=RequestMethod.GET)
	  public List<Dealer> getAllDealers() {
		  return drepo.findAll();
	  }

	  @RequestMapping(value="/dealers/{did}",method=RequestMethod.GET)
	  public Optional<Dealer> getDealer(@PathVariable int did) {
		return drepo.findById(did);
	  }

	  @RequestMapping(value="/add_dealers",method=RequestMethod.POST)
	  public void addDealer(@RequestBody Dealer dealer) {
		  drepo.insert(dealer);
	  }

	  @RequestMapping(value="/dealers/{did}",method=RequestMethod.PUT)
	  public void updateDealer(@PathVariable int did, @RequestBody Dealer dealer) {
		  drepo.save(dealer);
	  }

	  @RequestMapping(value="/dealers/{did}",method=RequestMethod.DELETE)
	  public void deleteDealer(@PathVariable int did) {
	    drepo.deleteById(did);
	  }
	

}
