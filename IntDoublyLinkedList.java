public class IntDoublyLinkedList {
    Node head, tail;

    public IntDoublyLinkedList() {
        head = tail = null;
    }

    public void addToTail(int data) {
        if(head==null) {
            head = tail = new Node(data, null, null);
        }else {
            tail.next = new Node(data, null, tail);
            tail = tail.next;
        }
    }

    public void addToHead(int data) {
        if(head==null) {
            head = tail = new Node(data, null, null);
        }else {
            head.prev = new Node(data, head, null);
            head = head.prev;
        }
    }

    public void showData() {
        System.out.println("");
        for(Node tmp=head; tmp!=null; tmp=tmp.next) {
            System.out.print("<-[" + tmp.data + "]->");
        }
        System.out.println("");
    }

    public void removeTail() {
        Node tmp = tail;
        tmp.prev.next = null;
        tail = tmp.prev;
        tmp.prev=null;
        tmp=null;
    }

    public void removeHead() {
        Node tmp = head;
        tmp.next.prev = null;
        head = tmp.next;
        tmp.next = null;
        tmp = null;
    }

    public int sum() {
        int sum  = 0;
        for(Node tmp=head; tmp!=null; tmp=tmp.next) {
            sum += tmp.data;
        }

        return sum;
    }

    public void remove(int data) {
        if(data==head.data) {
            removeHead();
        }else if(data==tail.data) {
            removeTail();
        }else {
            //search data
            Node tmp;
            for(tmp=head; tmp!=null; tmp=tmp.next) {
                if(tmp.data==data) break;
            }

            if(tmp!=null) {
                tmp.prev.next = tmp.next;
                tmp.next.prev = tmp.prev;
                tmp.next = null;
                tmp.prev = null;
                tmp = null;
            }
        }
    }
}
