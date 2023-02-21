
/*Create a class that represents a rectangle, including the width and height. Write methods to calculate the area and perimeter of the rectangle.*/
import java.util.Scanner;
class areaperi{
  int area,peri;
  void add(int l,int b){

    area=l*b;
    peri=2*(l+b);
    System.out.println("area of the rectangle is:" +area);
    
System.out.println("peri of the rectangle is:" +peri);
    
  }
  
}


class Practice{
  public static void main(String args[]){
    int l,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter lenth value:");
l=sc.nextInt();

    System.out.println("Enter bredth value:");
    b=sc.nextInt();
    areaperi a1=new areaperi();
    a1.add(l,b);
  }
}