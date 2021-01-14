import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 1, 7, 9, 5, 11, 3, 5};

        int biggestDifference = 0;
        int smallerIndex = 0;
        int biggerIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                int difference = numbers[j] - numbers[i];
                if(difference > biggestDifference) {
                    biggestDifference = difference;
                    smallerIndex = i;
                    biggerIndex = j;
                }
            }
        }

        ArrayList<int[]> pairs = new ArrayList<>();
        int biggerPairIndex;
        int smallerPairIndex;
        for (int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[j] + numbers[i];
                if(sum == biggestDifference) {
                    smallerPairIndex = i;
                    biggerPairIndex = j;
                    pairs.add(new int[]{smallerPairIndex, biggerPairIndex});
                }
            }
        }

        System.out.println("\n" +  biggestDifference);
        System.out.println(
                biggestDifference + " = " + numbers[biggerIndex] + "(" + biggerIndex + ") - " +
                numbers[smallerIndex] + "(" + smallerIndex + ")\n"
        );

        for(int[] pair : pairs) {
            System.out.println(
                    numbers[pair[0]] + "(" + pair[0] + ") + " + numbers[pair[1]] + "(" + pair[1] + ") = 10"
            );
        }

    }
}
