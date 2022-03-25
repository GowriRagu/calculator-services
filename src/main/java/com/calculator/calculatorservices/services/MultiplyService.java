package com.calculator.calculatorservices.services;

import org.springframework.stereotype.Service;

@Service
public class MultiplyService {
    public int multiplyMethod(int a, int b){
        return a*b;
    }
}
