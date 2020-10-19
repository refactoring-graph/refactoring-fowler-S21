import java.util.Enumeration;

public class TextStatement extends Statement {
  public String value(Customer aCustomer) {
    Enumeration rentals = aCustomer.getRentals();
    String result = getHeader(aCustomer);

    while (rentals.hasMoreElements()) {
      Rental each = (Rental) rentals.nextElement();
      // show figures for this rental
      result += getRow(each);
    }
    // add footer lines
    result += getFooter(aCustomer);
    
    return result;
  }

  public String getHeader(Customer aCustomer) {
    return "Rental Record for " + aCustomer.getName() + "\n";
  }

  public String getRow(Rental rental) {
    return "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.getCharge()) + "\n";
  }

  public String getFooter(Customer aCustomer) {
    return "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n" +
    "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + " frequent renter points";
  }
}