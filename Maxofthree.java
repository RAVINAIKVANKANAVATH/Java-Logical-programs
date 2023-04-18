/*Write a JAVAprogram to find maximum between three numbers.*/
import java.util.Scanner;  
public class Maxofthree  
{  
public static void main(String[] args)   
{  
int a, b, c, largest, temp;  
 
Scanner sc = new Scanner(System.in);  
System.out.println("Enter the first number:");  
a = sc.nextInt();  
System.out.println("Enter the second number:");  
b = sc.nextInt();  
System.out.println("Enter the third number:");  
c = sc.nextInt();   
 if (num1 >= num2 && num1 >= num3)
         System.out.println( num1 + " is the maximum number.");
      else if (num2 >= num1 && num2 >= num3)
         System.out.println( num2 + " is the maximum number.");
      else
         System.out.println( num3 + " is the maximum number."); 
}  
}  