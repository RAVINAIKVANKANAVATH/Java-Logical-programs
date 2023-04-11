import java.util.Scanner;
 
class Addition 
{
  int a,b,c;
  Scanner sc=new Scanner(System.in);
   void add()n
   {
     System.out.println("Enter a,b values:");
     a=sc.nextInt();
     b=sc.nextInt();
     c=a+b;
     System.out.println("The Adddition value is:"+c);
   }
}
class Argument
{
  public static void main(String args[]) 
  {
      Addition a1=new Addition();
      a1.add();
    
  }
}