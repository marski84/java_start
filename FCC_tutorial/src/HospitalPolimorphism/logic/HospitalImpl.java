package HospitalPolimorphism.logic;

import HospitalPolimorphism.models.Doctor;
import HospitalPolimorphism.models.Hospital;
import HospitalPolimorphism.models.Nurse;
import HospitalPolimorphism.models.Person;

public class HospitalImpl {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Person doctor = new Doctor("doctor", "doctor", 10000, 25000);
        Person nurse = new Nurse("nurse", "nurse", 6000, 100);

        hospital.add(doctor);
        hospital.add(nurse);
        hospital.printHospitalWorkers();

    }
}
