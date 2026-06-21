
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileHandlingDemo1 {

    public static void main(String[] args) {
        try {
            File file = new File("student.txt");

            if (file.createNewFile()) {
                System.out.println("File Created");
            } else {
                System.out.println("File already exist");
            }

            System.out.println("\nFile Information:");

            System.out.println("Name:" + file.getName());
            System.out.println("Path:" + file.getAbsolutePath());
            System.out.println("Readable:" + file.canRead());
            System.out.println("Writable:" + file.canWrite());

            try (FileWriter fw = new FileWriter("student.txt")) {
                fw.write("Name: Sheron\n");
                fw.write("Course: Java");

                System.out.println("\nData saved");
            }

            try (FileWriter fw = new FileWriter("student.txt", true)) {
                fw.write("\nCollege: XYZ");

                System.out.println("Data appended");
            }

            System.out.println("\nReading file:");

            try (FileReader fr
                    = new FileReader("student.txt")) {
                int ch;

                while ((ch = fr.read()) != -1) {
                    System.out.print((char) ch);
                }
            }

            System.out.println("\n\nSize:" + file.length() + " bytes");

            if (file.delete()) {
                System.out.println("\nFile deleted");
            } else {
                System.out.println("\nUnable to delete");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
