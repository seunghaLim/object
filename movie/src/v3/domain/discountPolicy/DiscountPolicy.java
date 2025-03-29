package v3.domain.discountPolicy;

import v3.domain.Money;
import v3.domain.Screening;

public interface DiscountPolicy {
  Money calculateDiscountAmount(Screening screening);
}
