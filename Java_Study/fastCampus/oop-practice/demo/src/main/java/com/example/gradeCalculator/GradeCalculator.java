package com.example.gradeCalculator;

import java.util.List;

public class GradeCalculator {

  private final Courses courses;

  public GradeCalculator(List<Course> courses) {
    this.courses = new Courses(courses);
  }

  public double calculateGrade() {
    // (학점수x교과목 평점)의 합계
    double totalMultipliedCreditAndCourseGrade = courses.multiplyCreditAndCourseGrade();

    // 수강신청 총학점 수
    int totalCompleteCredit = courses.calculateTotalCompletedCredit();

    return totalMultipliedCreditAndCourseGrade / totalCompleteCredit;
  }
}
