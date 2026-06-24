
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourcesDemo {

    public static void main(String[] args) {

        try (FileWriter writer
                = new FileWriter("message.txt")) {

            writer.write("Resources are closed automatically.");

            System.out.println("Data saved.");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
