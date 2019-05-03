import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Day 11: 2D Arrays
 */

class TwoDimensionalArrays {

  private static final int squareLength = 6;

  static int hourglassSumMax(int[][] matrix) {
    List<Integer> hourglassSums = new ArrayList<>();
    for (int i = 0; i < squareLength - 2; i++) {
      for (int j = 0; j < squareLength - 2; j++) {
        int sum = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2]
            + matrix[i + 1][j + 1] +
            matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2];
        hourglassSums.add(sum);
      }
    }
    return Collections.max(hourglassSums);
  }
}