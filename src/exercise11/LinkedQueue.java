package exercise11;

public class LinkedQueue {
    private Node frontNode;
    private Node backNode;

    public boolean isEmpty() {
        // Check if queue has no elements
        return this.backNode == null && this.frontNode == null;
    }

    public void offer(String data) {
        // Offer element to queue
        Node currentNode = new Node(data);
        if (this.isEmpty()) {
            this.frontNode = this.backNode = currentNode;
        } else {
            this.backNode.setNextNode(currentNode);
            this.backNode = currentNode;
        }
    }

    public String poll() {
        // Poll element from queue
        String data = "";
        if (this.isEmpty()) {
            return null;
        } else {
            Node currentNode = this.frontNode.getNextNode();
            data = this.frontNode.getData();
            this.frontNode = currentNode;
            this.frontNode.setNextNode(currentNode.getNextNode());
        }

        return data;
    }

    @Override
    public String toString() {
        return NodeUtils.createNodeTraversalString(frontNode);
    }
}
