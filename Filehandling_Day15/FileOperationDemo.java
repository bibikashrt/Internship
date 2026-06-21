
import java.io.*;

class FileOperationDemo {

    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("student.txt");

            writer.write("Name: Sheron\n");
            writer.write("Course: Java");

            writer.close();

            System.out.println("Data saved successfully");

            FileWriter appendWriter = new FileWriter("student.txt", true);

            appendWriter.write("\nCollege: XYZ College");

            appendWriter.close();

            System.out.println("Data appended successfully");

            FileReader reader
                    = new FileReader("student.txt");

            int ch;

            System.out.println("\nReading file:");

            while ((ch = reader.read()) != -1) {

                System.out.print((char) ch);

            }

            reader.close();

        } catch (IOException e) {

            System.out.println("Error: " + e);

        }

    }
}
