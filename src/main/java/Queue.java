public class Queue {
    private Node head;
    private Node tail;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Node peek() {
        return head;
    }

    public void add(Node node) {
        if (tail != null) {
            tail.setNext(node);
        }

        tail = node;

        if (head == null) {
            head = node;
        }
    }

    public Node remove() {
        Node previousHead = head;
        head = head.getNext();

        if (head == null) {
            tail = null;
        }

        return previousHead;
    }
}
