
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CSVFileHandling {

    public static void main(String[] args) {
        try {
            File file = new File("student.csv");
            if (file.createNewFile()) {
                System.out.println("CSV File created");
            } else {
                System.out.println(" CSV File already existed");
            }

            try (FileWriter fw = new FileWriter("student.csv")) {
                fw.write("Name,age,course\n");
                fw.write("Sheron,20,Java");
                System.out.println("Data saved");
            }

            try (FileWriter fw = new FileWriter("student.csv", true)) {
                fw.write("\nJohn,21,Python");
                System.out.println("Data appended");
            }

            System.out.println("\nReading CSV File:\n");

            try (BufferedReader br = new BufferedReader(new FileReader("student.csv"))) {

                String line;

                while ((line = br.readLine()) != null) {
                    System.out.println(line);

                }

            }

            System.out.println("\nFile Name: " + file.getName());

            System.out.println("Size: " + file.length() + " bytes");

            if (file.delete()) {

                System.out.println("\nCSV file deleted");

            } else {

                System.out.println("\nUnable to delete");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
