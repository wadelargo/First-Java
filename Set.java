/**
 * Array implementation of SET Data Structure
 * Programmer: Benjie Lenteria
 * Date: September 26, 2022
 */

public class Set {
    boolean[] data;
    int max;

    public Set(int max) {
        this.max = max;
        data = new boolean[max+1];
    }

    /**
     * Add num to the set
     * @param num
     */
    public void add(int num) {
        this.data[num] = true;
    }

    /**
     * Remove a number from the set
     * @param num
     */
    public void remove(int num) {
        this.data[num] = false;
    }

    /**
     * Add the set s to this set
     * @param s
     */
    public void add(Set s) {
        for(int i=0; i<s.data.length; i++) {
            if(s.data[i]) {
                add(i);
            }
        }
    }

    public boolean isSubset(Set s) {
        for(int i=0; i<this.data.length; i++) {
            if(data[i]) {
                if(data[i]!=s.data[i]) return false;
            }
        }
        return true;
    }

    public void show() {
        String output = "{";
        for(int i=0; i<=max; i++) {
            if(data[i]) {
                output+= i+",";
            }
        }

        System.out.println(output.substring(0,output.length()-1) + "}");
    }

    public static void main(String[] args) {
        Set s1 = new Set(100);

        s1.add(23);
        s1.add(12);
        s1.add(43);
        s1.add(65);
        s1.add(78);

        System.out.println("The contents of Set s1");
        s1.show();

        Set s2 = new Set(100);
        s2.add(45);
        s2.add(40);
        s2.add(99);
        s2.add(23);

        System.out.println("The contents of s2");
        s2.show();

        System.out.println("Is s2 a subset of s1? " + s2.isSubset(s1));

        s1.add(s2);

        System.out.println("New values of s1");
        s1.show();

        System.out.println("Is s2 a subset of s1? " + s2.isSubset(s1));

        s2.add(11);

        System.out.println("Is s2 a subset of s1? " + s2.isSubset(s1));
    }
}