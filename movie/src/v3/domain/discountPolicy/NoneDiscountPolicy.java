package v3.domain.discountPolicy;

import v3.domain.Money;
import v3.domain.Screening;

/**
 * DiscountPolicy 인터페이스 추가, 기존 DiscountPolicy 추상클래스를 DefaultDiscountPolicy로 변경
 * NoneDiscountPolicy는 이 DiscountPolicy를 상속받아 calculateDiscountAmount()만 오버라이딩함
 *
 * 이상적으로는 좋은 설계 vs NoneDiscountPolicy만을 위해 DiscountPolicy라는 인터페이스를 굳이 하나 더 만들어야 하나...?
 */
public class NoneDiscountPolicy implements DiscountPolicy {
  @Override
  public Money calculateDiscountAmount(Screening screening) {
    return Money.ZERO;
  }
}
