package v1.domain.discountCondition;

import v1.domain.discountPolicy.DiscountCondition;
import v1.domain.Money;
import v1.domain.Screening;

public class PercentDiscountPolicy extends DiscountPolicy {
  private double percent;

  public PercentDiscountPolicy(Double percent, DiscountCondition... conditions) {
    super(conditions);
    this.percent = percent;
  }

  @Override
  protected Money getDiscountAmount(Screening screening) {
    return screening.getMovieFee().times(percent);
  }
}
