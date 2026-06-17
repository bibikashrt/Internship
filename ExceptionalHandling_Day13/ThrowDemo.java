
public class ThrowDemo {

    public static void main(String[] args) {

        int age = 20;

        try {

            if (age < 18) {

                throw new ArithmeticException("You are not eligible to vote.");

            }

            System.out.println("You can vote.");

        } catch (ArithmeticException e) {

            System.out.println(e.getMessage());

        }

    }
}
