package CoursePlatform;

public class test {
    public static void main(String[] args) {
        Course course = new Course("standard", 1000, "Standard", "sdfdsikjghs");
        OnlineCourse onlineCourse = new OnlineCourse("asdf", 4932898, "online", "dsfdsgs", 600, 900);
        StationaryCourse stationaryCourse = new StationaryCourse("dsfdsf", 8748327, "stationary", "dfsdf", "Warsaw", 10);
        BootCamp bootCamp = new BootCamp("dsgfds", 11231254, "bootcamp", "dfdsf", "Strucel", 10);

        System.out.println(course.getName());
        System.out.println(onlineCourse.getName());
        System.out.println(stationaryCourse.getName());
        System.out.println(bootCamp.getName());


    }

}
