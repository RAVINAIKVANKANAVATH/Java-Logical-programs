
/*import java.util.Scanner;
 
class Addition 
{
  int a,b,c;
  Scanner sc=new Scanner(System.in);
   void add()
   {
     System.out.println("Enter a,b values:");
     a=sc.nextInt();
     b=sc.nextInt();
     c=a+b;
     System.out.println("The Adddition value is:"+c);
   }
}
class Calcualte
{
  public static void main(String args[]) 
  {
      Addition a1=new Addition();
      a1.add();
    
  }
}

argument to method
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
class Calcualte
{
  public static void main(String args[]) 
  {
    int x,y;
      Scanner sc=new Scanner(System.in);
       System.out.println("Enter a,b values:");
     x=sc.nextInt();
     y=sc.nextInt();
      Addition a1=new Addition();
      a1.add(x,y);
    
  }
}
*/
import java.util.Scanner;

class Addition {
  int c;

  int add(int a, int b) {
    c = a + b;
    return c;
  }
}

class Allmethod {
  public static void main(String args[]) {
    int x, y, z;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a,b values:");
    x = sc.nextInt();
    y = sc.nextInt();
    Addition a1 = new Addition();
    z = a1.add(x, y);
    System.out.println("The Adddition value is:" + z);

  }
}
/*
 * import java.util.Scanner;
 * 
 * class Addition { 
int a, b, c; 
Scanner sc = new Scanner(System.in);
 * 
 * int add() { 
System.out.println("Enter a,b values:"); 
a = sc.nextInt(); 
b =
 * sc.nextInt();
c = a + b;
return c;
} 
}
 * 
 * class Calcualte {
public static void main(String args[]) {
int z;
 * 
 * Addition a1 = new Addition(); 
z = a1.add();
 * System.out.println("The Adddition value is:" + z);
 * 
 * } 
}
 */