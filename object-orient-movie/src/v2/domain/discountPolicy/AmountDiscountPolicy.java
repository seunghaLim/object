package v2.domain.discountPolicy;

import v2.domain.discountCondition.DiscountCondition;
import v2.domain.Money;
import v2.domain.Screening;

public class AmountDiscountPolicy extends DiscountPolicy {
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
