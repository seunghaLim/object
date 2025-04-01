package v3.domain.discountCondition;

import v3.domain.Screening;

public interface DiscountCondition {
  boolean isSatisfiedBy(Screening screening);
}
