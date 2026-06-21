
import java.io.*;

public class FileDemo {

    public static void main(String[] args)
            throws Exception {

        File file = new File("student.txt");

        file.createNewFile();

        try (FileWriter fw = new FileWriter("student.txt")) {

            fw.write("Name: Sheron\n");

            fw.write("Course: Java");

        }

        try (FileWriter fw = new FileWriter("student.txt", true)) {

            fw.write("\nCollege: XYZ");

        }

        System.out.println("Name:" + file.getName());
        System.out.println("Path:" + file.getAbsolutePath());
        System.out.println("Readable:" + file.canRead());
        System.out.println("Writable:" + file.canWrite());

        try (FileReader fr = new FileReader("student.txt")) {

            int ch;

            while ((ch = fr.read()) != -1) {

                System.out.print((char) ch);

            }

        }

    }

}
