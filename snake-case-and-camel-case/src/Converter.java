public class Converter {
    public String toCamelCase(String sentence) {
        StringBuilder converted = new StringBuilder();
        boolean isNewWord = false;
        char c;
        for(int i = 0; i < sentence.length(); i++) {
            c = sentence.charAt(i);
            if(c == '_') {
                isNewWord = true;
            }
            else {
                if(isNewWord) {
                    c = Character.toUpperCase(c);
                    isNewWord = false;
                }
                converted.append(c);
            }
        }
        return converted.toString();
    }

    public String toSnakeCase(String sentence) {
        StringBuilder converted = new StringBuilder();
        char c;
        for(int i = 0; i < sentence.length(); i++) {
            c = sentence.charAt(i);
            if(Character.isUpperCase(c)) converted.append('_').append(Character.toLowerCase(c));
            else converted.append(c);
        }
        return converted.toString();
    }

}
