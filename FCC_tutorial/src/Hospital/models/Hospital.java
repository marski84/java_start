package Hospital.models;

import java.util.Scanner;

public class Hospital {
    private Patient[] patients = new Patient[10];
    private Scanner scanner = new Scanner(System.in);
    private int nextFreeIndex;

    public void addPatient() {
        if (this.isPatientListFull()) {
            System.out.println("No more free places!");
            return;
        }

        System.out.println("Patients firstname:");
        String firstName = this.getPersonalData();
        System.out.println("Patients lastname:");
        String lastName = this.getPersonalData();
        System.out.println("Patients PESEL:");
        String pesel = this.getPesel();
        this.findIndex();
        Patient patient = new Patient(firstName ,lastName, pesel);
        this.patients[nextFreeIndex]= patient;
        System.out.println(patients[0]);

    }

    public void showPatientList() {
        System.out.println("Patients list: ");
        for (Patient patient: patients) {
            if (patient != null) {
                System.out.println(patient.getFirstName() + " " + patient.getLastName() + ", PESEL: " + patient.getPesel());
            }
        }
    }

    private void findIndex() {
         for (int i = 0; i < patients.length -1; i++) {
            if (patients[i] == null) {
                this.nextFreeIndex = i;
                break;
            }
         }
    }

    private String getPersonalData() {
        while (!scanner.hasNextLine()) {
            System.out.println("System accepts only letters");
        }
        String input = scanner.nextLine();
        return input;
    }

    private String getPesel() {
        String input = scanner.nextLine();

        while (input.length() != 11) {
            System.out.println("Not a valid PESEL, please try again.");
            input = scanner.nextLine();
        }

        return input;
    }

    private Boolean isPatientListFull() {
        return this.patients[patients.length -1] != null;
    }


}
