package hw.stream_api.sixth;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Transaction {
  private String category;
  private double amount;
}
