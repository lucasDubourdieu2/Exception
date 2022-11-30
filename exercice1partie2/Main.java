package exercice1partie2;

import exercice1partie2.Exercice1;

public class Main {

  public static void main(String... args) {
    int[] tab = { 1, 2, 3, 4, 5, 6 };
    for (int i : Exercice1.insererTableau(8, 2, tab)) {
       System.out.print(i);
    }
   
  }
}