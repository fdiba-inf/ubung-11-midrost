package exercise11;

public class LinkedStack {
    private Node topNode;

    public boolean isEmpty() {
        // Check if stack has no elements
        return this.topNode == null;
    }

    public void push(String data) {
        // Push element to stack
        Node currentNode = new Node(data);
        if (this.isEmpty()) {
            this.topNode = currentNode;
        } else {
            currentNode.setNextNode(this.topNode);
            this.topNode = currentNode;
        }

    }

    public String pop() {
        // Pop element from stack
        String data = "";
        if (this.isEmpty()) {
            return null;
        } else {
            Node currentNode = this.topNode.getNextNode();
            data = this.topNode.getData();
            this.topNode = currentNode;
            this.topNode.setNextNode(currentNode.getNextNode());
        }
        return data;
    }

    @Override
    public String toString() {
        return NodeUtils.createNodeTraversalString(topNode);
    }
}
