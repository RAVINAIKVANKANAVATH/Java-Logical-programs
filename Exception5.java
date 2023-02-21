/*
Write a program that simulates a bank account.
The program should allow the user to deposit, withdraw, and check their balance. Handle any possible exceptions that may occur 
InputMismatchException:This exception may occur if the user enters an invalid input type while performing transactions, such as entering a string instead of a number.
InsufficientFundsException: This exception may occur if the user tries to withdraw more money than their current balance.
FileNotFoundException: This exception may occur if there is an issue with accessing the file that stores the account information.
IOException: This exception may occur if there is an issue with input/output while reading or writing to the account file.
NumberFormatException: This exception may occur if the program tries to convert a string input to a numerical value, but the input is not a valid number.
NullPointerException: This exception may occur if the program tries to access an object that has not been initialized.
SecurityException: This exception may occur if the program tries to access a resource that it doesn't have permission to access.
*/

class Possibleexception extends Exception{
long deposit;
long withdraw;
Possibleexception(long deposit, long withdraw)
  {
this.deposit=deposit;
this.withdraw=withdraw;
  }
public String toString()
  { 
    return "Error .."+no+"...not eligible for vote";
  }
}
public class Exception5{
static void test(int no)throws NumberException
{
  if(no <18)
{
  throw new NumberException(no);
} 
  System.out.println("Value is.."+no);
}
  public static void main(String args[])
  {
  try{
    test(15);
  }
catch(NumberException ae)
{
System.out.println("NumberException :"+ae);
  }
}
}