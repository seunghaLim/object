package v1;

public class TicketSeller {
  private TicketOffice ticketOffice;

  TicketSeller(TicketOffice ticketOffice) {
    this.ticketOffice = ticketOffice;
  }

  public TicketOffice getTicketOffice() {
    return ticketOffice;
  }
}
