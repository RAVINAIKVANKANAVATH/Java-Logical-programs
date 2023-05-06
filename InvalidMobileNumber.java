/* 3.Write a program to create custom exception to validate mobile number. Create InvalidMobileNumber and throw this exception 
   whenever user enters the mobile number by not following the below conditions.

  ==> mobile number should contain only digits.
  ==> mobile number should contain only 10 digits.
  ==> mobile number should start with 9 or 8 or 7 or 6.

  Sample input: 
  Enter your mobile number: 4565333953
  Sample output: java.lang.InvalidMobileNumber: "Invalid mobile number"

  Sample input: 
  Enter your mobile number: 9884533953
  Sample output: Valid Mobile number
*/
/*
public class InvalidMobileNumber {

    public static void main(String args[]) {

    }
}
*/
import java.util.Scanner;

class InvalidMobileNumber extends Exception {
    public InvalidMobileNumber(String message) {
        super(message);
    }
}

public class InvalidMobileNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your mobile number: ");
        String mobileNumber = scanner.nextLine();

        try {
            validateMobileNumber(mobileNumber);
            System.out.println("Valid Mobile number");
        } catch (InvalidMobileNumber e) {
            System.out.println(e.getMessage());
        }
    }

    private static void validateMobileNumber(String mobileNumber) throws InvalidMobileNumber {
        if (!mobileNumber.matches("[0-9]+")) {
            throw new InvalidMobileNumber("Invalid mobile number");
        }

        if (mobileNumber.length() != 10) {
            throw new InvalidMobileNumber("Invalid mobile number");
        }

        char firstDigit = mobileNumber.charAt(0);
        if (firstDigit != '9' && firstDigit != '8' && firstDigit != '7' && firstDigit != '6') {
            throw new InvalidMobileNumber("Invalid mobile number");
        }
    }
}
