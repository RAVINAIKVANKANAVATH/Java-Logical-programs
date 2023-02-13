/*CircumferenceofRectangle*/
import java.util.*;
class Circumferenceofrectangle{
  public static void main(String args[]){
    int a,b;
    int area,peri;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a value");
    a=sc.nextInt();
    System.out.println("enter b value");
    b=sc.nextInt();
    area=a*b;
    peri=2*(a+b);
    System.out.println("The area of rectangle is " +area);
    System.out.println("The perimeter of rectangle is "+peri);
  }
}