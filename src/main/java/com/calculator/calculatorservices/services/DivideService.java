package com.calculator.calculatorservices.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class DivideService {
    private Logger logger = LogManager.getLogger( DivideService.class);
    public int divideMethod(int a, int b){
        logger.info("Entered didvide method");
        return a/b;
    }
}
