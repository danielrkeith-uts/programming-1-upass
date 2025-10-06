public class Runner {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        System.out.println(stack.pop());

        stack.push("Fourth");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

}
