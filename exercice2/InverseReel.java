package exercice2;

import java.lang.Exception;

public class InverseReel {

  public static double inverse(double reel) throws IllegalArgumentException {
    try {
      return 1 / reel;
    } catch (ArithmeticException e) {
      return 0;
    }

  }

}