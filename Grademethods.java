/*Write a program to determine the grade of a student based on their marks.*/
import java.util.Scanner;
class studentdetai{
  Scanner sc=new Scanner(System.in);
  void add(){
   String sname;
    int sno;
    int m,p,c;
    int tot;
    float savg;
    
    
    System.out.println("enter student name:");
    sname=sc.next();
    System.out.println("enter student number:");
    sno=sc.nextInt();
     System.out.println("enter student maths marks:");
    m=sc.nextInt();
     System.out.println("enter student Physics marks:");
    p=sc.nextInt();
     System.out.println("enter student chemistry marks:");
    c=sc.nextInt();

  tot= m+p+c;
  savg=tot/3;
     System.out.println(" STUDENT DETAILS ");
    System.out.println(" ----------------");
   
    System.out.println("The Student Number is : " + sno);
    System.out.println("The Student marks is : " );
    System.out.println("maths:" +m);
    System.out.println("physics:" +p);
    System.out.println("Chemistry:" +c);

     System.out.println("Student total is :" +tot);
    System.out.println("Student average is :" +savg);


    if (m >= 35 && p >= 35 && c >= 35) {
      System.out.println("Result : Pass");
      if(savg <=50)
        System.out.println("it is Grade :C");
      else if(savg>=51 && savg<=70)
        System.out.println("it is Grade :B");
      else if(savg>=71 && savg<=80)
        System.out.println("it is Grade :A");
      else
      System.out.println("student passed in Distension");
    }
    else
    {
      System.out.println("Result: fail");
    }
  }
  
  }
class Grademethods{
  
  public static void main(String args[]){
    
    
     System.out.println("The Student name is : " + sname);
    
studentdetai a1=new studentdetai();
    a1.add();
    
  }
}