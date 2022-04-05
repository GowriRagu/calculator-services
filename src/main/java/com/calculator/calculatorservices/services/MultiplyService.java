package com.calculator.calculatorservices.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class MultiplyService {
    private Logger logger = LogManager.getLogger( MultiplyService.class);

    public int multiplyMethod(int a, int b){
        logger.info("Entered multiply method");
        return a*b;
    }
}
