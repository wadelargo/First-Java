public class MyAwesomeLinkedList {
    ObjNode head, tail;

    public MyAwesomeLinkedList() {
        head = tail = null;
    }

    public void addToTail(Object data) {
        if(head==null) {
            head = tail = new ObjNode(data, null, null);
        }else {
            tail.next = new ObjNode(data, null, tail);
            tail = tail.next;
        }
    }

    public void addToHead(Object data) {
        if(head==null) {
            head = tail = new ObjNode(data, null, null);
        }else {
            head.prev = new ObjNode(data, head, null);
            head = head.prev;
        }
    }

    public void showData() {
        System.out.println("");
        for(ObjNode tmp=head; tmp!=null; tmp=tmp.next) {
            System.out.println(tmp.data);
        }
        System.out.println("");
    }
}
