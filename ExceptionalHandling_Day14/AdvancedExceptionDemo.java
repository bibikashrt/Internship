
import java.util.InputMismatchException;
import java.util.Scanner;

public class AdvancedExceptionDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Started");

        try {

            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            int result = divideNumbers(num1, num2);

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            System.out.println("Error: Cannot divide by zero.");
            System.out.println("Reason: " + e.getMessage());

        } catch (InputMismatchException e) {

            System.out.println("Error: Please enter only integer values.");

        } catch (Exception e) {

            System.out.println("Unexpected error occurred.");

        } finally {

            scanner.close();
            System.out.println("Scanner closed.");
            System.out.println("Finally block executed.");

        }

        System.out.println("Program Ended");
    }

    public static int divideNumbers(int a, int b) {

        return a / b;

    }
}
