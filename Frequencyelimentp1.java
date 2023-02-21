/*frequency of the eliment finding*/
import java.util.*;
class Frequencyelimentp1{
  public static void main(String args[]){
    int n,i;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array size:");
    n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("enter eliments to array");
    for(i=0;i<a.length;i++)
     {
      a[i] = sc.nextInt();
      int visited=-1;
     int count=1;
      for(j=i+1;j<n;j++){
        if(arr[i]==arr[j]){
          count++;
          visited arr[j]=visited;
        }
      }
        
      }
  }
}