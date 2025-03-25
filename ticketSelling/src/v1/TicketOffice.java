package v1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {
  private long amount;
  private List<Ticket> tickets = new ArrayList<>();

  TicketOffice(long amount, Ticket ... tickets) {
    this.amount = amount;
    this.tickets.addAll(Arrays.asList(tickets));
  }

  public Ticket getTicket() {
    return tickets.remove(0);
  }

  public void minusAmount(long amount) {
    this.amount -= amount;
  }

  public void plusAmount(long amount) {
    this.amount += amount;
  }

}
