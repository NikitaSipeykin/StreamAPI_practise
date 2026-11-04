package hw.stream_api.third;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Solution {

  public static void main(String[] args) {

    List<Person> persons = List.of(
        new Person("Alex", 25),
        new Person("John", 30),
        new Person("Maria", 22),
        new Person("Steve", 28)
    );

    Optional<Person> result = findPersonByName(persons, "Maria");

    result.ifPresent(person ->
        System.out.println(person.name + " — " + person.age)
    );
  }

  public static Optional<Person> findPersonByName(List<Person> persons, String name) {
    return persons.stream().filter(person -> Objects.equals(person.name, name)).findFirst();
  }
}
