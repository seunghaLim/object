package v2.domain.discountCondition;

import v2.domain.Screening;

public interface DiscountCondition {
  boolean isSatisfiedBy(Screening screening);
}
