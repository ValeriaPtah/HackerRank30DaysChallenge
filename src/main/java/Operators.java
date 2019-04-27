import static java.lang.Math.round;

/*
 * Day 2: Operators
 */

public class Operators {

  static void totalCost(double mealCost, int tipPercent, int taxPercent) {
    double tips = mealCost * tipPercent / 100;
    double tax = mealCost * taxPercent / 100;

    double totalCost = mealCost + tips + tax;
    System.out.println(round(totalCost));
  }
}
