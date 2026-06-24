
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

    public static void main(String[] args) {

        try (FileReader reader
                = new FileReader("books.txt")) {

            int data;

            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
