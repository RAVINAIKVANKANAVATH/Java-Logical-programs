/* Write a Java Program to enter Consumer Number , Consumer Name , Present Month Reading, Last Month Reading,
Calculate Total units & Electricity bill and print the report.
Note: Cost per unit is 3.80*/
import java.util.*;
class Electricitybill{
  public static void main(String args[]){
   int cno,pmr,lmr,tu;
   String cname;
   double cbill;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter consumer number :");
    cno=sc.nextInt();
    System.out.println("enter consumer  name :");
    cname=sc.next();
    System.out.println("enter last month reading :");
    lmr=sc.nextInt();
    System.out.println("enter present month reading :");
    pmr=sc.nextInt();
    

    tu=pmr-lmr;
    cbill=tu*3.80;
    
    System.out.println("your consumer number is "+ cno);
    System.out.println("your consumer name is " + cname);
    System.out.println("your last month reading is " + lmr);
    System.out.println("your present month readingis " + pmr);
    System.out.println("total units of " + cno+ " is "+tu);
    System.out.println("current bill of " + cno+ " is "+cbill);

  }
}