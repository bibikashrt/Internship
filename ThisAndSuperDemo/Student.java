
public class Student extends Person {

    private String course;

    public Student(String name, int age, String course) {

        super(name, age);

        this.course = course;
    }

    @Override
    public void displayDetails() {

        super.displayDetails();

        System.out.println("Course: " + course);
    }
}
