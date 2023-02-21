import java.util.Scanner;

class Switch {
  public static void main(String args[]) {
    int a,b,c,ch;

    Scanner sc = new Scanner(System.in);

    System.out.println("Calculator:");
    System.out.println("------------");
    System.out.println("[1].ADDITION:");
    System.out.println("[2].SUBSTRACTION:");
    System.out.println("[3].MULTIPLECATION:");
    System.out.println("[4].DIVISION:");
    System.out.println("[5].REMAINDER:");
    
    System.out.println("Enter your choice:");
    
    ch=sc.nextInt();
  if(ch<6)
  {
    System.out.println("Enter a,b values:");
    a=sc.nextInt();
    b=sc.nextInt();
  }
    switch(ch)
    {
      case 1:
        c=a+b
      System.out.println("The ADDITION value is:" +c);
        break;
         case 2:
        c=a-b;
        System.out.println("The SUBSTRACTION value is:" +c);
        break;
         case 3:
        c=a*b;
        System.out.println("MULTIPLECATION value is:" +c);
        break;
         case 4:
        c=a/b;
        System.out.println("DIVISION value is:" +c);
        break;
         case 5:
        c=a%b;
        System.out.println("REMAINDER value is:" +c);
        break;
        
      default:
        System.out.println("Wrong choice");
        
    }
  }
}