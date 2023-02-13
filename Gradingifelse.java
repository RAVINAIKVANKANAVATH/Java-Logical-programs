/*Take 3 subjects as input
 
find total & average
 
if  every subject above 40 marks print student pass otherwise fail
 
if student is pass then allot the grade based on the average
 
           if  average  below 50 ----> allot C Grade
 
           if  average  between 51-70  ----> allot B Grade        
 
           if  average  between 71-80  ----> allot A Grade        
 
          above 80 you need to print " Student Pass in Distension"*/
import java.util.Scanner;
 
class Gradingifelse {
  public static void main(String args[]) {
    int sno, m, p, c, tot;
    String sname;
    float savg;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Student Number:");
    sno = sc.nextInt();
    System.out.println("Enter Student Name:");
    sname = sc.next();
    System.out.println("Enter Student Marks:");
    m = sc.nextInt();
    p = sc.nextInt();
    c = sc.nextInt();
 
    tot = m + p + c;
    savg = (float) tot / 3;
 
    System.out.println(" STUDENT DETAILS ");
    System.out.println(" ----------------");
    System.out.println("The Student Number is : " + sno);
    System.out.println("The Student Name   is : " + sname);
    System.out.println("The Student Marks  is : ");
    System.out.println("Maths :" + m);
    System.out.println("Phys :" + p);
    System.out.println("Chemi :" + c);
    System.out.println("Student Total is :" + tot);
    System.out.println("Student average is :" + savg);
    if (m >= 40 && p >= 40 && c >= 40) {
      System.out.println("Result : Pass");
      if (savg <= 50)
        System.out.println("Grade : C");
      else if (savg >= 51 && savg <= 70)
        System.out.println("Grade : B");
      else if (savg >= 71 && savg <= 80)
        System.out.println("Grade : A");
      else
        System.out.println("Student Passed is Distension");
    } else {
      System.out.println("Result : Fail");
    }
  }
 
}