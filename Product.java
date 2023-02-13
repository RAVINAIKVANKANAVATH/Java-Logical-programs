import java.util.Scanner;

public class Product {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int pno, pname, pcost, pqty, bamt;
    System.out.println("Enter pno,pname,pcost,pqty values:");
    pno = sc.nextInt();
    pname = sc.nextInt();
    pcost = sc.nextInt();
    pqty = sc.nextInt();

    bamt = pqty * pcost;

    System.out.println("Billing amount:" + bamt);
    System.out.println("Product number:" + pno);
    System.out.println("Product name:" + pname);
    System.out.println("Product cost:" + pcost);
    System.out.println("Product quantity:" + pqty);

  }
}