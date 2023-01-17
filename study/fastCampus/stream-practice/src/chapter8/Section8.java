package chapter8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import chapter6.model.User;
import chapter8.service.EmailService;

public class Section8 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(13, 2, 101, 203, 304, 402, 305, 349, 2312, 203);

    Map<Boolean, List<Integer>> numberPartitions = numbers.stream()
        .collect(Collectors.partitioningBy(number -> number % 2 == 0));
    // System.out.println("Even numbers: " + numberPartitions.get(true));
    // System.out.println("Odd numbers: " + numberPartitions.get(false));

    User user1 = new User()
        .setId(101)
        .setName("Alice")
        .setEmailAddress("alice@mail.com")
        .setFriendUserIds(Arrays.asList(201, 202, 203, 204, 208, 209, 210));
    User user2 = new User()
        .setId(102)
        .setName("Bob")
        .setEmailAddress("bob@mail.com")
        .setFriendUserIds(Arrays.asList(204, 205, 206));
    User user3 = new User()
        .setId(103)
        .setName("Charlie")
        .setEmailAddress("charlie@mail.com")
        .setFriendUserIds(Arrays.asList(204, 205, 207));
    List<User> users = Arrays.asList(user1, user2, user3);

    Map<Boolean, List<User>> userPartitions = users.stream()
        .collect(Collectors.partitioningBy(user -> user.getFriendUserIds().size() > 5));

    EmailService emailService = new EmailService();

    userPartitions.get(true).forEach(emailService::sendPlayWithFriendsEmail);
    userPartitions.get(false).forEach(emailService::sendMakeMoreFriendsEmail);
  }
}
