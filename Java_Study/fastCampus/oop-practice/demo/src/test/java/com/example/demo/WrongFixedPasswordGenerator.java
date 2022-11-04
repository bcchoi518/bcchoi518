package com.example.demo;

public class WrongFixedPasswordGenerator implements PasswordGenerator {

  @Override
  public String generatePassword() {
    return "aa";
  }

}
