package DateApi;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class app {
    public static void main(String[] args) throws InterruptedException {
       Date date = new Date(1999,10,10);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = sdf.format(date);
//        System.out.println(formattedDate);

        Instant now = Instant.now();
        for (int i = 0; i < 100; i++) {
//            System.out.println();
        }
        Instant now2 = Instant.now();
        Duration timeGap = Duration.between(now, now2);
//        System.out.println(timeGap.getNano());

//        LocalTime start = LocalTime.now();
//        for (int i = 0; i < 10; i++) {
//            Thread thread = new Thread();
//            start.plusSeconds(2);
//            thread.sleep(500);
//
//            System.out.println(start.getHour() + ":" + start.getMinute() + ":" + start.getSecond() + start.getNano());
//        }
//        LocalTime end = LocalTime.now();
//        Duration timeGap2 = Duration.between(start, end);
//        System.out.println(timeGap2.getSeconds());

//
//        LocalDate dateNow = LocalDate.now();
//        LocalDate date1 = LocalDate.of(1984, 03, 22);
//        System.out.println(dateNow.isAfter(date1));
//        System.out.println(dateNow.getDayOfMonth());
//
//        LocalDateTime localDateTimeNow = LocalDateTime.now();
//        System.out.println(localDateTimeNow);



        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date");
        String dateString = scanner.nextLine();
        LocalDate localDate = LocalDate.parse(dateString, formatter);
        System.out.println(localDate);


    }
}
