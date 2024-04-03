package Hospital;

import Hospital.models.Hospital;

import java.util.Scanner;

public class HospitalApp {

    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        final int addPatient = 1;
        final int showPatients = 2;
        final int exit = 0;

        while (true) {
            Hospital hospital = new Hospital();

            System.out.println("select mode:");
            while(!reader.hasNextInt()) {
                System.out.println("Not a valid mode id- please try again");
                reader.next();
            }
            int selectedNumber = reader.nextInt();
            reader.nextLine();

            switch (selectedNumber) {
                case exit -> {
                    return;
                }
                case addPatient -> {
                    hospital.addPatient();
                }
                case showPatients -> {
                    hospital.showPatientList();
                }
            }
        }
    }
}
