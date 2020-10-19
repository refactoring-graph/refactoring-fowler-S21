
public class HtmlStatement extends Statement {

  public String getHeader(Customer aCustomer) {
    return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
  }

  public String getRow(Rental rental) {
    return rental.getMovie().getTitle() + ": " + String.valueOf(rental.getCharge()) + "<BR>\n";
  }

  public String getFooter(Customer aCustomer) {
    return "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n" +
    "On this rental you earned <EM>" + String.valueOf(aCustomer.getTotalFrequentRenterPoints())
        + "</EM> frequent renter points<P>";
  }
}