public class Reverse {
    public static void main(String[] args) {
        String s = "Hello";
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println("Reverse: " + rev);
    }
}