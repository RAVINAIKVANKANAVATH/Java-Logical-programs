/*To Remove Dublicate Elements in an Array*/
import java.util.*;
public class Dublicatremovearray1 {
 public static void main(String[] args) {
   int n;
   Scanner sc=new Scanner(System.in);
   int[] arr=new int[n];
   System.out.println("enter values values:");
   
   
   System.out.println("enter the array length:");
   n=sc.nextInt();
      
int j = 0;
 for (int i = 0; i < n; i++) {
 if (arr[i] != arr[j]) {
 arr[++j] = arr[i];
}
}
for (int i = 0; i <= j; i++) {
 System.out.print(arr[i] + " ");
}
 }
}