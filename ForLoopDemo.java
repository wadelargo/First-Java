
import java.util.Scanner;

public class ForLoopDemo {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("This program will display the series of numbers from startup end with a label besides taht whether that number is Odd or Even");

        System.out.println("Please enter the starting number");
        int f = sc.nextln();

        System.out.println("Please enter the Ending number (Must be larger than Starting number");
        int s = sc.nextln();

        for(int o =f; f <=s; f++) {
            if (f%2==0)
            System.out.println(f + " is Even");
            else
            System.out.println(f + " is Odd");

        }
    }
}