package chapter10;

import chapter10.model.User;

public class BuilderPattern {
  public static void main(String[] args) {
    // User user = User.builder(1, "Alice")
    // .withEmailAddress("alice@mail.com")
    // .withVerified(true)
    // .build();

    User user = User.builder(1, "Alice")
        .with(builder -> {
          builder.emailAddress = "alice@mail.com";
          builder.isVerified = true;
        }).build();
    System.out.println(user);
  }
}
