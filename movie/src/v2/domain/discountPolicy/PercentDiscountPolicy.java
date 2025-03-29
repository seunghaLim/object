package v2.domain.discountPolicy;

import v2.domain.discountCondition.DiscountCondition;
import v2.domain.Money;
import v2.domain.Screening;

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
