package LambdaRef.methodRef;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Computer {
    private String brand;
    private int cpu;
    private int temperature;

    public void overclockCpu() {
        cpu *= 1.1;
        temperature *= 1.1;
    }

    public static void overclock(Computer computer) {
        computer.cpu *= 1.1;
        computer.temperature *= 1.1;
    }

}
