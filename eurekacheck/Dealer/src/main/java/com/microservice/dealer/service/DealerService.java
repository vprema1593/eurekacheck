package com.microservice.dealer.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.dealer.model.Dealer;
import com.microservice.dealer.repository.DealerRepository;



@Service
public class DealerService {
    @Autowired
    private DealerRepository dealerRepository;


    public List<Dealer> getAllDealers()
    {
    List<Dealer> dealersbook=new ArrayList<>();
   dealerRepository.findAll()
    .forEach(dealersbook::add);
    return dealersbook;
    }

    public void add(Dealer dealer) {
    dealerRepository.save(dealer);


    }


    public void Update(Dealer dealer) {
    dealerRepository.save(dealer);

    }
    public void delete(String Dealid) {
    dealerRepository.deleteById(Dealid);

    }

    public Optional<Dealer> getDealer(String dealerid) {
        // TODO Auto-generated method stub
        return null;
    }


    }