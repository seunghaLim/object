package v1.domain.discountPolicy;

import v1.domain.Screening;

public class SequenceCondition implements DiscountCondition {
  private int sequence;

  public SequenceCondition(int sequence) {
    this.sequence = sequence;
  }

  @Override
  public boolean isSatisfiedBy(Screening screening) {
    return screening.isSequence(sequence);
  }
}
