import java.util.*;
class palindrom{
  int n;
    int rev = 0;
    int rem = 0;
  void palin()
  {
int temp=n;
   while (n > 0) { 
      rem = n % 10; 
      rev = rev * 10 + rem;
      n = n / 10; 
}

if(temp==rev){
System.out.println("palindrom");
}
else
  System.out.println("not palindrom");
  }
  void palin(int x)
  {
int temp=n;
   while (n > 0) { 
      rem = n % 10; 
      rev = rev * 10 + rem;
      n = n / 10; 
   }

    if(temp==rev)
    System.out.println("palindrom");
    else
  System.out.println("not palindrom");
}
}
     class Moverload
       {
public static void main(String args[])
{
palindrom f1=new palindrom();
 f1.palin(121);
f1.palin(122);
}
}
       
