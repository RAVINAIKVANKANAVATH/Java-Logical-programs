/*argument to method*/
import java.util.Scanner;
 
class Addition 
{
  int c;
   void add(int a,int b)
   {
     c=a+b;
     System.out.println("The Adddition value is:"+c);
   }
}
class Arrrgu
{
  public static void main(String args[]) 
  {
    int x,y;
      Scanner sc=new Scanner(System.in);
       System.out.println("Enter x,y values:");
     x=sc.nextInt();
     y=sc.nextInt();
      Addition a1=new Addition();
      a1.add(x,y);
    
  }
}