package exercice1;

import exercice1.EntierNaturel;

class Main {
  public static void main(String[] args) {
    

      try {
        EntierNaturel notreEntier = new EntierNaturel(15);
        System.out.println(notreEntier.getNaturel());
         EntierNaturel notreEntier2 = new EntierNaturel(-1);
      } catch (MauvaiseConstanteException e) {
        System.out.println(e.getMessage());
      }
  }
}