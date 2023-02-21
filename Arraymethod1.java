public class Arraymethod1{
 
  public void solution(int [] arr){
   //write your solution here
    int[] ar=new int[3];
    for(int i=1;i<arr.length;i++){
      ar[i-1]=arr[i];
    }
     for(int i=0;i<ar.length;i++){
      System.out.println(ar[i]);
    }
 
    
  }
 
  public static void main(String [] args){
 
    int[] arr1=new int[3];
 
    int [] a={10,20,30,40};
    Arraymethod1 obj=new Arraymethod1();
 
    obj.solution(a);
 
   
  }
  
}