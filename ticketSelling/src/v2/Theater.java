package v2;

public class Theater {
  private TicketSeller ticketSeller;

  Theater(TicketSeller ticketSeller) {
    this.ticketSeller = ticketSeller;
  }

  /**
   * Theater - ticketOffice 간 의존성 제거
   * Theater는 오직 ticketOffice의 인터페이스에만 의존함
   *
   * Theater는 ticketOffice에 대해 알지 못함 ticketSeller만 알고 있음
   * 즉 ticketSeller가 ticketOffice를 사용해서 티켓을 거래하는지 어떻게 거래하는지 그 방법은 Theater가 알지 못함
   */
  public void enter(Audience audience) {
    ticketSeller.sellTo(audience);
  }

}
