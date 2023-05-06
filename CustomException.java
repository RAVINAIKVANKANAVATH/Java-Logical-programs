/* 2. Write a program to create custom exception to perform deposit and withdraw options. 
      Create InvalidAmountException and throw this exception whenever user trying to deposit or withdraw invalid amount. 
      Deposit and withdraw amount should be multiples of 100 and it should be positive value.
*/
import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super("Insufficient funds");
    }
}

class InvalidAmountException extends Exception {
    public InvalidAmountException() {
        super("Invalid amount");
    }
}

class Account {
    private double balance;

    public Account(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0 || amount % 100 != 0) {
            throw new InvalidAmountException();
        }
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount <= 0 || amount % 100 != 0) {
            throw new InvalidAmountException();
        }
        if (balance < amount) {
            throw new InsufficientFundsException();
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class CustomException {
    public static void main(String[] args) {
        Account account = new Account(1000.0);
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter the amount to withdraw: ");
            double amount = scanner.nextDouble();
            account.withdraw(amount);
            System.out.println("Withdrawal successful");
        } catch (InsufficientFundsException e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
        } catch (InvalidAmountException e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
        }

        try {
            System.out.print("Enter the amount to deposit: ");
            double amount = scanner.nextDouble();
            account.deposit(amount);
            System.out.println("Deposit successful");
        } catch (Exception e) {
            System.out.println("Deposit failed: " + e.getMessage());
        }

        System.out.println("Current balance: " + account.getBalance());
    }
}
