
class Student {

    void study() {
        System.out.println("Student studies");
    }
}

class CollegeStudent extends Student {

    void attendClass() {
        System.out.println("Attending classes");
    }
}

class EngineeringStudent extends CollegeStudent {

    void code() {
        System.out.println("Engineering student writes code");
    }
}

public class StudentHierarchy {

    public static void main(String[] args) {

        EngineeringStudent s = new EngineeringStudent();

        s.study();
        s.attendClass();
        s.code();
    }
}
