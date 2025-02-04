// Write a program that determines the late fee for a movie returned late.
// The program should ask the user for the number of days late. If the movie is 7 days or less overdue, print the fine is $90. If the movie is 8-14 days overdue, print the fine is $100. If the movie is more than 14 days overdue, print the fine is $500.
import java.util.Scanner;

public class LateFee {
    public static void main(String[] args) {
        //write a program the determine the late fee for a movie returned late
        // Print enter number of days late
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days late (formate: 'days')");
            int days = scanner.nextInt();
        // Write a if statement 
        // if the movie is 7 days or less overdue, print the fine is 90 dollar 
        // && helps combine the varible and define both if both statements are true
        if (days <= 7){ 
        System.out.println("The fine for your book is 90 dollars ");
        }
        // if the book is 8-14 days overdue, print the fine is 100 dollars
        else if (days <= 10 && days > 5){
        System.out.print("The fine for your book is 100 dollars");
        }
        // if the book is more than 14 days overdue, print the fine is 500 dollars
        else {
        System.out.print("The fine for your book is 500 dollar");
        }
    // close the statment//
scanner.close();
    
    }
}
