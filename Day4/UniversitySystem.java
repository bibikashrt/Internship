
abstract class Person {

    abstract void role();

    void university() {
        System.out.println("ABC University");
    }
}

interface Attendance {

    void markAttendance();
}

class Student extends Person implements Attendance {

    @Override
    void role() {
        System.out.println("Role: Student");
    }

    @Override
    public void markAttendance() {
        System.out.println("Attendance marked");
    }
}

public class UniversitySystem {

    public static void main(String[] args) {

        Student s = new Student();

        s.university();
        s.role();
        s.markAttendance();
    }
}
