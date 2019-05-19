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

  static int maxZeroGap(List<Integer> binary) {
    int max = 0;
    for (Integer bit : binary) {
      if (bit == 1) {
        int count = 0;
        for (int i = binary.indexOf(bit) + 1; i < binary.size() - 1; i++) {
          int zero = binary.get(i);
          count = (zero == 0 ? count + 1 : 0);
          if ((count > max) && (binary.get(i + 1) == 1)) {
            max = count;
          }
        }
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