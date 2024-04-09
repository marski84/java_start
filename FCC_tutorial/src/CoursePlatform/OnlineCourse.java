package CoursePlatform;

public class OnlineCourse extends Course {
    private int videoTime;
    private int predictedTimeToFinish;
    public OnlineCourse(String id, double price, String name, String description, int videoTime, int predictedTimeToFinish) {
        super(id, price, name, description);
        this.videoTime = videoTime;
        this.predictedTimeToFinish = predictedTimeToFinish;
    }

    public int getVideoTime() {
        return videoTime;
    }

    public void setVideoTime(int videoTime) {
        this.videoTime = videoTime;
    }

    public int getPredictedTimeToFinish() {
        return predictedTimeToFinish;
    }

    public void setPredictedTimeToFinish(int predictedTimeToFinish) {
        this.predictedTimeToFinish = predictedTimeToFinish;
    }
}
