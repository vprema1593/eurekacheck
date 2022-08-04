package com.springboot.springbootcrudoperation.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.springbootcrudoperation.model.Farmer;
import com.springboot.springbootcrudoperation.repository.FarmerRepository;
import com.springboot.springbootcrudoperation.service.FarmerService;

@RestController
	public class FarmerController {

	    @Autowired
	    private FarmerService farmerService;

	    @RequestMapping("/farmer/{farmerid}")
	    public Optional<Farmer> getUser(@PathVariable("farmerid") String farmerid)
	    {
	        return farmerService.getFarmer(farmerid);
	    }
	    @RequestMapping(method=RequestMethod.GET, value="/farmer")
	    public List<Farmer> getAllFarmers()
	    {
	    return farmerService.getAllFarmers();
	    }

	    @RequestMapping(method=RequestMethod.POST,value="/farmer")
	    public void addfarmer(@RequestBody Farmer farmer)
	    {
	    farmerService.add(farmer);
	    }
	    @RequestMapping(method = RequestMethod.PUT, value = "/farmer/update/{farmerid}")
	    public Farmer updateFarmer(@RequestBody Farmer farmer, @PathVariable("farmerid") String farmerid)
	    {   farmer.setFarmerid(farmerid);
	         farmerService.Update(farmer);
	         return farmer;
	    }

	    @RequestMapping(method = RequestMethod.DELETE, value="farmer/{farmerid}")
	    public String deletefarmerid(@PathVariable String farmerid) {
	        farmerService.delete(farmerid);
	        return farmerid;
	    }

	}

