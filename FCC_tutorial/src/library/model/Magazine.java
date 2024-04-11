package library.model;

public class Magazine extends Publication {
    private int month;
    private int day;
    private String language;

    public Magazine(String title, String publisher, int releaseDate, int month, int day, String language) {
        super(title, publisher, releaseDate);
        this.month = month;
        this.day = day;
        this.language = language;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void printInfo() {
        String info = getTitle() + "; " + getPublisher() + "; " + this.getReleaseDate() + "-"
                + month + "-" + day + "; " + language;
        System.out.println(info);
    }
}
