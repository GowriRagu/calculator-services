package com.calculator.calculatorservices.services;

import org.springframework.stereotype.Service;

@Service
public class AddService {
    
    public int addMethod(int a, int b){
        //Logger
        return a+b;
    }
}

