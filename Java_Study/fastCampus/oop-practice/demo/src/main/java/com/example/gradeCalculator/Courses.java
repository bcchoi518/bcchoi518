package com.example.gradeCalculator;

import java.util.List;

public class Courses { // 일급 컬렉션

  private final List<Course> courses;

  public Courses(List<Course> courses) {
    this.courses = courses;
  }

  public double multiplyCreditAndCourseGrade() {
    return courses.stream()
        .mapToDouble(Course::multiplyCreditAndCourseGrade)
        .sum();
  }

  public int calculateTotalCompletedCredit() {
    return courses.stream()
        .mapToInt(Course::getCredit)
        .sum();
  }

}
