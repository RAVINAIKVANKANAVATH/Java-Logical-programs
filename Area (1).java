/* write a program to enter radius of circle and find the area?*/
import java.util.*;
class Areaofcircle{
  public static void main(String args[]){
    int r;
    float pi=3.14f;
    float area;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your radius");
    r=sc.nextInt();
    area=pi*r*r;
     System.out.println("The area of the circle is " + area);
  }
}