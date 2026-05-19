
public class GreatestNumber {

    public static void main(String[] args) {
        int a = 15, b = 20, c = 10;
        if (a >= b && a >= c) {
            System.out.println("A is greatest");
        } else if (b >= a && b >= c) {
            System.out.println("B is greatest");
        } else {
            System.out.println("C is grestest");
        }
    }
}
