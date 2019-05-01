/*
 * Day 9: Recursion 3
 */

class Factorial {

  static int factorial(int n) {
    if (n <= 1) {
      return 1;
    }
    else {
      return n * factorial(n - 1);
    }
  }
}