interface intrdemo
{
public void add();
public void disp();
}

class intfdemo implements intrdemo {
  
  int a = 10, b = 20, c;

  public void add()
{
 c=a+b;
}


  public void disp()
{
 System.out.println("The a value is :"+a);
 System.out.println("The b value is :"+b);
System.out.println("The addition value is :"+c );
}
}

  class Studentinterface {

public static void main(String args[])
{
intfdemo in=new intfdemo();
 in.add();
 in.disp();
}
}