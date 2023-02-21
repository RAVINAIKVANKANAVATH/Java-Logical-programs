interface Student {
  public void details();

  int s_no;
  String s_name;
  int m;
  int p;
  int c;System.out.println("enter student number");s_no=sc.nextInt();System.out.println("enter student name");s_name=sc.next();System.out.println("enter maths marks");m=sc.nextInt();System.out.println("enter physics marks");p=sc.nextInt();System.out.println("enter chemistry marks");c=sc.nextInt();}

  public void marks();tot=(m+p+c);avg=(float)tot/3);
}}

interface report {
  public void grade();
}

class grading extends student data implements report{
  public void grade(){
    System.out.println("STUDENT DETAILS:");
    System.out.println("-----------------");
    System.out.println("the student number is:"+s_no);
     System.out.println("the student name is:"+s_name);
     System.out.println("maths marks is:"+m);
    System.out.println("physics marks is:"+p);
    System.out.println("chemistry marks is:"+c);
    System.out.println("total marks is:"+tot);
    System.out.println("avarage marks is:"+avg);
  }
}

public class Studentinterface {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    report result = new report();
    report.display();
  }
}
