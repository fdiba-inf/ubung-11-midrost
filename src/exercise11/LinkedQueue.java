package exercise11;

public class LinkedQueue {
    private Node frontNode;
    private Node backNode;

    public boolean isEmpty() {
        // Check if queue has no elements
        return false;
    }

    public void offer(String data) {
        // Offer element to queue
    }

    public String poll() {
        // Poll element from queue
        return null;
    }

    @Override
    public String toString() {
        return NodeUtils.createNodeTraversalString(frontNode);
    }
}
