package hw.stream_api.fourth;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Scratch {

  // Модель книги
  private record Book(String author, String name) {}

  // Тестовые данные
  private static final Set<Book> books = Set.of(
      new Book("Author1", "Name1"),
      new Book("Author1", "Name2"),
      new Book("Author2", "Name3"),
      new Book("Author2", "Name4"),
      new Book("Author3", "Name5")
  );

  // Метод обработки
  public static Map<String, List<String>> groupBooksByAuthor(Set<Book> books) {
    return books.stream()
        .collect(Collectors.groupingBy(Book::author, Collectors.mapping(Book::name, Collectors.toList() )));
  }

  // Точка входа
  public static void main(String[] args) {

    Map<String, List<String>> result = groupBooksByAuthor(books);

    System.out.println(result);
  }
}