import java.util.Scanner;
class Equelcheck
  {
    public static void main(String args[])
    {
      int a,b,c;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the values a,b,c");
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
      if(a==b){
        if(a==c){
            System.out.println("Three integers are equal");
          }
        }
      
      else{
        System.out.println("Three integers are not equal");
      }
    }
  }