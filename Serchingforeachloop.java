
/*serching number each loop*/
import java.util.*;

public class Serchingforeachloop {
  public static void main(String[] args) {
 int sum=0;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the size of array");
 int size=sc.nextInt();
 int[] arr=new int[size];
 for(int i=0;i<arr.length;i++){
 System.out.println("Enter the element");
 arr[i]=sc.nextInt();
}
 for(int a: arr){
 if(a==30){
   System.out.println("Element is found");
 }
    }
  }

}
