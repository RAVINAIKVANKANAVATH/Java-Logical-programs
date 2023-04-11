import java.util.*;
class peri{
  void add(int l,int b){
     peri = 2 * (l + b);
  }
}
class Pp {
  public static void main(String args[]) {
    int l, b, area, peri;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter length");
    l = sc.nextInt();
    System.out.println("enter bredth");
    b = sc.nextInt();
   
    area = l * b;
    System.out.println("area of the rectangle:" + area);
    System.out.println("perimeter of the rectangle:" + peri);
    peri a=new peri(x,y);
    a.add();
  }
}