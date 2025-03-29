package v3.domain;

import v3.domain.discountPolicy.DiscountPolicy;

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
    return fee.minus(discountPolicy.calculateDiscountAmount(screening));
  }

  // 실행 시점에 할인 정책을 변경 가능
  // Movie 객체 생성 시점에는 할인 금액 정책이 비율 할인이었음 (Movie.discountPolicy = percentDiscountPolicy)
  // 이후에 금액 정책으로 변경되면 아래 메서드를 통해 런타임에서도 변경 가능
  public void changeDiscountPolicy(DiscountPolicy discountPolicy) {
    this.discountPolicy = discountPolicy;
  }
}
