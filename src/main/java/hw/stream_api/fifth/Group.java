package hw.stream_api.fifth;

import lombok.Data;

@Data
class Group {
  private String name;
  private String description;

  public Group(String name, String description) {
    this.name = name;
    this.description = description;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }
}
