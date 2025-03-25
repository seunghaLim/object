package v2;

public class TicketSeller {
  private TicketOffice ticketOffice;

  TicketSeller(TicketOffice ticketOffice) {
    this.ticketOffice = ticketOffice;
  }

//   ticketOffice를 외부에 노출할 필요가 없어짐
//  public TicketOffice getTicketOffice() {
//    return ticketOffice;
//  }

  public void sellTo(Audience audience) {
    if (audience.getBag().hasInvitation()) {
      Ticket ticket = this.ticketOffice.getTicket();
      audience.getBag().setTicket(ticket);
    } else {
      Ticket ticket = this.ticketOffice.getTicket();
      audience.getBag().minusAmount(ticket.getFee());
      this.ticketOffice.plusAmount(ticket.getFee());
      audience.getBag().setTicket(ticket);
    }
  }

}
