import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class BubbleSort {

    public void sort(int[] arr) {
        int n = arr.length;

        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-i-1; j++) {
                //compare j and j+1
                if(arr[j]>arr[j+1]) {
                    //swap values

                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
    

    private void showArray(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("");
    }
    
    
    public static void main(String[] args) {
        int n = 99000;
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = (int)(Math.random()*n);
        }

        BubbleSort os = new BubbleSort();

        LocalDateTime start = LocalDateTime.now();

        os.sort(arr);

        LocalDateTime end = LocalDateTime.now();

        System.out.println("Start " + start.format(DateTimeFormatter.ofPattern("hh:mm:ss a")));
        System.out.println("End " + end.format(DateTimeFormatter.ofPattern("hh:mm:ss a")));
    }
}