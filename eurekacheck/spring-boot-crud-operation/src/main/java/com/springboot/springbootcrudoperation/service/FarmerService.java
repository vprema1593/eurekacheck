package com.springboot.springbootcrudoperation.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.springbootcrudoperation.model.Farmer;
import com.springboot.springbootcrudoperation.repository.FarmerRepository;


@Service
public class FarmerService {

	 @Autowired
	    private FarmerRepository farmerRepository;


	    public List<Farmer> getAllFarmers()
	    {
	    List<Farmer> farmersbook=new ArrayList<>();
	    farmerRepository.findAll()
	    .forEach(farmersbook::add);
	    return farmersbook;
	    }

	    public void add(Farmer crop) {
	    farmerRepository.save(crop);


	    }


	    public void Update(Farmer crop) {
	    farmerRepository.save(crop);

	    }
	    public void delete(String cropid) {
	    farmerRepository.deleteById(cropid);

	    }

	    public Optional<Farmer> getFarmer(String farmerid) {
	        // TODO Auto-generated method stub
	        return null;
	    }
}
