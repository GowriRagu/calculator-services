package com.calculator.calculatorservices.controller;

import com.calculator.calculatorservices.services.MultiplyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MultiplyController {

    @Autowired
    private MultiplyService mulService;
    
    @GetMapping("/multiply/{firstVar}/{secondVar}")
	public String multiplyNum(@PathVariable int firstVar,@PathVariable int secondVar) {
        return "The number are multiplied :"+mulService.multiplyMethod(firstVar, secondVar);
	} 
}
