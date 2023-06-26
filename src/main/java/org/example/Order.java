package org.example;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Order {

  private User user;
  private List<Product> priceList;

  private Order() {
  }

  public static Order createOrder(User user, List<Product> priceList) {
    Order order = new Order();
    order.setUser(user);
    order.setPriceList(priceList);
    return order;
  }
}
