
/*Write a Java program to find the longest word in a given string using loops.*/
import java.util.*;

class Loongestword {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a Sentence:");
    String str = sc.nextLine();
    // str +=" ";
    String word = " ";
    String lword = " ";
    int len = str.length();
    for (int i = 0; i < len; i++) {
      char ch = str.charAt(i);
      if (ch != ' ') {
        word += ch;
      } else {
        if (word.length() > lword.length()) {
          lword = word;
        }
        word = "";

      }

    }
    System.out.println("largest word is:" + lword);
    System.out.println("length of largest word is:" + lword.length());

  }

}
