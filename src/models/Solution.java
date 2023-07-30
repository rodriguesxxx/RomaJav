import java.util.HashMap;
import java.util.Map;

class Solution {
    Map<String, Integer> numerals = new HashMap<String, Integer>() {{
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

    public int romanToInt(String roman) {
        int integer = 0;
        int cont = 0;

        while (cont < roman.length()) {
            if (cont + 1 < roman.length()) {
                String doubleCharRoman = roman.substring(cont, cont + 2);

                if (numerals.containsKey(doubleCharRoman)) {
                    integer += numerals.get(doubleCharRoman);
                    cont += 2;
                } else {
                    String charRoman = roman.substring(cont, cont + 1);
                    integer += numerals.get(charRoman);
                    cont++;
                }
            } else {
                String charRoman = roman.substring(cont, cont + 1);
                integer += numerals.get(charRoman);
                cont++;
            }
        }
        return integer;
    }
}
