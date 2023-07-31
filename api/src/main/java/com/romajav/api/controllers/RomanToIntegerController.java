package com.romajav.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.romajav.api.models.Entry;
import com.romajav.api.models.RomanToInteger;


@RestController
@RequestMapping("/convert/roman")
public class RomanToIntegerController {

    @PostMapping
    public Integer convertToInteger(@RequestBody Entry entry){
        String romanValue = entry.getEntry();
        return RomanToInteger.convert(romanValue);
    }
}
