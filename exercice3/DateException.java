package exercice3;

public class DateException extends Exception {
  private String msg;

  public DateException(String msg) {
    super(msg);
    this.msg = msg;
  }
}