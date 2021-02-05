public class CreditCardValidator {
    public boolean validateCard(long number) {
        StringBuilder numberString = new StringBuilder(String.valueOf(number));
        int length = numberString.length();
        if(length < 14 || length > 19) return false;

        int lastDigit = Character.getNumericValue(numberString.charAt(length - 1)); // Save last digit for later

        numberString.deleteCharAt(length - 1);// Remove last digit
        numberString.reverse(); // Reverse the sequence
        doubleInOdd(numberString);// Double in all odd-numbered positions
        int sum = getNumberStringSum(numberString); // Add all digits
        int difference = 10 - (sum % 10); // Subtract last digit from the sum, from 10

        return difference == lastDigit;
    }

    private StringBuilder doubleInOdd(StringBuilder str) {
        int doubledNum;
        String stringHelper;
        for(int i = 0; i < str.length(); i += 2) { // Increase with 2 every iteration to skip even numbers
            doubledNum = Character.getNumericValue(str.charAt(i)) * 2;
            if(doubledNum > 9) {
                stringHelper = String.valueOf(doubledNum);
                doubledNum = Character.getNumericValue(stringHelper.charAt(0)) + Character.getNumericValue(stringHelper.charAt(1));
            }
            str.replace(i, i + 1, doubledNum + "");
        }
        return str;
    }

    private int getNumberStringSum(StringBuilder str) {
        int sum = 0;
        for(int i = 0; i < str.length(); i++) {
            sum += Character.getNumericValue(str.charAt(i));
        }
        return sum;
    }


}
