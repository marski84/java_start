package UniversityWithStatic;

public class University {
    public static void main(String[] args) {
        Student first = new Student("1", "2");
        System.out.println(Student.getIndexNumber());
        Student second = new Student("okok", "okok");
        System.out.println(Student.getIndexNumber());
        Student third = new Student("", "");
        System.out.println(Student.getIndexNumber());
    }
}
