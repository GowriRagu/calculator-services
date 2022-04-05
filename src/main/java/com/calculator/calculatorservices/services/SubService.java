package com.calculator.calculatorservices.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class SubService {
    private Logger logger = LogManager.getLogger(SubService.class);
    
    public int subMethod(int a, int b){
        logger.info("Entered subtract method");
        return a-b;
    }
}
