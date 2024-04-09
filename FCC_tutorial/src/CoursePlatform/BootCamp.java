package CoursePlatform;

public class BootCamp extends Course{
    private String trainer;
    private int consultationHours;

    public BootCamp(String id, double price, String name, String description, String trainer, int consultationHours) {
        super(id, price, name, description);
        this.trainer = trainer;
        this.consultationHours = consultationHours;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public int getConsultationHours() {
        return consultationHours;
    }

    public void setConsultationHours(int consultationHours) {
        this.consultationHours = consultationHours;
    }
}
