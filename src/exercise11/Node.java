package exercise11;

public class Node {
    private final String data;
    private Node nextNode;

    public Node(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
