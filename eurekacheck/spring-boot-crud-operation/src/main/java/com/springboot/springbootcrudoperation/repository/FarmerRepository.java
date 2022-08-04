package com.springboot.springbootcrudoperation.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.springbootcrudoperation.model.Farmer;

public interface FarmerRepository extends MongoRepository<Farmer , String> {

}
