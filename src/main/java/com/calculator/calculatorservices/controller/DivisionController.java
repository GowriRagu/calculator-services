package com.calculator.calculatorservices.controller;

import com.calculator.calculatorservices.services.DivideService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DivisionController {

    @Autowired
    private DivideService divideService;
    
    @GetMapping("/divide/{firstVar}/{secondVar}")
	public String divideNumber(@PathVariable int firstVar,@PathVariable int secondVar) {
        return "The number are divided :"+divideService.divideMethod(firstVar, secondVar);
	} 
}
