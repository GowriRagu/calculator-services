package com.calculator.calculatorservices.controller;

import com.calculator.calculatorservices.services.AddService;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {

    @Autowired
    private AddService addService;

    @Value("${welcome.word}")
    private String welcomeWord;

    private Logger log = LogManager.getLogger(AddController.class);

    @GetMapping("/add/{firstVar}/{secondVar}")
	public String addNumbers(@PathVariable int firstVar,@PathVariable int secondVar) {
        log.debug("Welcome word is "+welcomeWord);
        return "The number are added :"+addService.addMethod(firstVar, secondVar);
	} 
}
