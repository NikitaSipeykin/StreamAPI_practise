package hw.steram_api;

import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Вывести строку в обратном порядке, каждую вторую букву
public class ReverseLineOrder {
  public static void main(String[] args) {
    String s = "Spring Boot!";
    String s1 = "Spring Boot";

    System.out.println(reverseLineOrder(s));
    System.out.println(reverseLineOrder(s1));
  }

  public static String reverseLineOrder(String line){
    return IntStream.range(0, (line.length() + 1) / 2)
        .map(i -> line.length() - 1 - i * 2)
        .mapToObj(line::charAt)
        .map(Objects::toString)
        .collect(Collectors.joining());
  }
}
