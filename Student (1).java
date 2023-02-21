import java.util.Scanner;

public class Student {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int sno, sname, m, p, c, stotal, savg;
    System.out.println("Enter sno,sname,m,p,c values:");
    sno = sc.nextInt();
    sname = sc.nextInt();
    m = sc.nextInt();
    p = sc.nextInt();
    c = sc.nextInt();

    stotal = m + p + c;

    savg = stotal / 3;

    System.out.println("student number:" + sno);
    System.out.println("student name:" + sname);
    System.out.println("maths:" + m);
    System.out.println("physics:" + p);
    System.out.println("chemistry:" + c);

  }
}