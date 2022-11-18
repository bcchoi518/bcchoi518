package chapter6;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import chapter6.model.Order;
import chapter6.model.Order.OrderStatus;
import chapter6.model.User;

public class Section4 {
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

    List<Optional<String>> emailAddresses = users.stream()
        .filter(user -> !user.isVerified())
        .map(User::getEmailAddress)
        .collect(Collectors.toList());
    // System.out.println(emailAddresses);

    LocalDateTime now = LocalDateTime.now(ZoneId.of("Asia/Seoul"));
    Order order1 = new Order()
        .setId(1001)
        .setStatus(OrderStatus.CREATED)
        .setCreatedByUserId(101)
        .setCreatedAt(now.minusHours(4));
    Order order2 = new Order()
        .setId(1002)
        .setStatus(OrderStatus.ERROR)
        .setCreatedByUserId(103)
        .setCreatedAt(now.minusHours(1));
    Order order3 = new Order()
        .setId(1003)
        .setStatus(OrderStatus.PROCESSED)
        .setCreatedByUserId(102)
        .setCreatedAt(now.minusHours(36));
    Order order4 = new Order()
        .setId(1004)
        .setStatus(OrderStatus.ERROR)
        .setCreatedByUserId(104)
        .setCreatedAt(now.minusHours(40));
    Order order5 = new Order()
        .setId(1005)
        .setStatus(OrderStatus.IN_PROGRESS)
        .setCreatedByUserId(101)
        .setCreatedAt(now.minusHours(10));

    List<Order> orders = Arrays.asList(order1, order2, order3, order4, order5);
    // Find orders in Error status, and extract createdByUserIds as a list
    List<Long> createdByIds = orders.stream()
        .filter(order -> order.getStatus() == OrderStatus.ERROR)
        .map(Order::getCreatedByUserId)
        .collect(Collectors.toList());
    // System.out.println(createdByIds);

    // Find orders in ERROR status and created within 24 hours
    List<Order> ordersInErrorStatusIn24hrs = orders.stream()
        .filter(order -> order.getStatus() == OrderStatus.ERROR)
        .filter(order -> order.getCreatedAt().isAfter(now.minusHours(24)))
        .collect(Collectors.toList());
    System.out.println(ordersInErrorStatusIn24hrs);
  }
}
