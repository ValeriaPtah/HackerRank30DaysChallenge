import java.util.ArrayList;
import java.util.List;

/*
 * Day 10: Binary Numbers
 */

class BinaryNumbers {

  static int countSequentialBits(List<Integer> binary) {
    int count = 0, max = 0;
    for (Integer bit : binary) {
      count = (bit == 1 ? count + 1 : 0);
      if (count > max) {
        max = count;
      }
    }
    return max;
  }

  static List<Integer> toBinary(int decimal) {
    List<Integer> binary = new ArrayList<>();
    while (decimal > 0) {
      binary.add(0, decimal % 2);
      decimal /= 2;
    }
    return binary;
  }
}