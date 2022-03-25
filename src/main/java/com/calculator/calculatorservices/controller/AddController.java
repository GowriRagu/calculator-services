package com.calculator.calculatorservices.controller;

import com.calculator.calculatorservices.services.AddService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {

    @Autowired
    private AddService addService;

    @GetMapping("/add/{firstVar}/{secondVar}")
	public String addNumbers(@PathVariable int firstVar,@PathVariable int secondVar) {
        return "The number are added :"+addService.addMethod(firstVar, secondVar);
	} 
}
