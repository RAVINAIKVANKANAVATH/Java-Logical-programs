import java.util.*;
class max{
 void add(int a, int b){


   if(a>b)
    System.out.println("max is:" +a);
  else
    System.out.println("max is:" +b);
  
   
}
}

class Maxmethod{
  public static void main(String args[]){
      int a,b;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a value:");
  a=sc.nextInt();
  System.out.println("Enter b value:");
   b=sc.nextInt();
  
    max a1=new max();
    a1.add(a,b);
    
  }
}