
import java.io.*;

public class IOExceptionDemo {

    public static void main(String[] args) {

        try {

            File file = new File("abc.txt");

            if (file.exists()) {

                FileReader fr = new FileReader(file);

                System.out.println("File opened successfully");

                fr.close();

            } else {

                System.out.println("File does not exist");
            }

        } catch (IOException e) {

            System.out.println("IOException handled");
        }
    }
}
