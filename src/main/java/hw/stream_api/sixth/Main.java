package hw.stream_api.sixth;

import java.util.List;
import java.util.Map;

public class Main {

  public static void main(String[] args) {

    List<Transaction> transactions = List.of(
        new Transaction("Food", 150.50),
        new Transaction("Transport", 50.00),
        new Transaction("Food", 200.25),
        new Transaction("Entertainment", -100.00),
        new Transaction("Transport", 30.00),
        new Transaction("Food", -50.00),
        new Transaction("Entertainment", 500.00),
        new Transaction("Shopping", 99.999),
        new Transaction("Shopping", 50.001),
        new Transaction("Food", 0.00),
        new Transaction("Transport", 19.99)
    );

    Solution solution = new Solution();

    Map<String, Double> result =
        solution.totalAmountByCategory(transactions);

    result.forEach((category, amount) ->
        System.out.println(category + " = " + amount)
    );
  }
}
