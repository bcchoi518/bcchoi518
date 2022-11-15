package chapter6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import chapter6.model.Order;
import chapter6.model.Order.OrderStatus;
import chapter6.model.User;

public class Section2 {
  public static void main(String[] args) {
    User user1 = new User()
        .setId(101)
        .setName("Alice")
        .setVerified(true)
        .setEmailAddress("alice@mail.com");
    User user2 = new User()
        .setId(102)
        .setName("Bob")
        .setVerified(false)
        .setEmailAddress("bob@mail.com");
    User user3 = new User()
        .setId(103)
        .setName("Charlie")
        .setVerified(true)
        .setEmailAddress("charlie@mail.com");

    List<User> users = Arrays.asList(user1, user2, user3);
    List<User> verifiedUsers = users.stream()
        .filter(User::isVerified)
        .collect(Collectors.toList());
    System.out.println(verifiedUsers);

    List<User> unverifiedUsers = users.stream()
        .filter(user -> !user.isVerified())
        .collect(Collectors.toList());
    System.out.println(unverifiedUsers);

    Order order1 = new Order()
        .setId(1001)
        .setStatus(OrderStatus.CREATED);
    Order order2 = new Order()
        .setId(1002)
        .setStatus(OrderStatus.ERROR);
    Order order3 = new Order()
        .setId(1003)
        .setStatus(OrderStatus.PROCESSED);
    Order order4 = new Order()
        .setId(1004)
        .setStatus(OrderStatus.ERROR);
    Order order5 = new Order()
        .setId(1005)
        .setStatus(OrderStatus.IN_PROGRESS);

    List<Order> orders = Arrays.asList(order1, order2, order3, order4, order5);
    // Filter orders in ERROR status
    List<Order> filteredOrders = orders.stream()
        .filter(order -> order.getStatus() == OrderStatus.ERROR)
        .collect(Collectors.toList());
    System.out.println(filteredOrders);
  }
}
