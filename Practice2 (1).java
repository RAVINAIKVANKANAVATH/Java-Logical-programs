import java.util.*;
class student{
  void detail(){
    int sno,tot;
    float avg;
    string sname;
    int m,p,c;
   Scanner sc=new Scanner(System.in); 
    System.out.println("enter student number");
    sno=sc.nextInt();
    System.out.println("enter student name");
    sname=sc.next();
    System.out.println("enter student marks m,p,c");
    m=sc.nextInt();
    p=sc.nextInt();
    c=sc.nextInt();
  }
}

class result extends student{
  void resu(){
    int m,p,c,tot;
    float avg;
tot=m+p+c;
avg=(tot/3);
    System.out.println("total marks is:"+tot);
    System.out.println("total marks is:"+avg);
  }
}
class grade extends result{
  void grad(){
    if(m>=35 && p>=35 && c>=35)
      System.out.println("student pass");
   
    else
      System.out.println("student fail");
  }
}

class Practive2{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
    int m,p,c,tot;
    float avg;
   grade g=new grade();
    g.grade();
    g.resu();
    g.detail();
  }
}
