package exercise11;

public class LinkedStack {
    private Node topNode;

    public boolean isEmpty() {
        // Check if stack has no elements
        return false;
    }

    public void push(String data) {
        // Push element to stack
    }

    public String pop() {
        // Pop element from stack
        return null;
    }

    @Override
    public String toString() {
        return NodeUtils.createNodeTraversalString(topNode);
    }
}
