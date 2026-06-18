
public class NestedTryDemo {

    public static void main(String[] args) {

        try {

            System.out.println("Outer try block");

            try {

                int x = 10 / 0;

            } catch (ArithmeticException e) {

                System.out.println("Inner catch: Cannot divide by zero");
            }

            System.out.println("Program continues");

        } catch (Exception e) {

            System.out.println("Outer catch");
        }
    }
}
