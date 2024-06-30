import java.util.Set;
import java.util.HashSet;

 public class IntersectDIF {

    public static void main(String[] args) {
        
        Set<Integer> set1 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        System.out.println("Set1: " + set1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("Set2: " + set2);

        set1.removeAll(set2);
        System.out.println("Difference of set 1 & 2: " + set1);
        
        Set<Integer> CopyOFset1 = new HashSet<>();

        CopyOFset1.add(1);
        CopyOFset1.add(2);
        CopyOFset1.add(3);
        CopyOFset1.add(4);
        CopyOFset1.add(5);
        
        Set<Integer> CopyOFset2 = new HashSet<>();
        CopyOFset2.add(3);
        CopyOFset2.add(4);
        CopyOFset2.add(5);
        
        CopyOFset1.retainAll(CopyOFset2);
        System.out.println("Intersection of set 1 & 2: " + CopyOFset1);
    }  
}