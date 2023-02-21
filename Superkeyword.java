class base {
  int i = 10;
}

class derive extends base {
  int i = 20;

  void disp()
{
System.out.println("The i value in base class is:"+super.i);
System.out.println("The i value in derive class is:"+i);
   }
}

class Main {
      
  public static void main(String args[])
      {
             derive d1=new derive();
             d1.disp();
       }
}