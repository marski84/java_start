package library.model;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Magazine{" +
                "month=" + month +
                ", day=" + day +
                ", language='" + language + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Magazine magazine)) return false;
        if (!super.equals(o)) return false;
        return month == magazine.month && day == magazine.day && Objects.equals(language, magazine.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), month, day, language);
    }
}
