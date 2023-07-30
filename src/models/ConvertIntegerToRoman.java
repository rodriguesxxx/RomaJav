package models;
import java.util.Map;
import java.util.LinkedHashMap;

public class ConvertIntegerToRoman {

    Map<Integer, String> numerals = new LinkedHashMap<Integer, String>() {{
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

    private int value;

    public ConvertIntegerToRoman(int value){
        this.value = value;
    }

    public String convert(){
        return this.romanNumber(this.amountOfNumbers());
    }

    private Map<Integer, Integer> amountOfNumbers(){

        Map<Integer, Integer> result = new LinkedHashMap<>();

        for(  Integer keyNumber : this.numerals.keySet() ){

            int amountNumbers = this.value / keyNumber;

            if(amountNumbers > 0){
                result.put(keyNumber, amountNumbers);
                this.value %= keyNumber;
            }

        }

        return result;
    }
    private String romanNumber( Map<Integer, Integer> algorism){

        String romanConverted = "";

        for( Map.Entry<Integer, Integer> entry : algorism.entrySet() ){

            for(int i = entry.getValue(); i > 0; i--){
                romanConverted += this.numerals.get(entry.getKey());
            }

        }
        return romanConverted;
    }
}
