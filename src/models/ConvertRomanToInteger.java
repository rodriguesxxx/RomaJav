package models;
import java.util.Map;
import java.util.LinkedHashMap;

public class ConvertRomanToInteger {
    Map<String, Integer> numerals = new LinkedHashMap<String, Integer>() {{
        put("M", 1000);
        put("CM", 900);
        put("D", 500);
        put("CD", 400);
        put("C", 100);
        put("XC", 90);
        put("L", 50);
        put("XL", 40);
        put("X", 10);
        put("IX", 9);
        put("V", 5);
        put("IV", 4);
        put("I", 1);

    }};


    private String roman;

    public ConvertRomanToInteger(String roman){
        this.roman = roman;
    }

    public Integer convert() {

        int integer = 0;
        int cont = 0;

        while (cont < roman.length()) {

            String doubleCharRoman = cont + 1 < roman.length() ? roman.substring(cont, cont + 2) : null;

            if (doubleCharRoman != null && numerals.containsKey(doubleCharRoman)) {

                integer += numerals.get(doubleCharRoman);
                cont += 2;

            } else {

                String charRoman = roman.substring(cont, cont + 1);
                integer += numerals.get(charRoman);
                cont++;

            }
        }

        return integer;
    }

}
