import java.util.*;
class worker{
  String name;
  int empno;
  worker(int no,String n){
    empno=no;
    name=n;
  }
  void show()
  {
    System.out.println("\n--------------------------");
    System.out.println("enter employ number:"+empno);
    System.out.println("enter employ number:"+name);
  }
}
class daillyworker extends worker
  {
    int rate;
    daillyworker(int no,String n, int r){
      super(no, n);
      rate=r; 
    }
    void company(int h){
      show();
      System.out.println("salary:"+rate*h);
    }
  }
class salariedworker extends worker{
  int rate;
  salariedworker(int no,string n,int r){
    super(no,n);
    rate=r;
  }
  int hour=40;
  void company(){
    show();


    
    System.out.println("salary:"+rate*hours);
  }
}
class Practice{
  public static void main(String args[]){
    daillyworker d=new daillyworker(123,"ravi",50);
      salariedworker s=new salariedworker(111,"sushma",100);
      
      d.company(45);
      s.company();
  }
}