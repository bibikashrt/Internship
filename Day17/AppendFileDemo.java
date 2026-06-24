
import java.io.FileWriter;
import java.io.IOException;

public class AppendFileDemo {

    public static void main(String[] args) {

        try (FileWriter writer
                = new FileWriter("books.txt", true)) {

            writer.write("\nOperating System");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
