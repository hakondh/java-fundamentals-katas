public class CanComplete {
    public static void main(String[] args) {
        String letters = "butl";
        String word = "beautiful";
        System.out.println(letters + " -> " + word + ": " + canComplete(letters, word));
        letters = "butlz";
        System.out.println(letters + " -> " + word + ": " + canComplete(letters, word));
        letters = "tulb";
        System.out.println(letters + " -> " + word + ": " + canComplete(letters, word));
        letters = "bbutl";
        System.out.println(letters + " -> " + word + ": " + canComplete(letters, word));
        letters = "tfl";
        System.out.println(letters + " -> " + word + ": " + canComplete(letters, word));
        letters = "t";
        System.out.println(letters + " -> " + word + ": " + canComplete(letters, word));
    }

    private static boolean canComplete(String letters, String word) {
        boolean foundMatch;
        for(int i = 0; i < letters.length(); i++) {
            if(letters.charAt(i) != word.charAt(i)){
                foundMatch = false;
                for(int j = i + 1; j < word.length(); j++) {
                    if(letters.charAt(i) == word.charAt(j)) {
                        foundMatch = true;
                        break;
                    }
                }
                if(!foundMatch) return false;
            }
        }
        return true;
    }
}
