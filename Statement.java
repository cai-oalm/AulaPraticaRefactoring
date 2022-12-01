import java.util.Enumeration;
public abstract class Statement {

      abstract String getMovieTitleString(Rental rental);
  
  abstract String getFooterLines(Customer aCustomer);

    abstract String getInitialText(Customer aCustomer);
  
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
}