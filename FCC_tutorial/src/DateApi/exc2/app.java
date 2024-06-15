package DateApi.exc2;

import org.jetbrains.annotations.NotNull;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Provide first date in format YYYY-MM-DD:");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate firstInputDate = LocalDate.parse(sc.next(), formatter);
        System.out.println("Provide second date in format YYYY-MM-DD:");
        LocalDate secondInputDate = LocalDate.parse(sc.next(), formatter);

        if (firstInputDate.isAfter(secondInputDate)) {
            System.out.println("Późniejsza data " + firstInputDate);
        } else {
            System.out.println("Późniejsza data " + secondInputDate);
        }

        StringBuilder result = getStringBuilder(firstInputDate, secondInputDate);
        System.out.println(result);
    }

    private static @NotNull StringBuilder getStringBuilder(LocalDate firstInputDate, LocalDate secondInputDate) {
        int yearsBetweenDates = Math.abs(firstInputDate.getYear() - secondInputDate.getYear());
        int mothsBetweenDates = Math.abs(firstInputDate.getMonthValue() - secondInputDate.getMonthValue());
        int daysBetweenDates = Math.abs(firstInputDate.getDayOfMonth() - secondInputDate.getDayOfMonth());
        StringBuilder result = new StringBuilder();
        result.append("Daty dzieli ");
        result.append(yearsBetweenDates + " lat, ");
        result.append(mothsBetweenDates + " miesięcy, ");
        result.append("oraz " + daysBetweenDates + " dni.");
        return result;
    }
}
