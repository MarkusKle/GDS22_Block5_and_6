package Stack_Generic;

public class DemoStack2App {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>(new Integer[9]);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());

        // Warteschlange Programmieren als Übungsbeispiel!!!

    }
}
