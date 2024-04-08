package UniversityWithStatic;

public class Student {
    private String firstName;
    private String lastName;

    private static int indexNumber = 0;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        indexNumber += 1;
    }

    public static int getIndexNumber() {
        return indexNumber;
    }

    public static void setIndexNumber(int indexNumber) {
        Student.indexNumber = indexNumber;
    }
}
