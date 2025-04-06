package v2;

/**
 * 데이터 중심 어플리케이션 버전2
 *
 * - ReservationAgency - Reservation 객체를 반환하는 agency
 * - 버전 1과 비교했을 때 적어도 객체가 본인의 데이터를 본인이 관리하긴 하나 여전히 문제
 *
 * - 캡슐화 위반 (Movie의 calculateXXXFee나 DiscountCondition의 isDiscountable같은 인터페이스로 내부 구현 노출)
 * - 높은 결합도 (Movie와 DiscountCondition 사이 높은 결합도 존재 -할인 조건이 추가될 경우 Movie 내부 "구현"도 수정- )
 * - 낮은 응집도 (isDiscountable 메서드 파라미터가 수정된 경우 Screening 객체도 수정해야함)
 */
public class Main {
  public static void main(String[] args) {
    System.out.printf("Hello and welcome!");
  }
}