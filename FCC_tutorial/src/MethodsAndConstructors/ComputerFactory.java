package MethodsAndConstructors;

public class ComputerFactory {
    Computer createComputer(String processor, int memory) {
        Computer computer = new Computer(processor, memory);
        return computer;

    }
}
