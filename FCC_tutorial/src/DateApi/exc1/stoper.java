package DateApi.exc1;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class stoper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Instant startTime = null;
        System.out.println("Press enter to start");
        if (sc.nextLine() == "") {
            System.out.println("Press enter to stop");
            startTime = Instant.now();
        }

        if (sc.nextLine() == "") {
            Instant endTime = Instant.now();

            System.out.println(Duration.between(startTime, endTime).getSeconds());

        }



    }


}
