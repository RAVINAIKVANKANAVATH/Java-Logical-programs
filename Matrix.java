import java.util.*;
class Matrix{
  public static void main(String args[]){
    int i=0;
    int j=0;
    Scanner sc=new Scanner(System.in);
    int arr[][]=new int[3][3];
    
    System.out.println("enter the values:");
    for(i=0;i<3;i++){
      for(j=0;j<3;j++){
      arr[i][j]=sc.nextInt();
      }
    }
    for(i=0;i<3;i++){
      for(j=0;j<3;j++){
        System.out.print(arr[i][j]);
      }
      System.out.println();
    }
    System.out.println(i+"  "+j);
    System.out.print(arr[i][j]);
    
  }
}