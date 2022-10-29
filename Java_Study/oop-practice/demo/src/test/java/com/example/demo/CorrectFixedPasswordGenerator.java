package com.example.demo;

public class CorrectFixedPasswordGenerator implements PasswordGenerator {

  @Override
  public String generatePassword() {
    return "aabbccdd";
  }

}
