import java.util.Scanner;

public class TwoDim {
    public static void main(String[] args) {
        //rows pertain to processor
        //cols peratin to memory
        /**
         *           4G     8G     16G   32G     
         * Celeron   23400  24500  26200 28400
         * i3        24800  25300  29900 32300
         * i5        27900  28800  33700 35800
         * i7        31800  34700  38800 44100
         */
        float priceMatrix[][] = {
            {23400f, 24500f, 26200f, 28400f},
            {24800f, 25300f, 29900f, 32300f},
            {27900f, 28800f, 33700f, 35800f},
            {31800f, 34700f, 38800f, 44100f}
        };

        Scanner sc = new Scanner(System.in);

        System.out.println("What type of Processor?");
        System.out.println("0: Celeron");
        System.out.println("1: i3");
        System.out.println("2: i5");
        System.out.println("3: i7");
        int processor = sc.nextInt();

        System.out.println("How much RAM?");
        System.out.println("0: 4GB");
        System.out.println("1: 8GB");
        System.out.println("2: 16GB");
        System.out.println("3: 32GB");
        int memory = sc.nextInt();

        System.out.println("The price of the laptop you are looking for is: " 
            + priceMatrix[processor][memory]);
    }
}