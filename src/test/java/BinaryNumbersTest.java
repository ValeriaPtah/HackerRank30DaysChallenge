import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryNumbersTest {

  private List<Integer> test1 = Arrays.asList(1, 1, 1, 0);
  private List<Integer> test2 = Arrays.asList(1, 0, 1, 0, 1, 1, 0, 0, 1);

  @Test
  void toBinaryTest() {
    assertEquals(test1, BinaryNumbers.toBinary(14));
    assertEquals(test2, BinaryNumbers.toBinary(345));
  }

  @Test
  void countSequentialBitsTest() {
    assertEquals(3, BinaryNumbers.countSequentialBits(BinaryNumbers.toBinary(14)));
    assertEquals(2, BinaryNumbers.countSequentialBits(BinaryNumbers.toBinary(345)));
  }

  @Test
  void countSequentialZeroesTest() {
    assertEquals(0, BinaryNumbers.maxZeroGap(BinaryNumbers.toBinary(32)));
    assertEquals(2, BinaryNumbers.maxZeroGap(BinaryNumbers.toBinary(9)));
  }
}