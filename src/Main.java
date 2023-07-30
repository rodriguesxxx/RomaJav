import models.ConvertIntegerToRoman;
import models.ConvertRomanToInteger;

class Main{
    public static void main(String[] args) {
        ConvertIntegerToRoman convertIntToRoman = new ConvertIntegerToRoman(1994);
        System.out.println(convertIntToRoman.convert());
        ConvertRomanToInteger convertRomanToInteger = new ConvertRomanToInteger("MCMXCIV");
        System.out.println(convertRomanToInteger.convert());
    }
}