public class StackOfStrings {
    public class Node {
        private String Data; 
        private Node Next;
    
        public Node(String Data, Node Next) {
            this.Data = Data;
            this.Next = Next; 
        }
    
        public String getData() {
            return Data;
        }
    
        public void setData(String Data) {
            this.Data = Data;
        }
    
        public Node getNext() {
            return Next;
        }
        
        public void setNext(Node Next) {
            this.Next = Next;
        }
    }

    private Node top; 
    private int count; 

    public StackOfStrings() {
        top = null; 
        count = 0;
    }


    /**
     * Push a node to the top of the list
     * @param Data
     */
    public void push(String Data) {
        if(top == null) {
            top = new Node(Data, null);
        }else{
            Node n = new Node(Data, top);
            top = n;
        }
        count++;
    }
    /**
     * Pop an Item from the list
     * @return
     * @throws Exception
     */
    public String pop() throws Exception {
        if(top != null){
            Node n = top;

            top = top.getNext();
            n.setNext(null);
            
            count --;

            return n.getData();
        }else {
            throw new Exception("You cannot pop from an empty stack");
        }
    }
    /*
     * @return
     * @throws Exception
     */
    public String peek() throws Exception {
        if(top != null) {
            return top.getData();
        }else {
            throw new Exception("You cannot peek from an empty stack");
        }
    }

    public int getCount(){
        return count;
    }

    public static void main(String[] args){
        StackOfStrings StrackString = new StackOfStrings();

        StrackString.push("birdie");
        StrackString.push("dogie");
        StrackString.push("fishy");
        StrackString.push("wadi");
        
        try {
            System.out.println("Push   " + StrackString.pop());
            System.out.println("Pop   " + StrackString.pop());
            System.out.println("Peek  " + StrackString.peek());
            System.out.println("Count "+StrackString.getCount());
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}

