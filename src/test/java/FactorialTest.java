import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

  @Test
  void factorialTest() {
    assertEquals(362880, Factorial.factorial(9));
    assertEquals(1, Factorial.factorial(-6));
    assertEquals(479001600, Factorial.factorial(12));
  }
}