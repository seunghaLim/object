package v1.domain;

import v1.domain.constant.DiscountConditionType;

import java.time.DayOfWeek;
import java.time.LocalTime;

/**
 * DiscountCondition - 할인 조건에 충족하는지 판별하기 위한 클래스
 *
 * 할인 조건에는 기간에 따라 할인 여부를 결정하는 기간 조건 / 순번에 따라 할인 여부를 결정하는 순번 조건이 있음
 * 따라서 데이터 중심 설계에서는 DiscountCondition이 기간 데이터(dayOfWeek / startTime/ endTime)와 순번 데이터(sequence)를 가짐
 */
public class DiscountCondition {
  private DiscountConditionType type;     // 할인 조건의 타입을 결정하는 enum 데이터 (순번 할인 조건인지 / 기간 할인 조건인지)

  // 순번 할인 조건인지 판별하는데 필요한 순번 데이터
  private int sequence;

  // 기간 할인 조건인지 판별하는데 필요한 기간 데이터 (dayOfWeek / startTime/ endTime)
  private DayOfWeek dayOfWeek;
  private LocalTime startTime;
  private LocalTime endTime;

  public DiscountConditionType getType() {
    return type;
  }

  public void setType(DiscountConditionType type) {
    this.type = type;
  }

  public int getSequence() {
    return sequence;
  }

  public void setSequence(int sequence) {
    this.sequence = sequence;
  }

  public DayOfWeek getDayOfWeek() {
    return dayOfWeek;
  }

  public void setDayOfWeek(DayOfWeek dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  public LocalTime getStartTime() {
    return startTime;
  }

  public void setStartTime(LocalTime startTime) {
    this.startTime = startTime;
  }

  public LocalTime getEndTime() {
    return endTime;
  }

  public void setEndTime(LocalTime endTime) {
    this.endTime = endTime;
  }
}
