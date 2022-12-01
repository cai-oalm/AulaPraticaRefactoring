import java.util.Enumeration;

public class HtmlStatement extends Statement {
    String getInitialText(Customer aCustomer) {
    return "<H1>Rentals for <EM>" + aCustomer.getName() +
        "</EM></H1><P>\n";
  }
  
      String getMovieTitleString(Rental rental) {
    return rental.getMovie().getTitle() + ": " +
        String.valueOf(rental.getCharge()) + "<BR>\n";
  }

  String getFooterLines(Customer aCustomer) {
    String result = "";
    result += "<P>You owe <EM>" +
        String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
    result += "On this rental you earned <EM>" +
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        "</EM> frequent renter points<P>";
    return result;
  }
}