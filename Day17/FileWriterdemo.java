
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

    public static void main(String[] args) {

        try (FileWriter writer
                = new FileWriter("books.txt")) {

            writer.write("Database Systems");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
