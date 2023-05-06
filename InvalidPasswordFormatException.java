/* 1. Write a program to create custom exception to validate password.
      Create InvalidPasswordFormatException and throw this exception
      whenever the user enters the password by not following the below conditions.
      ==> Password should contain at least one digit.
      ==> Password should contain at least one uppercase letter.
      ==> Password should contain at least one lowercase letter.
      ==> Password does not allow space and special characters.

  Sample Input: 
  Enter your password: Password@123
  Sample output: Valid password

  Sample Input: 
  Enter your password: abc123
  Sample output: java.lang.InvalidPasswordFormatException: "Sorry, Invalid passowrd"
*/
import java.util.Scanner;

class InvalidPasswordFormatException extends Exception {
    public InvalidPasswordFormatException(String message) {
        super(message);
    }
}

public class InvalidPasswordFormatException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        try {
            validatePassword(password);
            System.out.println("Valid password");
        } catch (InvalidPasswordFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validatePassword(String password) throws InvalidPasswordFormatException {
        boolean containsDigit = false;
        boolean containsUpperCase = false;
        boolean containsLowerCase = false;

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                containsDigit = true;
            } else if (Character.isUpperCase(c)) {
                containsUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                containsLowerCase = true;
            } else if (Character.isWhitespace(c) || !Character.isLetterOrDigit(c)) {
                throw new InvalidPasswordFormatException("Sorry, Invalid password");
            }
        }

        if (!containsDigit || !containsUpperCase || !containsLowerCase) {
            throw new InvalidPasswordFormatException("Sorry, Invalid password");
        }
    }
}

