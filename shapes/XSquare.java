//Ari Kinney
//Lab 5
import java.util.Scanner;

public class XSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int rows;
        int columns;
        int middleX;
        int middleY;

        //prompt the user for the value of n
        System.out.println("What is the number you want to use for n? ");
        num = scan.nextInt();

        if (num <= 0 ){ //this is able to take in negative number and will promt the user for error
            System.out.println("Error: n cannot be negative");
            System.exit(0);
            }

        //prompt the user for the cordinates of x and y
        System.out.println("Where do you want to put the X? (enter in format X Y): ");
        middleX = scan.nextInt();
        middleY = scan.nextInt();



        //this was copy and pasted from the square.java
        
        //Draw the square
        for ( rows = 0; rows < num; rows++) {
            for ( columns = 0; columns < num; columns++) {
                //first row
                if (rows == 0 || columns == 0 ){
                    System.out.print("* ");
                
                } else if( rows == num - 1||columns == num-1 ){
                    System.out.print("* ");
                }
                else if (rows == middleX && columns == middleY){ //this is the x spot
                    System.out.print("X ");
                }
                else {
                    System.out.print("  ");
                }   
            }
            System.out.println();// go to the next row
        
            }
            scan.close();
    
    }
}