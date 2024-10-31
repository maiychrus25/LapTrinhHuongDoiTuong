package Bai10;

@SuppressWarnings("serial")
class InvalidRentalPriceException extends Exception {
  public InvalidRentalPriceException(String message) {
    super(message);
  }
}