package hw.stream_api.fifth;

import java.util.List;
import java.util.stream.Stream;

public class SomeConsumer {


  public static void main(String[] args) {

    Group xMen = new Group("X-Men", "Superheroes");
    Group developers = new Group("Developers", "Software engineers");
    Group xCompany = new Group("X-Company", "Business group");
    Group designers = new Group("Designers", "UI/UX designers");

    List<User> users = List.of(
        new User("Alex", 25, List.of(xMen)),
        new User("John", 30, List.of(developers)),
        new User("Maria", 22, List.of(developers, xCompany)),
        new User("Steve", 28, List.of(designers, developers)),
        new User("Kate", 26, List.of(xMen, designers))
    );

    SomeConsumer consumer = new SomeConsumer();

    List<User> result = consumer.consume(users.stream());

    result.forEach(user ->
        System.out.println(user.getUsername())
    );
  }


  public List<User> consume(Stream<User> usersStream) {
    return usersStream
        .filter(user -> user
            .getGroups()
            .stream()
            .anyMatch(group -> group
                .getName()
                .startsWith("X")))
        .toList();
  }
}
