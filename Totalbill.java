import java.util.Scanner;

public class Totalbill {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int mno, pmr, lmr, tu;

    String cname;
    double cbill;

    System.out.println("Enter eno,pmr,lmr values:");
    mno = sc.nextInt();
    pmr = sc.nextInt();
    lmr = sc.nextInt();

    tu = pmr - lmr;

    if (tu < 50)
      cbill = (tu*1.45);

    else if (tu<= 100)
      cbill = (50*1.45)+((tu-50)*2.56);

    else if (tu <= 200)
      cbill = (50*1.45)+(50*2.56)+((tu-100)*3.50);
    else
      cbill = (50*1.45)+(50 * 2.56)+(100 * 3.50)+((tu - 200) *5.67);

    System.out.println("meter number:" + mno);
    System.out.println("meter name:" + mno);
    System.out.println("present month reading:" + pmr);
    System.out.println("last month Reading:" + lmr);
    System.out.println("total unit:" + tu);
    System.out.println("cbill:" + cbill);

  }
}