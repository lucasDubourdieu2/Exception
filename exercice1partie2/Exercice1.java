package exercice1partie2;

import java.lang.Exception;

public class Exercice1 {

  public static int[] insererTableau(int valeur, int indice, int[] tableau) {
   try  {
     int[] nouveau = new int[tableau.length + 1];
     for (int i = 0; i < indice; i++ ) {
       nouveau[i] = tableau[i];
     }
     nouveau[indice] = valeur;

     for (int i = indice; i < tableau.length; i++) {
       nouveau[i + 1] = tableau[i];
     }
     return nouveau;
   } catch (ArrayIndexOutOfBoundsException e) {
      e.printStackTrace();
      throw e;
   }
  }
}