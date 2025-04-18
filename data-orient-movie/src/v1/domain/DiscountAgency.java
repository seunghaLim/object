package v1.domain;

import v1.domain.constant.DiscountConditionType;

/**
 * DiscountAgency - 데이터 클래스들을 조합해서 영화 예매 절차를 구현하는 클래스
 */
public class DiscountAgency {
  public Reservation reserve(Screening screening, Customer customer, int audienceCount) {
    Movie movie = screening.getMovie();

    // 1) 할인 가능 여부 판단
    boolean discountable = false;
    for (DiscountCondition condition: movie.getDiscountConditions()) {
      if (condition.getType() == DiscountConditionType.PERIOD) {
        discountable = screening.getWhenScreened().getDayOfWeek().equals(condition.getDayOfWeek()) &&
                condition.getStartTime().compareTo(screening.getWhenScreened().toLocalTime()) <= 0 &&
                condition.getEndTime().compareTo(screening.getWhenScreened().toLocalTime()) >= 0;
      } else {
        discountable = condition.getSequence() == screening.getSequence();
      }

      if (discountable)
        break;
    }

    // 2) 할인 금액 계산
    Money fee;
    if (discountable) {
      Money discountAmount = Money.ZERO;
      switch(movie.getMovieType()) {
        case AMOUNT_DISCOUNT:
          discountAmount = movie.getDiscountAmount();
          break;
        case PERCENT_DISCOUNT:
          discountAmount = movie.getFee().times(movie.getDiscountPercent());
          break;
        case NONE_DISCOUNT:
          discountAmount = Money.ZERO;
          break;
      }
      fee = movie.getFee().minus(discountAmount).times(audienceCount);
    } else {
      fee = movie.getFee();
    }

    return new Reservation(customer, screening, fee, audienceCount);

  }
}

