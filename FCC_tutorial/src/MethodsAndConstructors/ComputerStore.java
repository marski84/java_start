package MethodsAndConstructors;

public class ComputerStore {
    public static void main(String[] args) {
        ComputerUpgrade upgrader = new ComputerUpgrade();
        Computer amd = new Computer("Ryzen", 16384);
//        amd.processor = "Ryzen";
//        amd.memory = 16384;

        Computer intel = new Computer( "Turbo",Integer.parseInt(String.valueOf(amd.memory)) * 2);
//        intel.processor = "i15";
//        intel.memory = Integer.parseInt(String.valueOf(amd.memory)) * 2;


        amd.printInfo();
        intel.printInfo();



        String amdInfo = amd.getInfo();


        upgrader.addMemory(intel, 50000);
        String intelInfo = intel.getInfo();


        System.out.println(amdInfo);
        System.out.println(intelInfo);

        ComputerFactory computerFactory = new ComputerFactory();

        Computer bestAmd = computerFactory.createComputer("Best Amd", 70000);
        bestAmd.printInfo();





    }
}
