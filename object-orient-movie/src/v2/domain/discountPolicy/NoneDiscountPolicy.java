package v2.domain.discountPolicy;

import v2.domain.Money;
import v2.domain.Screening;

/**
 * 할인 정책을 적용하지 않는 영화의 경우 NoneDiscountPolicy 사용, 할인 금액이 0원이라는 걸 DiscountPolicy 쪽에서 담당하도록 함
 *
 * 그러나 DiscountPolicy 쪽에서 이미 DiscountCondition이 없을 경우 Money.ZERO을 반환함
 * 따라서 NoneDiscountPolicy의 getDiscountAmount() 메서드는 호출될 일이 없이 Movie에서 Money.ZERO을 반환함
 */
public class NoneDiscountPolicy extends DiscountPolicy {
  @Override
  protected Money getDiscountAmount(Screening screening) {
    return Money.ZERO;
  }
}
