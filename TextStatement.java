import java.util.Enumeration;

public class TextStatement extends Statement {
  private String getInitialText(Customer aCustomer) {
    return "Rental Record for " + aCustomer.getName() +
        "\n";
    }

    private String getMovieTitleString(Rental rental) {
    return "\t" + rental.getMovie().getTitle() + "\t" +
        String.valueOf(rental.getCharge()) + "\n";
  }

  public String value(Customer aCustomer) {
    Enumeration rentals = aCustomer.getRentals();
    String result = getInitialText(aCustomer);
    while (rentals.hasMoreElements()) {
      Rental each = (Rental) rentals.nextElement();
      result += getMovieTitleString(each);
    }
    result += getFooterLines(aCustomer);
    return result;
  }
  
  private String getFooterLines(Customer aCustomer) {
    String result = "";
    result += "Amount owed is " +
        String.valueOf(aCustomer.getTotalCharge()) + "\n";
    result += "You earned " +
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        " frequent renter points";
    return result;
  }
}