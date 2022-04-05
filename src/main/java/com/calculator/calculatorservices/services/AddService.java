package com.calculator.calculatorservices.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class AddService {
    private Logger log = LogManager.getLogger(AddService.class);
    
    public int addMethod(int a, int b){
        log.debug("Entered add method");
        return a+b;
    }
}

