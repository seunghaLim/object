package v1;

public class Bag {
  private Ticket ticket;
  private Invitation invitation;
  private long amount;

  Bag (long amount) {
    this(amount, null);
  }

  Bag (long amount, Invitation invitation) {
    this.invitation = invitation;
    this.amount = amount;
  }

  public boolean hasInvitation() {
    return invitation != null;
  }

  public boolean hasTicket() {
    return ticket != null;
  }

  public void setTicket(Ticket ticket) {
    this.ticket = ticket;
  }

  public void minusAmount(long amount) {
    this.amount -= amount;
  }

  public void plusAmount(long amount) {
    this.amount += amount;
  }

}
