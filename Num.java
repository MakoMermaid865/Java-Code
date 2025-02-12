import java.util.Scanner;

public class Num {
    public static void main(String[] args) {
        //this layout way somewhat followed through Ms.M gitub...anderson has not posted code in that yet
        Scanner scan = new Scanner (System.in);
        int userNumber;
        int sum = 0; //the sum of all the numbers that user has entered so far

        while (sum < 100) {
            System.out.println("Enter a number: ");
            userNumber = scan.nextInt(); 
            sum = userNumber + sum;
        }
        //this } works as the else statement
        System.out.println("You entered a number 100 or greater, the program has ended");
        System.exit(0);//this ends the program although the scaner closes it this is not directly for the system to close
        scan.close();   
    }
}
