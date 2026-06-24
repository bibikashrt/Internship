
import java.io.File;
import java.io.IOException;

public class CreateFileDemo {

    public static void main(String[] args) {
        try {
            File file = new File("books.txt");

            if (file.createNewFile()) {
                System.out.println("File Created");
            } else {
                System.out.println("File Already Exists");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
