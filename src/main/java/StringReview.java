import java.util.Scanner;

/*
 * Day 6: Let's Review
 */

public class StringReview {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int lineCount = scan.nextInt();
    scan.nextLine();

    for (int i = 0; i < lineCount; i++) {
      String str = scan.nextLine();
      for (int j = 0; j < str.length(); j += 2) {
        System.out.print(str.charAt(j));
      }
      System.out.print(" ");
      for (int j = 1; j < str.length(); j += 2) {
        System.out.print(str.charAt(j));
      }
      System.out.println();
    }
  }

}

