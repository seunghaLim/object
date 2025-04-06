package v1.domain;

import v1.domain.constant.MovieType;

import java.time.Duration;
import java.util.List;

public class Movie {
  // 객체지향 설계와 동일
  private String title;
  private Duration runningTime;
  private Money fee;

  // 차이점 1 - DiscountCondition 리스트를 Movie의 인스턴스 변수로 갖고 있음
  private List<DiscountCondition> discountConditions;

  // 차이점 2 - 할인 정책을 Movie가 직접 계산하기 위해 discountAmount, discountPercent를 Moive가 들고 있음
  private MovieType movieType;      // 어떤 할인 정책을 갖는지에 대한 여용
  private Money discountAmount;     // 할인 액수
  private double discountPercent;   // 할인 비율

  public Money getFee() {
    return fee;
  }

  public void setFee(Money fee) {
    this.fee = fee;
  }

  public List<DiscountCondition> getDiscountConditions() {
    return discountConditions;
  }

  public void setDiscountConditions(List<DiscountCondition> discountConditions) {
    this.discountConditions = discountConditions;
  }

  public MovieType getMovieType() {
    return movieType;
  }

  public void setMovieType(MovieType movieType) {
    this.movieType = movieType;
  }

  public Money getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(Money discountAmount) {
    this.discountAmount = discountAmount;
  }

  public double getDiscountPercent() {
    return discountPercent;
  }

  public void setDiscountPercent(double discountPercent) {
    this.discountPercent = discountPercent;
  }
}
