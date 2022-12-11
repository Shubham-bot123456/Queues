import java.util.Stack;

public class QueueUsingTwoStacks {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int number) {
        stack1.push(number);
    }


    public int dequeue() {
        if (stack1.isEmpty() && stack2.isEmpty())
            throw new IllegalStateException("no element!");
        if (stack2.isEmpty())
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        return stack2.pop();
    }

    public int peek() {
        if (stack1.isEmpty() && stack2.isEmpty())
            throw new IllegalStateException("no element!");
        if (stack2.isEmpty())
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        return stack2.peek();
    }
}
