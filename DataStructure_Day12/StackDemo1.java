
import java.util.Stack;

public class StackDemo1 {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        stack.push("Google");
        stack.push("Youtube");
        stack.push("Facebook");
        stack.push("Instagram");

        System.out.println("Stack: " + stack);

        System.out.println("The first element is: " + stack.peek());
        System.out.println("Remove the first element: " + stack.pop());

        System.out.println("The current page is: " + stack.peek());
        System.out.println("Remove the current page: " + stack.pop());

        System.out.println("Now at: " + stack.peek());
        System.out.println("Going from: " + stack.pop());

        System.out.println("Now at: " + stack.peek());

        System.out.println("Is stack empty? " + stack.empty());

        System.out.println("Position of Google: " + stack.search("Google"));

    }
}
