/*  JFM1T2_Assignment1:

     Write a program to perform the below actions and print the result.
     1. Difference of 2 numbers (30 and 10)
     2. Product of 2 numbers (45 and 2)
     3. Division of 2 numbers (600 and 10)
     4. Increment and Decrement the number (15)
     5. Remainder of 2 numbers (14 and 5)
     Prompt the user input from the terminal.
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class Operations {

//main method
public static void main(String args[]){
 // Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);



 // Take input from user
  System.out.println("Enter first number: ");
  int a=sc.nextInt();
  System.out.println("Enter second number: ");
  int b=sc.nextInt();
int d,p,di,r,id,ic,dc;
  int n=15;
  

//calculate difference,product,division,increment and remainder 
d=a-b;
 p=45*2;
di=600/10;
ic=n++;
dc=n--;
  r=14%5;
//print appropriate result for all operations
System.out.println("Difference of 2 numbers (30 and 10) is:"+d);
  System.out.println("Product of 2 numbers (45 and 2) is:"+p);
  System.out.println("Division of 2 numbers (600 and 10) is:"+di);
 System.out.println("Increment and Decrement the number (15)is:"+ic  +dc);
  System.out.println("Remainder of 2 numbers (14 and 5) is :"+r);
 }
}
