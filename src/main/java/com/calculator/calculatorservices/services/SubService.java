package com.calculator.calculatorservices.services;

import org.springframework.stereotype.Service;

@Service
public class SubService {
    
    public int subMethod(int a, int b){
        return a-b;
    }
}
