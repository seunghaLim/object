package v3.domain.discountPolicy;

import v3.domain.Money;
import v3.domain.Screening;
import v3.domain.discountCondition.DiscountCondition;

public class PercentDiscountPolicy extends DefaultDiscountPolicy {
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
