package Hospital.models;

public class Hospital {
    private Patient[] patients = new Patient[10];

    private int patientsAdded = 0;

    public void addPatient() {
        System.out.println("add patient");
    }

    public void showPatientList() {
        System.out.println("show patient");
        int freeIndex = this.findIndex();
        System.out.println(freeIndex);
    }

    private int findIndex() {
        int freeIndex = -1;
        for (int i = 0; patients.length < i; i++) {
            System.out.println(patients[i]);
            if (patients[i] == null) {
                freeIndex = i;
                break;
            }
        }
        return freeIndex;
    }


}
