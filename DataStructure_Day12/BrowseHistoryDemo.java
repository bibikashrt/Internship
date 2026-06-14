
import java.util.Stack;

public class BrowseHistoryDemo {

    public static void main(String[] args) {

        Stack<String> history = new Stack<>();

        history.push("Google");
        history.push("YouTube");
        history.push("Instagram");
        history.push("GitHub");

        System.out.println("Current History: " + history);

        System.out.println("Current Page: " + history.peek());

        System.out.println("Going Back from: " + history.pop());
        System.out.println("Now at: " + history.peek());

        System.out.println("Going Back from: " + history.pop());
        System.out.println("Now at: " + history.peek());

        System.out.println("Final History: " + history);
    }
}
