package v3;

public class TicketSeller {
  private TicketOffice ticketOffice;

  TicketSeller(TicketOffice ticketOffice) {
    this.ticketOffice = ticketOffice;
  }

  public TicketOffice getTicketOffice() {
    return ticketOffice;
  }

  public void sellTo(Audience audience) {
    ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
  }

}
