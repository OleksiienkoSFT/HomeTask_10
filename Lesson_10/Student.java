package Lesson_10;

public class Student {
    // ім'я, група, курс, оцінки з предметів.
    String name;
    String group;
    int course;
    double rating;

    public Student(String name, String group, int course, double rating) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }
}
