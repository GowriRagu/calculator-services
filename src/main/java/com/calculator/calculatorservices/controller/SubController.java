package com.calculator.calculatorservices.controller;

import com.calculator.calculatorservices.services.SubService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubController {

    @Autowired
    private SubService subService;

    @GetMapping("/subtract/{firstVar}/{secondVar}")
	public String subtractNum(@PathVariable int firstVar,@PathVariable int secondVar) {
        return "The number are subtracted :"+subService.subMethod(firstVar, secondVar);
	} 
}
