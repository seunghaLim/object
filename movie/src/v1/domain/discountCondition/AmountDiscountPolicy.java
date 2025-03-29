package v1.domain.discountCondition;

import v1.domain.discountPolicy.DiscountCondition;
import v1.domain.Money;
import v1.domain.Screening;

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
