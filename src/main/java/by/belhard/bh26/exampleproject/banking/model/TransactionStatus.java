package by.belhard.bh26.exampleproject.banking.model;

public enum TransactionStatus {

    PENDING("Transaction is pending processing"),
    PROCESSED("Transaction is currently being processed"),
    DONE("Transaction is done"),
    INVALID_NOT_ENOUGH_MONEY("Transaction was declined due to insufficient funds in the senders account"),
    INVALID_RECEIVER("Transaction was declined due to invalid receiver account"),
    INVALID_SENDER("Transaction was declined due to invalid sender account"),
    INVALID_AMOUNT("Transaction was declined due to invalid money amount value");

    private final String message;

    TransactionStatus(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }
}
