import static java.lang.Math.round;

public class Operators {

  // Complete the solve function below.
  static void totalCost(double mealCost, int tipPercent, int taxPercent) {
    double tips = mealCost * tipPercent / 100;
    double tax = mealCost * taxPercent / 100;

    double totalCost = mealCost + tips + tax;
    System.out.println(round(totalCost));
  }
}
