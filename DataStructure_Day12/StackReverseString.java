
import java.util.Stack;

public class StackReverseString {

    public static void main(String[] args) {
        String input = "HELLO";

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }

}
