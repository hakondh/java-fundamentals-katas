import java.util.regex.Pattern;

class PascalCaseConverter {
    public static void main(String[] args){
        String sentence = "The qUiCk! brOwN fox      juMpeD, OVER the lazy.dog.";
        String convertedSentence = "";
        char c;
        boolean isNewWord = true;

        for(int i = 0; i < sentence.length(); i++) {
            
            c = sentence.charAt(i);
            // Whitespace or a punctuation
            if(c == ' ' || Pattern.matches("\\p{Punct}", Character.toString(c))) {
                isNewWord = true; 
                continue; // Don't add this char
            }
            // The beginning of a new word
            else if(isNewWord){
                c = Character.isLowerCase(c) ? Character.toUpperCase(c) : c; // Check if it's already uppercase
                isNewWord = false;
            }
            // Fix irregular captialization
            else c = Character.isUpperCase(c) ? Character.toLowerCase(c) : c;
            
            // Add the character
            convertedSentence += c;
        }
        System.out.println("\n" + convertedSentence);
    } 
}