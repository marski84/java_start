package Records;
import java.time.LocalDateTime;

public record Transaction(long id, double value, LocalDateTime purchasedAt) {
//konstruktor kanoniczny
//    public Transaction(long id, double value, LocalDateTime purchasedAt) {
//        validate(id, value, purchasedAt);
//
//        this.id = id;
//        this.value = value;
//        this.purchasedAt = purchasedAt;
//    }

//konstruktor kompaktowy
    public Transaction {
        validate(id, value, purchasedAt);
    }

    private void validate(long id, double value, LocalDateTime purchasedAt) {
        if (id <= 0 || value <= 0 || purchasedAt == null || purchasedAt.isAfter(LocalDateTime.now())) {
            throw new IllegalArgumentException("Invalid transaction");
        }

    }
}
