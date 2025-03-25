package v1;

public class Theater {
  private TicketSeller ticketSeller;

  Theater(TicketSeller ticketSeller) {
    this.ticketSeller = ticketSeller;
  }

  /**
   * 관람객이 Bag를 들고 다닌다는 가정 하에 작성한 코드
   * 관람객이 Bag를 들고 다닌다는 가정이 변경되면
   * -> Audience 클래스를 변경해야할 뿐만 아니라 Theater의 enter 코드도 변경해야함
   *
   * Theater가 Audience의 Bag와 TicketSeller의 TicekOffice에 직접 접근함 즉 Theater가 Audience와 TicketSeller에 결합됨
   */
  public void enter(Audience audience) {
    if (audience.getBag().hasInvitation()) {
      Ticket ticket = ticketSeller.getTicketOffice().getTicket();
      audience.getBag().setTicket(ticket);
    } else {
      Ticket ticket = ticketSeller.getTicketOffice().getTicket();
      audience.getBag().minusAmount(ticket.getFee());
      ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
      audience.getBag().setTicket(ticket);
    }
  }

}
