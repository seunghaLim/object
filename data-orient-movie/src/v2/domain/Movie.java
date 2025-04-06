package v2.domain;

import v2.domain.constant.DiscountConditionType;
import v2.domain.constant.MovieType;

import java.time.Duration;
import java.time.LocalDateTime;
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

  public void setDiscountConditions(List<DiscountCondition> discountConditions) {
    this.discountConditions = discountConditions;
  }

  public MovieType getMovieType() {
    return movieType;
  }

  public Money calculateAmountDiscountedFee() {
    if (movieType != MovieType.AMOUNT_DISCOUNT) {
      throw new IllegalArgumentException();
    }

    return fee.minus(discountAmount);

  }

  public Money calculatePercentDiscountedFee() {
    if (movieType != MovieType.PERCENT_DISCOUNT) {
      throw new IllegalArgumentException();
    }

    return fee.minus(fee.times(discountPercent));
  }

  public Money calculateNoneDiscountedFee() {
    if (movieType != MovieType.NONE_DISCOUNT) {
      throw new IllegalArgumentException();
    }

    return fee;
  }

  public boolean isDiscountable(LocalDateTime whenScreened, int sequence) {
    for (DiscountCondition condition: discountConditions) {
      if (condition.getType() == DiscountConditionType.PERIOD) {
        if (condition.isDiscountable(whenScreened.getDayOfWeek(), whenScreened.toLocalTime())) {
          return true;
        }
      } else {
        if (condition.isDiscountable(sequence)) {
          return true;
        }
      }
    }
    return false;
  }


}
