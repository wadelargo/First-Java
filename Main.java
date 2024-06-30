/*
 * A small program that will generate a multiplication table
 * with dynamic numbers of rows and columns.
 * @author John Meward Lanoy
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int r,c;

        System.out.println("Input number of columns (x)");
         r = sc.nextInt();
        while(r < 0 || r >15){
            System.out.println("Value input must not exceed ove 15" + "\n" + "enter columns (x)");
        }
        System.out.println("Input number of rows (y)");
         c = sc.nextInt();
        while(c< 0 || c>15){
            System.out.println("Value input must not exceed ove 15" + "\n" + "enter rows (y)");
            c = sc.nextInt();
        }
        int[][] data = new int[r][c];
    
        data = timesTable(r , c );

        sc.close();

        for (int row = 0; row < data.length ; row++) {
            for (int column = 0; column < data[row].length; column++)
            {
                System.out.printf("%4d ",data[row][column]);
            }
            System.out.println();
        }
    }
    public static int[][] timesTable(int r, int c)
    {
        int [][] yes = new int[r][c];
        for (int row = 0; row < yes.length ; row++)
        {
            for (int column = 0; column < yes[row].length; column++)
            {
                yes[row][column] = (row+1)*(column+1);
            }
        }
        return yes;
    }
    }