import java.util.Enumeration;

public class TextStatement extends Statement {
  String getInitialText(Customer aCustomer) {
    return "Rental Record for " + aCustomer.getName() +
        "\n";
    }

    String getMovieTitleString(Rental rental) {
    return "\t" + rental.getMovie().getTitle() + "\t" +
        String.valueOf(rental.getCharge()) + "\n";
  }

  String getFooterLines(Customer aCustomer) {
    String result = "";
    result += "Amount owed is " +
        String.valueOf(aCustomer.getTotalCharge()) + "\n";
    result += "You earned " +
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        " frequent renter points";
    return result;
  }
}