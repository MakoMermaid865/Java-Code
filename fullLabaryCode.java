// Sorry for spelling this was a rushed code
// Purpose: This program will determine the fine for a book that is late. 
//The program will ask the user for the number of days the book is late and if they are a VIP member. If the user is a VIP member the fine will be $0.50 for the first 5 days, $2.50 for 6-10 days, and $5.00 for 11 or more days. If the user is not a VIP member the fine will be $1.00 for the first 5 days, $5.00 for 6-10 days, and $10.00 for 11 or more days.
import java.util.Scanner;
public class fullLabaryCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        double book; // this is a double because we are using a decimal point
        String VIP;
        System.out.println(" Enter the number of days late: ");
        book = scan.nextInt();

        System.out.println(" Are you a vip member: Enter Yes or No ");
        VIP = scan.next();
//in this case we are using a nested if statement to determine the fine for the book    

        if ( VIP.equalsIgnoreCase("Yes")){ //this is a string method that will ignore the case of the input
            { if (book <= 5 ){
                book = 0.50;
                    
            } else if (book <= 10) {
                book = 2.50;
            } else {
                book = 5.00;
            }
            }
        }
        else { // this is the else statement for the vip member becuause they are not a vip member then they will be charged the regular fee
    
            if (book <= 5){
                book = 1;
            } else if (book <= 10 ) {
                book = 5;
            }
            else {
                book = 10;
            }
        }
        System.out.printf("%.2f%n", book);  // this is the format for the decimal point 
    }
}
