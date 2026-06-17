
public class ExceptionDemo {

    public static void main(String[] args) {

        System.out.println("Program Started");

        try {

            int num1 = 10;
            int num2 = 0;

            int result = num1 / num2;

            System.out.println("Result: " + result);

        } catch (Exception e) {

            int num1 = 10;
            int num2 = 0;

            int result = num1 / num2;

            System.out.println("Cannot divide by zero!");

        } finally {

            System.out.println("Finally block always runs.");

        }

        System.out.println("Program Ended");
    }
}
