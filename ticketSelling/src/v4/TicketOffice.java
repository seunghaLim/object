package v4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {
  private long amount;
  private List<Ticket> tickets = new ArrayList<>();

  TicketOffice(long amount, Ticket... tickets) {
    this.amount = amount;
    this.tickets.addAll(Arrays.asList(tickets));
  }

  // ticketOffice가 자신의 상태를 관리하게 캡슐화함 (ticketOffice의 인스턴스 멤버인 amount, tickets를 ticketOffice 스스로 관리함)
  // ticketOffice가 ticketSeller와 관계 없이 본인의 속성을 본인이 스스로 관리함으로써 ticketOffice의 자율도가 올라감
  // 다만 여기서 이전에 없었던 ticketOffice -> audience 간 의존도가 생성됨
  // 이전에는 ticketOffice가 audience 객체를 몰라도 됐었음 하지만 이렇게 코드를 바꾸면 매개변수로 audience를 받음으로써 ticketOffice가 audience를 의존하게됨

  // 여기서 발생하는 trade-off : ticketOffice의 자율성을 높이고 audience에 의존할 것인지 vs ticketOffice의 자율도를 낮추고 audience를 의존하지 않을 것인지
  public void sellTicketTo(Audience audience) {
    this.plusAmount(audience.buy(this.getTicket()));
  }

  // ticketOffice의 자율성을 높임으로써 아래 3개의 코드 모두 private으로 선언해도 문제없이 됨
  private Ticket getTicket() {
    return tickets.remove(0);
  }

  private void minusAmount(long amount) {
    this.amount -= amount;
  }

  private void plusAmount(long amount) {
    this.amount += amount;
  }

}
