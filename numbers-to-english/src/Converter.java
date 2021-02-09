import java.util.HashMap;

public class Converter {
    HashMap<Integer, String> values = new HashMap<>() {{
        put(0, "zero");
        put(1, "one");
        put(2, "two");
        put(3, "three");
        put(4, "four");
        put(5, "five");
        put(6, "six");
        put(7, "seven");
        put(8, "eight");
        put(9, "nine");
        put(10, "ten");
        put(11, "eleven");
        put(12, "twelve");
        put(13, "thirteen");
    }};

    public String convert(int number) {
        if(number < 0 || number > 999) return null;

        String numberString = number + "";
        int length = numberString.length();

        // The length tells us how many digits the number has
        switch (length) {
            case(1): return values.get(number);
            case(2): return getTwoDigit(number);
            case(3):
                int firstDigit = number / 100;
                int twoDigit = number % 100;
                String lastPart = "";
                if(twoDigit / 10 == 0) lastPart = values.get(twoDigit % 10); // If "middle number" is 0, just add the last digit
                else lastPart = getTwoDigit(twoDigit); // If "middle number" is not 0, then get the two digit number
                return values.get(firstDigit) + " hundred " + lastPart;
        }
        return null;
    }

    // Get two digit numbers
    private String getTwoDigit(int number) {
        if(number < 14) return values.get(number); // The special cases (10-13)
        else if(number == 15) return "fifteen"; // Special case
        else if(number == 18) return "eighteen"; // Special case

        int firstDigit = number / 10;
        int lastDigit = number % 10;

        switch (firstDigit) {
            case (1): return values.get(lastDigit) + "teen";
            case (2): return "twenty " + values.get(lastDigit);
            case (3): return "thirty " + values.get(lastDigit);
            case (4): return "forty " + values.get(lastDigit);
            case (5): return "fifty " + values.get(lastDigit);
            default:  return values.get(firstDigit) + "ty " + values.get(lastDigit); // 60-90 is built in the same way
        }
    }
}
