
public class LinkedList{
    Node head, tail;

    class Node{
        int data;
        Node next;

        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }

    }

    public void AddToTail(int data){
        if(head==null){
            head = tail = new Node(data, null);
        }else{
            tail.next = new Node(data, null);
            tail = tail.next;
        }
    }

    public void AddToHead(int data){
        if(head==null){
            head = tail = new Node(data, null);
        }else{
            head = new Node(data, head);
        }
    }

    public void AddAfter(int targetValue, int newdata){
        for(Node tmp = head; tmp!=null; tmp=tmp.next){
            if(tmp.data==targetValue){
                tmp.next = tail = new Node(newdata, tmp.next); 
            } 
        }
    }

    public void AddBefore(int targetValue, int newdata){
        Node newTarget = head;
        for(Node tmp1 = head; tmp1.data!=targetValue; tmp1=tmp1.next){
            newTarget = tmp1;
        }
        for(Node tmp = head; tmp!=null; tmp=tmp.next){
            if(tmp==newTarget&&targetValue==head.data){
                head = new Node(newdata, head);
            }
            else if(tmp==newTarget&&targetValue!=head.data){
                Node newNode = new Node(newdata, null);
                newNode.next = tmp.next;
                tmp.next = newNode;
            }
        }
    }

    public void show(){
        System.out.print("[");
        for(Node tmp = head; tmp!=null; tmp = tmp.next){
            if(tmp.next==null){
            System.out.print(tmp.data);
            }else{
                System.out.print(tmp.data + ", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();

        l1.AddToTail(11);
        l1.AddToTail(15);
        l1.AddToHead(2);
        l1.AddAfter(15, 21);
        l1.AddBefore(15, 18);
        l1.show();
    }
}