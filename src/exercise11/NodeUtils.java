package exercise11;

public class NodeUtils {
    public static String createNodeTraversalString(Node node) {
        StringBuilder traversalBuilder = new StringBuilder();

        Node nextNode = node;
        while (nextNode != null) {
            traversalBuilder.append(nextNode.getData());
            nextNode = nextNode.getNextNode();
            if (nextNode != null) {
                traversalBuilder.append("->");
            }
        }

        return traversalBuilder.toString();
    }
}
