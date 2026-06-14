
import java.util.ArrayList;

class MyStack {

    ArrayList<Integer> stack = new ArrayList<>();

    public void push(int value) {
        stack.add(value);
        System.out.println(value + " pushed to stack");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot pop.");
            return -1;
        }
        int top = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return top;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Nothing to peek.");
            return -1;
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }

    public int size() {
        return stack.size();
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Stack (top → bottom): ");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.print(stack.get(i));
            if (i != 0) {
                System.out.print("   ");
            }
        }
    }
}

public class StackDemo2 {

    public static void main(String[] args) {

        MyStack myStack = new MyStack();

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);

        myStack.display();

        System.out.println("Peek top: " + myStack.peek());

        System.out.println("Popped: " + myStack.pop());
        System.out.println("Popped: " + myStack.pop());

        myStack.display();

        System.out.println("Size now: " + myStack.size());

        System.out.println("Popped: " + myStack.pop());
        System.out.println("Popped: " + myStack.pop());

        myStack.pop();

        System.out.println("Is stack empty? " + myStack.isEmpty());
    }
}
