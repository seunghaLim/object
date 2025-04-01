package v1;

import v1.domain.Money;
import v1.domain.Movie;
import v1.domain.discountCondition.AmountDiscountPolicy;
import v1.domain.discountCondition.PercentDiscountPolicy;
import v1.domain.discountPolicy.DiscountCondition;
import v1.domain.discountPolicy.PeriodCondition;
import v1.domain.discountPolicy.SequenceCondition;

import java.time.Duration;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    System.out.printf("Hello and welcome!");
  }
}