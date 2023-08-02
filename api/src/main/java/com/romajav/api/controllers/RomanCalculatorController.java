package com.romajav.api.controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.romajav.api.models.Calculator;
import com.romajav.api.models.EntryCalculator;
import com.romajav.api.models.RomanToInteger;

@RestController
@RequestMapping("/calculator")
public class RomanCalculatorController {

    @PostMapping
    public Integer calculator(@RequestBody EntryCalculator entry){

        Calculator calc = new Calculator();

        calc.numberOne = RomanToInteger.convert( entry.valueOne );
        calc.numberTwo = RomanToInteger.convert( entry.valueTwo );
        calc.operation = entry.operation;

        return calc.calc();

    }
}
