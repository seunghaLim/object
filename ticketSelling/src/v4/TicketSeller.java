package v4;

public class TicketSeller {
  private TicketOffice ticketOffice;

  TicketSeller(TicketOffice ticketOffice) {
    this.ticketOffice = ticketOffice;
  }

  public TicketOffice getTicketOffice() {
    return ticketOffice;
  }

  // ticketOffice가 본인의
  public void sellTo(Audience audience) {
    ticketOffice.sellTicketTo(audience);
  }

}
