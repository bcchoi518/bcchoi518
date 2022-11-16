package chapter7;

import java.util.Optional;

import chapter6.model.User;

public class Section1 {
  public static void main(String[] args) {
    User user1 = new User()
        .setId(1001)
        .setName("CBC")
        .setVerified(false);
    User user2 = new User()
        .setId(1001)
        .setName("CBC")
        .setEmailAddress("cbc@mail.com")
        .setVerified(false);

    // System.out.println(userEquals(user1, user2)); // NPE 발생
    String someEmail = "some@mail.com";
    String nullEmail = null;

    Optional<String> maybeEmail = Optional.of(someEmail);
    Optional<String> maybeEmail2 = Optional.empty();
    Optional<String> maybeEmail3 = Optional.ofNullable(someEmail);
    Optional<String> maybeEmail4 = Optional.ofNullable(nullEmail);

    String email = maybeEmail.get();
    // System.out.println(email);

    if (maybeEmail2.isPresent()) { // NoSuchElementException 발생 안함
      System.out.println(maybeEmail2.get());
    }

    String defaultEmail = "default@mail.com";
    String email2 = maybeEmail2.orElse(defaultEmail);
    // System.out.println(email2);
    String email3 = maybeEmail2.orElseGet(() -> defaultEmail);
    // System.out.println(email3);
    String email4 = maybeEmail2.orElseThrow(() -> new RuntimeException("email not present"));
  }

  public static boolean userEquals(User u1, User u2) {
    return u1.getId() == u2.getId()
        && u1.getName().equals(u2.getName())
        && u1.getEmailAddress().equals(u2.getEmailAddress())
        && u1.isVerified() == u2.isVerified();
  }
}
