package Bai9;

@SuppressWarnings("serial")
class InvalidBirthYearException extends Exception {
  public InvalidBirthYearException(String message) {
    super(message);
  }
}