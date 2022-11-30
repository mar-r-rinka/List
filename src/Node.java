public class Node {
    int value;
    Node prev;

    public Node(int value, Node prev) {
        this.value = value;
        this.prev = prev;
    }

    @Override
    public String toString() {
        if (prev != null) {
            return value + " " + "->" + " ";
        } else return value + " ";
    }
}

