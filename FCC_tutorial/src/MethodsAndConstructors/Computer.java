package MethodsAndConstructors;

public class Computer {
    String processor;
    int memory;

    Computer(String proc, int installedMemory) {
        processor = proc;
        memory = installedMemory;
        System.out.println("nowy komputer " + this.processor);
    }

    void printInfo() {
        System.out.println(processor + ",memory: " + memory );
    }

    String getInfo() {
        return processor + " " + memory;
    }


}
