
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int secret = 7;
        int guess;

        do {
            System.out.print("Guess the number: ");
            guess = sc.nextInt();

            if (guess != secret) {
                System.out.println("Try Again!");
            }

        } while (guess != secret);

        System.out.println("Correct!");

        sc.close();
    }
}
