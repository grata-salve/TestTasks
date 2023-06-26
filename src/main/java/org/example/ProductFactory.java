package org.example;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;


public class ProductFactory {

  public static Product createRealProduct(String name, double price, int size, int weight) {
    return new RealProduct(name, price, size, weight);
  }

  public static Product createVirtualProduct(
      String name, double price, String code, LocalDate expirationDate) {
    return new VirtualProduct(name, price, code, expirationDate);
  }

}

@Getter
@Setter
class RealProduct extends Product {
  private int size;
  private int weight;

  public RealProduct(String name, double price, int size, int weight) {
    super(name, price);
    this.size = size;
    this.weight = weight;
  }
}

@Getter
@Setter
class VirtualProduct extends Product {

  private String code;
  private LocalDate expirationDate;

  public VirtualProduct(String name, double price, String code, LocalDate expirationDate) {
    super(name, price);
    this.code = code;
    this.expirationDate = expirationDate;
  }
}