public class Exception {

  public static void main(String[] args) {
    try {
      int data = 120 / 0;
      System.out.println(data);
    }

    catch (ArithmeticException e) {
      System.out.println(e);
    }
    System.out.println("rest of the code");
  }

}
