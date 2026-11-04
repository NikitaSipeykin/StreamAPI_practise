package hw.stream_api.sixth;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {

  public Solution() {
  }

  public Map<String, Double> totalAmountByCategory(List<Transaction> transactions) {

    return transactions.stream()
        .filter(transaction -> transaction.getAmount() > 0)
        .collect(Collectors.groupingBy(Transaction::getCategory, Collectors.summingDouble(Transaction::getAmount)))
        .entrySet()
        .stream()
        .collect(Collectors.toMap(Map.Entry::getKey, entry -> Math.round(entry.getValue() * 100) / 100.0));
  }
}
