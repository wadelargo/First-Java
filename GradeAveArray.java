/*
 * @author JOHN MEWARD LANOY
 */

import java.util.Scanner;
public class GradeAveArray {
    public static void main(String[] args) {

        int math, languages, science, literature, politics, pe, total;
        String[] subject= new String[6];
         subject[0] = "Math";
         subject[1] = "Languages";
         subject[2] = "Science";
         subject[3] = "Literature";
         subject[4] = "Politics";
         subject[5] = "PE";

         Scanner meward = new Scanner(System.in);

         System.out.println("Enter your score for " + subject[0] + " subject:");
          math = meward.nextInt();

         System.out.println("Enter your score for " + subject[1] + " subject:");
          languages = meward.nextInt();

         System.out.println("Enter your score for " + subject[2] + " subject:");
          science = meward.nextInt();

         System.out.println("Enter your score for " + subject[3] + " subject:");
          literature = meward.nextInt();

         System.out.println("Enter your score for " + subject[4] + " subject:");
          politics = meward.nextInt();

         System.out.println("Enter your score for " + subject[5] + " subject:");
          pe = meward.nextInt();

          total = pe + politics + literature + science + languages + math;

         float percentage = ((float) total / 600) * 100;

         System.out.println("__________________________________________________________");

         System.out.println("all of you're subjects average " + percentage + "%");
        
         meward.close();
    }    
}
 