
import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Apple");
        stack.push("Banana");
        stack.push("Mango");

        System.out.println("Stack: " + stack);

        System.out.println("Top element: " + stack.peek());

        System.out.println("Removed: " + stack.pop());

        System.out.println("Stack after pop: " + stack);

        System.out.println("Is stack empty? " + stack.empty());

        System.out.println("Position of Apple: " + stack.search("Apple"));
    }
}
