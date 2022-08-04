package com.microservice.dealer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.microservice.dealer.model.Dealer;
import com.microservice.dealer.repository.DealerRepository;
import com.microservice.dealer.service.DealerService;


@RestController
public class DealerController {

    @Autowired
    private DealerService dealerService;

    @RequestMapping("/dealer/{Dealid}")
    public Optional<Dealer> getDealer(@PathVariable("Dealid") String Dealid)
    {
        return dealerService.getDealer(Dealid);
    }
    @RequestMapping(method=RequestMethod.GET, value="/dealer")
    public List<Dealer> getAllDealers()
    {
    return dealerService.getAllDealers();
    }

    @RequestMapping(method=RequestMethod.POST,value="/dealer")
    public void addDealer(@RequestBody Dealer dealer)
    {
    dealerService.add(dealer);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/dealer/update/{Dealid}")
    public Dealer updateDealer(@RequestBody Dealer dealer, @PathVariable("Dealid") String Dealid)
    {   dealer.setDealid(Dealid);
        dealerService.Update(dealer);
         return dealer;
    }

    @RequestMapping(method = RequestMethod.DELETE, value="dealer/{Dealid}")
    public String deleteDealid(@PathVariable String Dealid) {
        dealerService.delete(Dealid);
        return Dealid;
    }

}