//Ari Kinney
//Lab 5
import java.util.Scanner;

public class NumSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int rows;
        int columns;
        System.out.println("What is the number you want to use for n?");
        num = scan.nextInt();

        //using a for loop to layout the square
        for (rows = 1; rows <= num; rows++) {
            for (columns = 1; columns <= num; columns++) {
                if (rows == 1 || rows == num || columns == 1 || columns == num) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
