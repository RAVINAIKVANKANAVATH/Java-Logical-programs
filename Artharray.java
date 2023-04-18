public class Artharray {

  public static void main(String[] args) {
    try {
      int data = 120 / 0;
      System.out.println(data);
      int b[] = { 10, 20, 30 };
      b[50] = 100;
    }

    catch (ArithmeticException e) {
      System.out.println(e);
    } catch (ArrayIndexOutOfBoundsException ae) {
      System.out.println(ae);
    } finally {
      System.out.println("rest of the code");
    }

  }

}
