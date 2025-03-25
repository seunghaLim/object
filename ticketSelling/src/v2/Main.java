package v2;

/**
 * Theater - TicketOffice 간 의존성 제거한 코드
 *
 * 이제 더 이상 TicketSeller가 티켓을 어떻게 판매하는지 Theater는 모름 (TicketSeller의 sellTo 메서드로 캡슐화함)
 * 하지만 여전히 Audience의 세부사항은 TicketSeller가 알고 있다는 점이 문제가 됨
 */
public class Main {
  public static void main(String[] args) {
    System.out.printf("Hello and welcome!");

    for (int i = 1; i <= 5; i++) {
      System.out.println("i = " + i);
    }
  }
}