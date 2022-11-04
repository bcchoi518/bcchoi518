package com.example.calculator;

import java.util.List;

import com.example.calculator.calculate.AdditionOperator;
import com.example.calculator.calculate.DivisionOperator;
import com.example.calculator.calculate.MultiplicationOperator;
import com.example.calculator.calculate.NewArithmeticOperator;
import com.example.calculator.calculate.PositiveNumber;
import com.example.calculator.calculate.SubtractionOperator;

public class Calculator {
  private static final List<NewArithmeticOperator> arithmeticOperators = List.of(new AdditionOperator(),
      new SubtractionOperator(), new MultiplicationOperator(), new DivisionOperator());

  public static int calculator(PositiveNumber operand1, String operator, PositiveNumber operand2) {
    return arithmeticOperators.stream()
        .filter(arithmeticOperator -> arithmeticOperator.supports(operator))
        .map(ArithmeticOperator -> ArithmeticOperator.calculate(operand1, operand2))
        .findFirst()
        .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));
  }

}
