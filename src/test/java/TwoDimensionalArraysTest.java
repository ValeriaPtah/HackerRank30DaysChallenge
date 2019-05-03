import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoDimensionalArraysTest {

  private int[][] test1 = new int[][]{
      {1, 1, 1, 0, 0, 0},
      {0, 1, 0, 0, 0, 0},
      {1, 1, 1, 0, 0, 0},
      {0, 0, 2, 4, 4, 0},
      {0, 0, 0, 2, 0, 0},
      {0, 0, 1, 2, 4, 0}
  };

  @Test
  void hourglassSumMax() {
    assertEquals(19, TwoDimensionalArrays.hourglassSumMax(test1));
  }
}