package v1.domain.discountPolicy;

import v1.domain.Screening;

public interface DiscountCondition {
  boolean isSatisfiedBy(Screening screening);
}
