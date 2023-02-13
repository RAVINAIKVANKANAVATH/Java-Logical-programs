import java.util.Scanner;

class Nested {
  public static void main(String args[]) {
    int a, b, c;

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the value a");
    a = sc.nextInt();
    System.out.println("Enter the value b");
    b = sc.nextInt();
    System.out.println("Enter the value c");
    c = sc.nextInt();

    if (a > b)
    {

    if (a > c)
      System.out.println("Enter 'a' is big");

    else {
      System.out.println("enter 'c' is big");
    }
    }
    else{
    if (b > c)
      System.out.println("Enter 'b' is big");
   else{
     System.out.println("c is big");
   }
    }
  }

  }
