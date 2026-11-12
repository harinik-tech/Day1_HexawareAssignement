
import java.util.ArrayDeque;
import java.util.Queue;

public class Task4_StackQueue {

    // CUSTOM STACK
    static class MyStack {

        int stack[] = new int[5];
        int top = -1;

        void push(int value) {

            if (top == 4) {
                System.out.println("Stack Overflow");
            }
            else {
                stack[++top] = value;
            }
        }

        int pop() {

            if (top == -1) {
                System.out.println("Stack Underflow");
                return -1;
            }

            return stack[top--];
        }
    }

    // CUSTOM QUEUE
    static class MyQueue {

        int queue[] = new int[5];
        int front = 0;
        int rear = -1;

        void enqueue(int value) {

            if (rear == 4) {
                System.out.println("Queue Full");
            }
            else {
                queue[++rear] = value;
            }
        }

        int dequeue() {

            if (front > rear) {
                System.out.println("Queue Empty");
                return -1;
            }

            return queue[front++];
        }
    }

    public static void main(String args[]) {

        System.out.println("CUSTOM STACK");

        MyStack s = new MyStack();

        s.push(101);
        s.push(102);
        s.push(103);

        System.out.println("Undo Order: " + s.pop());

        System.out.println("\nCUSTOM QUEUE");

        MyQueue q = new MyQueue();

        q.enqueue(101);
        q.enqueue(102);
        q.enqueue(103);

        System.out.println("Dispatch Order: " + q.dequeue());

        // BUILT-IN STACK
        System.out.println("\nBUILT-IN STACK");

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(101);
        stack.push(102);
        stack.push(103);

        System.out.println("Undo Order: " + stack.pop());

        // BUILT-IN QUEUE
        System.out.println("\nBUILT-IN QUEUE");

        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(101);
        queue.offer(102);
        queue.offer(103);

        System.out.println("Dispatch Order: " + queue.poll());
    }
}
