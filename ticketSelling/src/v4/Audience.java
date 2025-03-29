package v4;

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
    return bag.hold(ticket);
  }


}
