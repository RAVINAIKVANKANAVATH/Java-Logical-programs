class base
{
void disp()
{
System.out.println("Its Base Class Method");
}
}
class derive extends base
{
void disp()
{
super.disp();
System.out.println("Its Derive Class Method");
}
}
class Abstact
{
 public static void main(String args[])
{
 derive d=new derive();
 d.disp();         
}
}