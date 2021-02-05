
public class RomanNumeralConverter {
    public String convertRomanNumeral(int decimal) {
        StringBuilder str = new StringBuilder();

        for(RomanNumerals rn : RomanNumerals.values()){ // Go through all the enums
            while(decimal >= rn.decimal) { // Add this roman numeral as many times as possible
                decimal -= rn.decimal; // Subtract the decimal value from the decimal number
                str.append(rn); // Add the roman numeral to the StringBuilder
            }
        }
        System.out.println(str.toString());
        return str.toString();
    }
}
