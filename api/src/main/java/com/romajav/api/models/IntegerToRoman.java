package com.romajav.api.models;

import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerToRoman{
    
    private static Map<Integer, String> numerals = new LinkedHashMap<Integer, String>() {{
        put(1000, "M");
        put(900, "CM");
        put(500, "D");
        put(400, "CD");
        put(100, "C");
        put(90, "XC");
        put(50, "L");
        put(40, "XL");
        put(10, "X");
        put(9, "IX");
        put(5, "V");
        put(4, "IV");
        put(1, "I");
    }};

    public static String convert(Integer number){

        Map<Integer, Integer> getAmountNumbers = amountOfNumbers( number );

        String romanConverted = romanNumber(getAmountNumbers);

        return romanConverted;
    }

    private static Map<Integer, Integer> amountOfNumbers(Integer number){

        Map<Integer, Integer> amountNumbers = new LinkedHashMap<>();

        for(  Integer keyNumber : numerals.keySet() ){

            int amount = number / keyNumber;

            if(amount > 0){
                amountNumbers.put(keyNumber, amount);
                number %= keyNumber;
            }

        }

        return amountNumbers;
    }

    private static String romanNumber( Map<Integer, Integer> amountNumbers ){
        
        String romanConverted = "";

        for( Map.Entry<Integer, Integer> entry : amountNumbers.entrySet() ){

            for(int i = entry.getValue(); i > 0; i--){
                romanConverted += IntegerToRoman.numerals.get(entry.getKey());
            }

        }

        return romanConverted;
    }

}
