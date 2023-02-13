import java.util.Scanner;

public class Electricity {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int mno, pmr, lmr, tu;
    
    String cname;
    float cbill;
    
    System.out.println("Enter eno,pmr,lmr values:");
    mno = sc.nextInt();
    pmr = sc.nextInt();
    lmr = sc.nextInt();
    
    

    tu= pmr-lmr;

    cbill=tu*3.80;

    System.out.println("meter number:" + mno);
    System.out.println("meter name:" + mno);
    System.out.println("present month reading:" + pmr);
    System.out.println("last month Reading:" + lmr);
    System.out.println("total unit:" + tu);
    System.out.println("cbill:" + );

  }
}