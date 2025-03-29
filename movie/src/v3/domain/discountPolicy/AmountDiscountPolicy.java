package v3.domain.discountPolicy;

import v3.domain.Money;
import v3.domain.Screening;
import v3.domain.discountCondition.DiscountCondition;

public class AmountDiscountPolicy extends DefaultDiscountPolicy {
  private Money discountAmount;

  public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
    super(conditions);
    this.discountAmount = discountAmount;
  }

  @Override
  protected Money getDiscountAmount(Screening screening) {
    return discountAmount;
  }
}
