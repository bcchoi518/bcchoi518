package chapter8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import chapter6.model.User;
import chapter8.service.EmailService;

public class Section10 {
  public static void main(String[] args) {
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
    User user5 = new User()
        .setId(105)
        .setName("Eve")
        .setVerified(true)
        .setEmailAddress("eve@mail.com")
        .setFriendUserIds(Arrays.asList(217, 218, 219, 220));
    User user6 = new User()
        .setId(106)
        .setName("Frank")
        .setVerified(false)
        .setEmailAddress("frank@mail.com")
        .setFriendUserIds(Arrays.asList(221, 222, 223, 224, 225, 226, 227, 228));
    List<User> users = Arrays.asList(user1, user2, user3, user4, user5, user6);

    EmailService emailService = new EmailService();

    long startTime = System.currentTimeMillis();
    users.stream()
        .filter(user -> !user.isVerified())
        .forEach(emailService::sendVerifyYourEmailEmail);
    long endTime = System.currentTimeMillis();
    System.out.println("Sequential: " + (endTime - startTime) + "ms");

    startTime = System.currentTimeMillis();
    users.stream().parallel()
        .filter(user -> !user.isVerified())
        .forEach(emailService::sendVerifyYourEmailEmail);
    endTime = System.currentTimeMillis();
    System.out.println("Parallel: " + (endTime - startTime) + "ms");

    List<User> processedUsers = users.parallelStream()
        .map(user -> {
          System.out.println("Capitalize user name for user " + user.getId());
          user.setName(user.getName().toUpperCase());
          return user;
        })
        .map(user -> {
          System.out.println("Set 'isVerified' to true for user " + user.getId());
          user.setVerified(true);
          return user;
        })
        .collect(Collectors.toList());
    System.out.println(processedUsers);
  }
}
