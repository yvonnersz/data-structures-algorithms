import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NodeTests {
    @Test
    void newNodeInstantiatesWithData() {
        Node node = new Node(1);
        assertEquals(1, node.getData(), "Node instantiates with an integer");
    }

    @Test
    void createGetAndSetNextMethodForNode() {
        Node firstNode = new Node(1);
        Node secondNode = new Node(2);

        firstNode.setNext(secondNode);

        assertEquals(secondNode, firstNode.getNext(), "Create getNext() and setNext() to grab and set the next node");
    }

}
