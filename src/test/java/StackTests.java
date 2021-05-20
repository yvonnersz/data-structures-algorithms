import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTests {
    Stack stack;

    @BeforeEach
    void setup() {
        stack = new Stack();
    }

    @Test
    void hasGettersAndSettersForTopField_shouldReturnNullIfEmpty() {
        assertNull(stack.getTop(), "Create getter and setter for top field and should return null if stack is empty");
    }

    @Test
    void hasGettersAndSettersForTopField_shouldBeAbleToPassNode() {
        Node node = new Node(1);
        stack.setTop(node);

        assertEquals(node, stack.getTop(), "Should be able to set top as Node");
    }

    @Test
    void shouldReturnTrueWhenStackIsEmpty() {
        assertTrue(stack.isEmpty());
    }

    @Test
    void shouldReturnFalseWhenStackIsEmpty() {
        Node node = new Node(1);
        stack.setTop(node);
        assertFalse(stack.isEmpty());
    }

    @Test
    void createPeekMethodToReturnTopObject() {
        Node firstNode = new Node(1);
        Node secondNode = new Node(2);
        stack.setTop(firstNode);
        firstNode.setNext(secondNode);

        assertEquals(firstNode, stack.peek(), "Returns the top node but leaves it in stack");
    }

    @Test
    void createPushMethodToAddNewObjectOnTop() {
        Node firstNode = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);

        stack.push(firstNode);
        stack.push(secondNode);
        stack.push(thirdNode);

        assertEquals(thirdNode, stack.getTop(), "Adds a new object to the top of the stack");
    }

    @Test
    void createPushMethodToAddNewObjectOnTop_setNext() {
        Node firstNode = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);

        stack.push(firstNode);
        stack.push(secondNode);
        stack.push(thirdNode);

        assertEquals(secondNode, stack.getTop().getNext());
        assertEquals(firstNode, secondNode.getNext());
    }

    @Test
    void createRemoveMethodToRemoveTopItemAndReturnItem() {
        Node firstNode = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);

        stack.push(firstNode);
        stack.push(secondNode);
        stack.push(thirdNode);

        Node actual = stack.remove();
        assertEquals(thirdNode, actual, "Removes the front item in the queue and returns to caller");
    }

}
