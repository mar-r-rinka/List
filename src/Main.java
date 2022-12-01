public class Main {
    public static Stack stack = new Stack();


    public static void main(String[] args) {
        stack.printme();
        stack.push(0);
        stack.printme();
        stack.push(1);
        stack.printme();
        stack.push(2);
        stack.printme();
        stack.push(3);
        stack.printme();
        stack.push(4);
        stack.printme();
        stack.push(5);
        stack.printme();
        stack.pop();
        stack.printme();
        stack.pop();
        stack.printme();
        stack = stack.reverse(stack);
        stack.printme();
        stack.pop();
        stack.printme();
        stack.pop();
        stack.printme();
        stack = stack.reverse(stack);
        stack.printme();
        stack.pop();
        stack.printme();
        stack.pop();
        stack.printme();
    }


}
