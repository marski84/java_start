package CoursePlatform;

public class OnlineCourse extends Course {
    int videoTime;
    int predictedTimeToFinish;
    public OnlineCourse(String id, double price, String name, String description, int videoTime, int predictedTimeToFinish) {
        super(id, price, name, description);
        this.videoTime = videoTime;
        this.predictedTimeToFinish = predictedTimeToFinish;
    }


}
