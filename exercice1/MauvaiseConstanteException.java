package exercice1;
import java.lang.Exception;

public class MauvaiseConstanteException extends Exception {
  private String msg;
  private int entier;
  

  public MauvaiseConstanteException(String msg) {
    super(msg);
    this.msg = msg;
  }

    public MauvaiseConstanteException(int entier) {
    super("Erreur de constante : " + entier);
    this.entier = entier;
  }
}