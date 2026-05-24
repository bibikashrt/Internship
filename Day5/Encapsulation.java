
class Student {

    private int marks;   // private data

    public void setMarks(int m) {   // setter
        marks = m;
    }

    public int getMarks() {   // getter
        return marks;
    }
}

public class Encapsulation {

    public static void main(String[] args) {
        Student s = new Student();
        s.setMarks(80);
        System.out.println(s.getMarks());
    }
}
