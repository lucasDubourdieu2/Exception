package exercice3;

public class DateJour {

  private int jour;

  private int mois;

  private int anne;

  private static final int[] JOUR_PAR_MOIS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

  public DateJour(int jour, int mois, int anne) throws DateException {
    if (!estValide(jour, mois, anne)) {
      throw new DateException("Date invalide ! ");
    }
   
  }

  private static boolean estBissextile(int jour, int mois, int anne) {
    return annee % 400 == 0 || (annee % 100 == 0 && annee % 4 == 0);
  }

  private static boolean estValide(int jour, int mois, int anne) {
    boolean valide = true;
      if (jour < 0 || mois < 0 || anne < 0) {
        valide = false;
      } else if (jour > JOUR_PAR_MOIS[mois]) {
        valide = false;
      }
  }
}