import java.util.Scanner;

class Vowelconswitch {
  public static void main(String args[]) {
    char ch;

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter any charecter");
    ch = sc.next().charAt(0);

    switch (ch) {
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
      case 'A':
      case 'E':
      case 'I':
      case 'O':
      case 'U':
        System.out.println("Given charectores are vowel");
        break;
      default:
        System.out.println("Given charectores are Consonent:");

    }

  }

}