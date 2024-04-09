package CoursePlatform;

public class StationaryCourse extends Course {
    String place;
    int amountOfMeetings;

    public StationaryCourse(String id, double price, String name, String description, String place, int amountOfMeetings) {
        super(id, price, name, description);
        this.place = place;
        this.amountOfMeetings = amountOfMeetings;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getAmountOfMeetings() {
        return amountOfMeetings;
    }

    public void setAmountOfMeetings(int amountOfMeetings) {
        this.amountOfMeetings = amountOfMeetings;
    }
}
