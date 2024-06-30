import java.util.Scanner;

public class InputOutput1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hellow! My name is java!");

        System.out.println("What is youre name?");

        String name =sc.nextLine();

        System.out.println("Hello there, " + name + "!");

        sc.close();



        
    }
}