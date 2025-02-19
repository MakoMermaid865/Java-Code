//Ari Kinney
//practice with loops

//https://www.geeksforgeeks.org/printing-triangle-pattern-in-java/

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int shape;
        System.out.println("How many row do you want to have? ");
        shape = scan.nextInt();

        //This is the nested for loop for the triangle
        //for the number of rows
        for (int i = 0; int i <= shape; ++i){ 
            //for the number of spaces
            for(int j = 0; j<=  );{
                System.out.println(" ");
            }
            //for the number of stars
            for (int j =0 ; j ){
                System.out.println("$");
            }
            //new line after row
            shape = scan.nextLine();
        }
    }
}
