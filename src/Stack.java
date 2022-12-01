public class Stack {
    private Node head;

    private Node newHead;

    public void push(int value) {
        if (head == null) {
            head = new Node(value, null);
            head.value = value;
        } else {
            Node prev = head;
            prev.value = head.value;
            Node node = new Node(value, prev);
            node.value = value;
            head = node;
        }
    }

    public void pop() {
        if (head == null) {
            System.out.println("нет элементов!");
        } else {
            head = head.prev;
        }
    }

    public void printme() {
        if (head == null) {
            System.out.println("Empty");
        } else {
            Node current = head;
            while (current != null) {
                System.out.print(current);
                current = current.prev;
            }
            System.out.println();
        }
    }

    public ReverseStack reverse(Stack stack) {
        ReverseStack reverseStack = new ReverseStack();
        while (head != null) {
            newHead = reverseHead(stack);
            reverseStack.push(newHead.value);


        }
        return reverseStack;
    }

    public Node reverseHead(Stack stack) {
        if (head == null)
            return null;
        else {
            newHead = head;
            stack.pop();
            return newHead;
        }
    }
}