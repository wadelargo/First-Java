public class AccountsLinkedList {
    Node head, tail;

    public AccountsLinkedList() {
        head=tail=null;
    }

    public void addToTail(Account data) {
        if(head==null) {
            head = tail = new Node(data, null);
        }else {
            tail.next = new Node(data, null);
            tail = tail.next;
        }
    }

    public void addToHead(Account data) {
        if(head==null) {
            head = tail = new Node(data, null);
        }else {
            head = new Node(data, head);
        }
    }

    public double sumBalance() {
        double sum=0;
        for(Node tmp=head; tmp!=null; tmp=tmp.next) {
            sum += tmp.data.getBalance();
        }

        return sum;
    }

    /**
     * Get the account with the largest balance
     * @return Account with the large balance
     */
    public Account highest() {
        double highest = head.data.getBalance();
        Account highestAccount = head.data;

        for(Node tmp=head.next; tmp!=null; tmp=tmp.next) {
            if(highest<tmp.data.getBalance()) {
                highest = tmp.data.getBalance();
                highestAccount = tmp.data;
            }
        }

        return highestAccount;
    }

    public void showData() {
        int n=1;
        for(Node tmp=head; tmp!=null; tmp=tmp.next) {
            System.out.println(n++ + ". Name: " + tmp.data.getName() + " Balance: " + tmp.data.getBalance());
        }
    }
}
