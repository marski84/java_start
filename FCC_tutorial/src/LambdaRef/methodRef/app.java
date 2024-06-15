package LambdaRef.methodRef;

import java.util.List;
import java.util.function.Consumer;

public class app {
    public static void main(String[] args) {
        List<Computer> computers = List.of(
                new Computer("Lenovo", 3000, 45),
                new Computer("HP", 3200, 66),
                new Computer("Apple", 3400, 78),
                new Computer("Asus", 2800, 42)
        );
        consume(computers, app::printComputerDetails);
//        consume(computers, Computer::overclockCpu);
        consume(computers, app::printComputerDetails);
        consume(computers, Computer::overclock);




    }

    private static void consume(List<Computer> computers, Consumer<Computer> consumer) {
        for (Computer computer: computers) {
            consumer.accept(computer);
        }
    }

    private static void printComputerDetails(Computer computer) {
        StringBuilder sb = new StringBuilder();
        sb.append(computer.getBrand() + ", cpu: " + computer.getCpu());
        if (computer.getTemperature() < 50) {
            sb.append("temp: cold");
        } else {
            sb.append("temp: hot");
        }

        System.out.println(sb);
    }
}
