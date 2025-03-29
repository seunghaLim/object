package v3;

public class Audience {
  private Bag bag;

  Audience(Bag bag) {
    this.bag = bag;
  }

//  더 이상 Bag 객체를 외부에 공개할 필요가 없어짐
//  public Bag getBag() {
//    return bag;
//  }

  public long buy(Ticket ticket) {
    if (bag.hasInvitation()) {
      bag.setTicket(ticket);
      return 0L;
    } else {
      bag.minusAmount(ticket.getFee());
      bag.setTicket(ticket);
      return ticket.getFee();
    }
  }


}
