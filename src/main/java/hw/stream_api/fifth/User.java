package hw.stream_api.fifth;

import lombok.Data;

import java.util.List;

@Data
class User {
  private String username;
  private Integer age;
  private List<Group> groups;

  public User(String username, Integer age, List<Group> groups) {
    this.username = username;
    this.age = age;
    this.groups = groups;
  }

  public String getUsername() {
    return username;
  }

  public Integer getAge() {
    return age;
  }

  public List<Group> getGroups() {
    return groups;
  }
}
