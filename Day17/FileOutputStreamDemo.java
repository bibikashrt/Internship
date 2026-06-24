
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

    public static void main(String[] args) {

        try (FileOutputStream fos
                = new FileOutputStream("student.txt")) {

            String data = "Welcome to Java I/O Streams";

            fos.write(data.getBytes());

            System.out.println("Data written successfully.");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
