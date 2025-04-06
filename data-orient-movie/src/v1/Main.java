package v1;

/**
 * 데이터 중심 어플리케이션 버전1
 *
 * - DiscountAgency - 할인 여부를 판단하고 할인액을 적용하는 객체
 * - 캡슐화 위반 (과도하게 많은 getter와 setter가 필요)
 * - 높은 결합도 (DiscountAgency 하나가 모든 객체를 알고 있음)
 * - 낮은 응집도 (새로운 DiscountCondition이 추가된 경우 DiscountConditionType, DiscountAgency, Movie 객체를 모두 수정해야함
 */
public class Main {
  public static void main(String[] args) {
    System.out.printf("Hello and welcome!");
  }
}