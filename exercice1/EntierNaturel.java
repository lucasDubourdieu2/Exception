package exercice1;

public class EntierNaturel {

  private int naturel;

  public EntierNaturel(int naturel) throws MauvaiseConstanteException {
    if (naturel < 0) {
      throw new MauvaiseConstanteException(naturel);
    }
    this.naturel = naturel;
  }

  public int getNaturel() {
    return naturel;
  }

}