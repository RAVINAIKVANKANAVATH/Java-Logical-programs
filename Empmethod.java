import java.util.*;
class emp{
  String ename;
  int eno;
  float esal;
  Scanner sc=new Scanner(System.in);

  void add(){
    System.out.println("enter employ name:");
    ename:sc.next();
     System.out.println("enter employ number:");
    eno:sc.nextLong();
     System.out.println("enter employ salary:");
    esal:sc.next();
    
    System.out.println("employ name is:" +ename);
    System.out.println("employ number is:" +eno);
    System.out.println("employ salary is:" +esal);
  }
}

class Empmethod{
  public static void main(String args[]){
    emp d1=new emp();
    d1.add();
  }
}