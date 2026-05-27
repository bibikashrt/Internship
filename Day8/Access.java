

class Demo {

    public String name = "Ram";
    private int marks = 100;
    protected int studentid = 1;
}

class Student extends Demo {

    public void display() {
        System.out.println("Name:" + name);
        System.out.println("StudentId:" + studentid);
    }
}

public class Access {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();

    }

}
