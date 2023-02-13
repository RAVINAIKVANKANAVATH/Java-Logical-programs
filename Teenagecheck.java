/*Write a program that takes an age as input and checks if the person is a teenager (between 13 and 19 inclusive) or an adult (20 and above) using nested if statements.*/
import java.util.*;
class Teenagecheck{
  public static void main(String args[]){
    int age;
    String name;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your age :");
    age=sc.nextInt();
    
    if(age>=13 ){
      if( age<=19)
      System.out .println("he is a teen ager");
    else
      System.out .println("he is a adult ager");
    }
    else
      System.out .println("he is not a teen ager or adult");
  }
}