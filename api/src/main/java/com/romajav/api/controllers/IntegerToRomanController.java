package com.romajav.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.romajav.api.models.Entry;
import com.romajav.api.models.IntegerToRoman;

@RestController
@RequestMapping("/convert/integer")
public class IntegerToRomanController {
    
    @PostMapping
    public String convertToRoman(@RequestBody Entry entry){
        Integer integerValue = Integer.valueOf( entry.getEntry() );
        return IntegerToRoman.convert(integerValue);
    }

}
