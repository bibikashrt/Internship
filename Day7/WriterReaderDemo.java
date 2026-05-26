
interface Writer {

    void write();
}

interface Reader {

    void read();
}

class Student implements Writer, Reader {

    public void write() {
        System.out.println("Student writes notes");
    }

    public void read() {
        System.out.println("Student reads books");
    }
}

public class WriterReaderDemo {

    public static void main(String[] args) {

        Student s = new Student();

        s.write();
        s.read();
    }
}
