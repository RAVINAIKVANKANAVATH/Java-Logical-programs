import java.util.*;

class findingelimint {
  public static void main(String args[]) {
    int i;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the array size:");
    
    int n = sc.nextInt();
    int arr[] = new int[n];

    System.out.println("enter the eliments in the array:");
    for (i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
      System.out.println("enter your search value:");
    int ser=sc.nextInt();
    for(i=0;i<n;i++){
      if(ser==arr[i]){
        System.out.println(ser+" is found");
        break;
      
      }
    }
    if(i==n){
        System.out.println(ser+" is not found");
    }
  }
}