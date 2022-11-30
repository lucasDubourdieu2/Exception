package exercice1partie2;

import java.lang.Exception;

public class exercice1 {

  public void insererTableau(int valeur, int indice, int[] tableau) {
   try  {
     int[] nouveau = new int[tableau.length + 1];
     for (int i = 0; i < tableau.length; i++ ) {
       nouveau[i] = tableau[i];
     }
     tableau[indice] = valeur;

     for (int i = indice; i < tableau.length; i++) {
       nouveau[i + 1] = tableau[i];
     }
     tableau = nouveau;
   } catch (ArrayIndexOutOfBoundsException e) {
      e.printStackTrace();
      throw e;
   }
  }
}