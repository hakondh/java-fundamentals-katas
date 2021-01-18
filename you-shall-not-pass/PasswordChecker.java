import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordChecker {
    public static void main(String[] args) {
        String password = "password";
        System.out.println(password + ": " + checkPassword(password) + "\n");
        password = "11081992";
        System.out.println(password + ": " + checkPassword(password) + "\n");
        password = "@S3cur1ty";
        System.out.println(password + ": " + checkPassword(password) + "\n");
        password = "!@!pass1";
        System.out.println(password + ": " + checkPassword(password) + "\n");
        password = "mySecurePass123";
        System.out.println(password + ": " + checkPassword(password) + "\n");
        password = "pass word";
        System.out.println(password + ": " + checkPassword(password) + "\n");
        password = "stonk";
        System.out.println(password + ": " + checkPassword(password) + "\n");
    }

    private static String checkPassword(String password) {
        if(password.length() < 6) return "Invalid";

        // Check if there are special characters
        Pattern pattern = Pattern.compile("[^A-Za-z0-9]"); // Non special characters
        Matcher m = pattern.matcher(password);
        boolean hasSpecialCharacter = m.find();

        // Check the other criteria
        boolean hasLowercase = false;
        boolean hasUppercase = false;
        boolean hasSufficientLength = password.length() >= 8;
        boolean hasDigit = false;
        // Loop every char
        for(char c : password.toCharArray()) {
            if(Character.isWhitespace(c)) return "Invalid";
            else if(Character.isLowerCase(c)) hasLowercase = true;
            else if(Character.isUpperCase(c)) hasUppercase = true;
            else if(Character.isDigit(c)) hasDigit  = true;
        }
        int strength = countTrueFlags(
                hasLowercase,
                hasUppercase,
                hasSpecialCharacter,
                hasSufficientLength,
                hasDigit
        );

        // Create feedback (for the optional task)
        String feedback = "";
        if(!hasLowercase) feedback += "\n- Please add lowercase letters";
        if(!hasUppercase) feedback += "\n- Please add uppercase letters";
        if(!hasSufficientLength) feedback += "\n- Please use a length of at least 8";
        if(!hasDigit) feedback += "\n- Please include at least one digit";
        if(!hasSpecialCharacter) feedback += "\n- Please include at least one special character";
        System.out.println(feedback);

        return getResult(strength);
    }

    private static String getResult(int strength) {
        String msg = "";
        switch(strength) {
            case 1:
            case 2:
                msg = "Weak";
                break;
            case 3:
            case 4:
                msg = "Moderate";
                break;
            case 5:
                msg = "Strong";
                break;
        }
        return msg;
    }

    private static int countTrueFlags(boolean... flags) {
        int count = 0;
        for (boolean flag : flags) {
            if (flag) count++;
        }
        return count;
    }

}
