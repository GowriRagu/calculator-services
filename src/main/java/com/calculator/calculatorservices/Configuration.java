package com.calculator.calculatorservices;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Component
@ConfigurationProperties("welcome")
public class Configuration {
    private String word;
}
