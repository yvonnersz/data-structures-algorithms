public class Stack {
    private Node top;

    public Node getTop() {
        return top;
    }

    public void setTop(Node top) {
        this.top = top;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public Node peek() {
        return top;
    }

    public void push(Node node) {
        Node previousTopNode = top;
        top = node;
        top.setNext(previousTopNode);
    }

    public Node remove() {
        Node previousTop = top;
        top = top.getNext();

        return previousTop;
    }
}
