package chapter8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import chapter6.model.User;
import chapter8.service.EmailService;

public class Section9 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(3, 5, 2, 1);
    // numbers.stream().forEach(number -> System.out.println("The number is " +
    // number));
    numbers.forEach(number -> System.out.println("The number is " + number));

    User user1 = new User()
        .setId(101)
        .setName("Alice")
        .setVerified(false)
        .setEmailAddress("alice@mail.com")
        .setFriendUserIds(Arrays.asList(201, 202, 203, 204, 208, 209, 210));
    User user2 = new User()
        .setId(102)
        .setName("Bob")
        .setVerified(true)
        .setEmailAddress("bob@mail.com")
        .setFriendUserIds(Arrays.asList(204, 205, 206));
    User user3 = new User()
        .setId(103)
        .setName("Charlie")
        .setVerified(true)
        .setEmailAddress("charlie@mail.com")
        .setFriendUserIds(Arrays.asList(204, 205, 207));
    User user4 = new User()
        .setId(104)
        .setName("David")
        .setVerified(false)
        .setEmailAddress("david@mail.com")
        .setFriendUserIds(Arrays.asList(211, 212, 213, 214, 215, 216));
    List<User> users = Arrays.asList(user1, user2, user3, user4);

    EmailService emailService = new EmailService();

    users.stream()
        .filter(user -> !user.isVerified())
        .forEach(emailService::sendVerifyYourEmailEmail);

    for (int i = 0; i < users.size(); i++) {
      User user = users.get(i);
      System.out.println("Do an operation on user " + user.getName() + " at index " + i);
    }

    IntStream.range(0, users.size()).forEach(i -> {
      User user = users.get(i);
      System.out.println("Do an operation on user " + user.getName() + " at index " + i);
    });
  }
}
