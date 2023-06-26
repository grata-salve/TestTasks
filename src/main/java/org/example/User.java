package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {

  private String name;
  private int age;

  private User() {
  }

  public static User createUser(String name, int age) {
    User user = new User();
    user.setName(name);
    user.setAge(age);
    return user;
  }
}
