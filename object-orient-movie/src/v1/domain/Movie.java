package v1.domain;

import v1.domain.discountCondition.DiscountPolicy;

import java.time.Duration;

public class Movie {
  private String title;
  private Duration runningTime;
  private Money fee;
  private DiscountPolicy discountPolicy;

  public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
    this.title = title;
    this.runningTime = runningTime;
    this.fee = fee;
    this.discountPolicy = discountPolicy;
  }

  public Money getFee() {
    return fee;
  }

  public Money calculateMovieFee(Screening screening) {
    /**
     * 할인할 금액을 계산하는 책임 - discountPolicy의 자식 클래스들에게 있었음
     * 이 조건문으로 인해 할인 금액이 0원이라는 사실을 Movie가 결정하게 됨
     * 할인 금액을 계산할 책임이 discountPolicy와 Movie 둘 다 갖게 됨 -> 일관성이 깨짐
     */
    return fee.minus(discountPolicy.calculateDiscountAmount(screening));
  }
}
