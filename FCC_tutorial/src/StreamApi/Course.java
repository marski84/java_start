package StreamApi;

import lombok.Data;

@Data
class Course {
    private Long id;
    private String name;
    private double price;
    private String category;

    public Course(Long id, String name, double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }
}
