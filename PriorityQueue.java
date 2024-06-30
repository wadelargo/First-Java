/**
 * Week 10
 * @author John Meward Lanoy
 * November 21, 2022
 */
public class PriorityQueue {
    private Node first, last;
    private int Number;

    public PriorityQueue() {
        first = last = null;
        Number = 0 ;
    }

    public void enqueue(Object data){
        if(first == null){
            first = last = new Node(data, null);
        }else{
            last.setNext(new Node(data, null));
            last = last.getNext();
        }
        Number++;
    }

    public Object dequeue() throws Exception{
        if(first == null){
            throw new Exception("The queue is empty.");
        }else{
            Node n = first; 
            first = first.getNext(); 

            n.setNext(null);
            Number--;

            return n.getData();
        }
        
    }

    public void show(){
        for(Node tmp = first ; tmp!=null; tmp=tmp.getNext()){
            if(tmp!=first) 
            System.out.print(" <- ");
            System.out.print("[" + tmp.getData() + "]");

        }
        System.out.println("");
        System.out.println("=======================================================================================================================");
    }

    public int getNumber(){
        return Number;
    }

    public static void main(String[] args)  {

        PriorityQueue line = new PriorityQueue();

        Person NAME1 = new Person("Juanita Laroga");
        Person NAME2 = new Person("Mariano Bulasa");
        Person NAME3 = new Person("Juan Tiborcio");
        Person NAME4 = new Person("Crisilda Flores");
        Person NAME5 = new Person("Jose Poncho");
        Person NAME6 = new Person("Brandon Garcia");
        
        line.enqueue(NAME1);
        line.enqueue(NAME2);
        line.enqueue(NAME3);
        line.enqueue(NAME4);
        line.enqueue(NAME5);
        line.enqueue(NAME6);
        line.show();

        try{
            while(line.getNumber() > 0){
                System.out.println(line.dequeue());
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }

    }
    
}
