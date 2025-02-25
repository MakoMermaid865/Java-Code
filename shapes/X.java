// Name: Ari Kinney
//  Date: 10/02/23
// CS 1180 lab
// Practice Problem-Lab 5-X

import java.util.Scanner;

//Practice using methods 
public class X {
// This method will print the star of X
    public static void star() {
        System.out.print("* ");
    }
// This method will print the spaces from X include a for loop
    public static void space(int spaceX) {
        for (int i = 0; i < spaceX; i++) {
            System.out.print("  ");
        }
    }
// This method is to find the x spot that will be placed in the middle of the circle
    public static void xspot() {
        System.out.print("X ");
    }

    public static void main(String[] args) {
        // scanner to get the user input for n and print statment
        Scanner userScanner = new Scanner(System.in);
        System.out.print("What is the value of n? ");
        int numN = userScanner.nextInt();
        if (numN<=0) {
            System.out.println("Error: n cannot be negative");
            userScanner.close();
            System.exit(0);
        }
        // scan the user input for the cordinates of x and y 
        System.out.print("Where do you want to put the X? (enter in format X Y): ");
        int middleX = userScanner.nextInt();
        int middleY = userScanner.nextInt();

        for (int i = 0; i < numN; i++) {
            // loops until we reach the max size defined above
            for (int j = 0; j < numN; j++) {
//Print the full square
                if (j == 0 || i == 0) {
                    // use method star to reprint statement
                    star();
                } else if (j == numN - 1 || i == numN - 1) {
                    star();
                    // Get the coordinat to print xspot and place anywhere in x
                } else if (i == middleX && j == middleY) {
                    // use method xspot to recall the statement
                    xspot();
                // Make the x hollow
                } else {
                     // use method space to recall the statement
                    space(1);
                }
            }
            // we print a new line here to start on the next row
            System.out.println();
        }

    }
}
//





