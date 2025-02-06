
import java.util.Scanner;
public class moreFees {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int book;
        String VIP;
        System.out.println(" Enter the number of days late: ");
        book = scan.nextInt();

        System.out.println(" Are you a vip member: Enter Yes or No ");
        VIP = scan.next();
//in this case we are using a nested if statement to determine the fine for the book    

        if ( VIP.equalsIgnoreCase("Yes")){ //this is a string method that will ignore the case of the input
            { if (book <= 5 ){
                System.out.println("The fine is $0.50 for " + book + " days late");    
            } else if (book <= 10) {
                System.out.println("The fine is $2.50 for " + book + " days late");  
            } else {
                System.out.println("the fine is $5.00 for " + book + " days late");  
            }
            }
        }
        else { // this is the else statement for the vip member becuause they are not a vip member then they will be charged the regular fee
    
            if (book <= 5){
                System.out.println("The fine is $1.00 for " + book + " days late");   
            } else if (book <= 10 ) {
                System.out.println("This book is overdue,the fine is $5.00 for " + book + " days late."); 
            }
            else {
                System.out.println(" This is very overdue, the fine is 10 for " + book + " days late");
            }
        }
    }
}
