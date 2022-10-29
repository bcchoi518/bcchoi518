package com.example.calculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.example.calculator.calculate.PositiveNumber;

public class CalculatorTest {

  // 1 + 2 ---> Calculator
  // 3 <---
  @DisplayName("덧셈 연산을 수행한다.")
  @ParameterizedTest
  @MethodSource("formulaAndResult")
  void calculateTest(int operand1, String operator, int operand2, int result) {

    int calculateResult = Calculator.calculator(new PositiveNumber(operand1), operator, new PositiveNumber(operand2));

    assertThat(calculateResult).isEqualTo(result);
  }

  private static Stream<Arguments> formulaAndResult() {
    return Stream.of(
        arguments(1, "+", 2, 3),
        arguments(1, "-", 2, -1),
        arguments(4, "*", 2, 8),
        arguments(4, "/", 2, 2));
  }

}
