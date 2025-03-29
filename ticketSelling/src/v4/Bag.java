package v4;

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

  // bag이 자신의 상태를 자신이 관리하게 캡슐화함 (bag의 인스턴스 멤버인 ticket, invitation, amount 전부 bag 안에서 관리됨)
  // bag이 audience와 관계 없이 본인의 속성을 본인이 관리함으로써 bag의 자율도가 올라감
  public long hold(Ticket ticket) {
    if (this.hasInvitation()) {
      this.setTicket(ticket);
      return 0L;
    } else {
      this.minusAmount(ticket.getFee());
      this.setTicket(ticket);
      return ticket.getFee();
    }
  }

  // 이 아래 필드는 전부 bag이 관리함으로써 private으로 막아도 이상 없음
  private boolean hasInvitation() {
    return invitation != null;
  }

  public boolean hasTicket() {
    return ticket != null;
  }

  private void setTicket(Ticket ticket) {
    this.ticket = ticket;
  }

  private void minusAmount(long amount) {
    this.amount -= amount;
  }

  private void plusAmount(long amount) {
    this.amount += amount;
  }

}
