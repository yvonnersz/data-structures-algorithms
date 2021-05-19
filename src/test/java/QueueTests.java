import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTests {
    Queue queue;

    @BeforeEach
    void setup() {
        queue = new Queue();
    }

    @Test
    void createGetterAndSetterForHead_isEmpty() {
        assertNull(queue.getHead(), "Create getters and setters for head field and returns null when queue is empty");
    }

    @Test
    void createGetterAndSetterForHead_setNodeAsHead() {
        Node node = new Node(1);
        queue.setHead(node);

        assertEquals(node, queue.getHead(), "Can set node as head");
    }

    @Test
    void createGetterAndSetterForTail_returnsNullIfEmpty() {
        assertNull(queue.getTail(), "Create getters and setters for tail field and returns null when queue is empty");
    }

    @Test
    void createGetterAndSetterForTail_setNodeAsTail() {
        Node node = new Node(1);
        queue.setTail(node);

        assertEquals(node, queue.getTail(), "Can set node as tail");
    }

    @Test
    void returnsTrueIfQueueIsEmpty() {
        assertTrue(queue.isEmpty(), "Returns true if queue is empty");
    }

    @Test
    void returnsFalseIfQueueIsNotEmpty() {
        Node node = new Node(1);
        queue.setHead(node);

        assertFalse(queue.isEmpty(), "Returns false is queue is not empty");
    }

    @Test
    void createPeekMethodThatReturnsFrontItemInQueueButDoesNotRemove() {
        Node firstNode = new Node(1);
        Node secondNode = new Node(2);

        queue.setHead(firstNode);
        firstNode.setNext(secondNode);
        queue.setTail(secondNode);

        assertEquals(firstNode, queue.peek(), "Create a peek() method that returns the front item in the queue but does not remove it");
    }

    @Test
    void createAddMethodThatAddsNewItemToBackOfQueue() {
        Node firstNode = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);

        queue.add(firstNode);
        queue.add(secondNode);
        queue.add(thirdNode);

        assertEquals(thirdNode, queue.getTail(), "Adds a new item to the back of the queue");
    }

    @Test
    void removeFrontItemInQueueAndReturnItem() {
        Node firstNode = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);

        queue.add(firstNode);
        queue.add(secondNode);
        queue.add(thirdNode);

        Node actual = queue.remove();

        assertEquals(firstNode, actual, "Removes the front item in the queue and returns it to the caller");
    }

    @Test
    void removeFrontItemInQueueAndReturnItem_countForTail() {
        Node firstNode = new Node(1);

        queue.add(firstNode);
        queue.remove();

        assertEquals(null, queue.getTail(), "Tail is null if head is null");
    }
}
