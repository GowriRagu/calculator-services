package com.calculator.calculatorservices.services;

import org.springframework.stereotype.Service;

@Service
public class DivideService {
    public int divideMethod(int a, int b){
        return a/b;
    }
}
