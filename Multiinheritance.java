import java.util.*;
class A {
  int sno;
  String sname;
  int m,p,c;
  protected void getStudent(){
  
  Scanner sc=new Scanner(System.in);
System.out.println("enter student number:");
sno=sc.nextInt();
System.out.println("enter student name:");
sname=sc.next();
System.out.println("enter student maths marks:");
m=sc.nextInt();
System.out.println("enter student physics marks:");
p=sc.nextInt();
System.out.println("enter student chemistry marks:");
c=sc.nextInt();
}
  protected void showStudent(){
    System.out.println("student number is:"+sno);
    System.out.println("student name is:"+sname);
    System.out.println("student maths marks is:"+m);
    System.out.println("student physics marks is:"+p);
    System.out.println("student chemistry marks is:"+c);
    int tot;
    double savg;
    tot=m+p+c;
    savg=tot/3;
    System.out.println("student total marks is:"+tot);
    System.out.println("student marks avarage is:"+savg);
  }
class B{
 int tot;
float savg;
tot=m+p+c;
System.out.println("total marks is:"+tot);
savg=tot/3;
System.out.println("total marks is:"+savg);
}

  class C{
    char grad;
    report();
  }
}




  
  void add() {
    int c;

    c = a + b;
    System.out.println("The Addition is:" + c);
  }
}

class subtract extends addition {
  void fact() {
    int d;
    fact = fact + c;
    System.out.println("The factorial is:" + fact);
  }
}

class Multiinheritance {
  public static void main(String args[]) {
    subtract s = new subtract();
    s.add();
    s.fact();
  }
}