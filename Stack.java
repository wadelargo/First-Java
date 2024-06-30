public class Stack {
    Node top;

    public Stack() {
        top = null;
    }

    public void push(int data) {
        if(top==null) {
            top = new Node(data, null);
        }else {
            top = new Node(data, top);
        }
    }

    public Node pop() throws Exception {
        Node something;
        if(top==null) {
            throw new Exception("The stack is empty.");
        }else {
            something = top;
            something.next = null;
            top = top.next;
        }
        return something;
    }

    public Node peek() throws Exception {
        if(top==null) {
            throw new Exception("The stack is empty.");
        }else {
            return top;
        }
    }

}