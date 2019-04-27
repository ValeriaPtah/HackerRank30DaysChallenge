import java.util.Scanner;
import java.util.stream.IntStream;

/*
 * Day 5: Loops
 */

public class Loops {

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scanner.nextInt();

    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    IntStream.rangeClosed(1, 10).forEachOrdered(i -> System.out.println(n + " x " + i + " = " + (n * i)));

    scanner.close();
  }
}
