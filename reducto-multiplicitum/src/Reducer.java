public class Reducer {
    public int sumDigProd(int... numbers) {
        if(numbers.length == 1 && numbers[0] < 10) return numbers[0];
        int added = 0;
        for(int number : numbers) {
            added += number;
        }
        return multiply(added);
    }

    private int multiply(int number) {
        String stringNumber = String.valueOf(number);
        int product = 1;
        for(int i = 0; i < stringNumber.length(); i++) {
            product*=Character.getNumericValue(stringNumber.charAt(i));
        }
        if(product < 10 ) return product;
        return multiply(product);
    }
}
