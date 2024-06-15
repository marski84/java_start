package Records;

import java.time.LocalDateTime;

public class app {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        Transaction transaction = new Transaction(-123, 500.00, date);
        System.out.println(transaction);

    }
}
