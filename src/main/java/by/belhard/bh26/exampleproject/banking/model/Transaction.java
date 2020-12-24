package by.belhard.bh26.exampleproject.banking.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
public class Transaction {

    private int id;
    private Account sender;
    private Account receiver;
    private LocalDateTime time;
    private int amount;
    private TransactionStatus status;
}
