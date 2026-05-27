
class Person {

    public String name = "Bibika";
    private int age = 22;
    protected String address = "Kathmandu";
    String country = "Nepal";

    public int getAge() {
        return age;
    }
}

class Student extends Person {

    public void showDetails() {

        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Country: " + country);

        System.out.println("Age (via getter): " + getAge());
    }
}

public class AccessDemo {

    public static void main(String[] args) {

        Person p = new Person();
        Student s = new Student();
        s.showDetails();
    }
}
