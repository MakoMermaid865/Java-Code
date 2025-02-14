import java.util.Scanner;
public class MaxNum{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int userNumber;
        int sum = 0; //the sum of all the numbers that user has entered so far
        int totalNum = 0; //varible for the how many numbers they entered before 100 reached
        
        while (sum < 100) {
            System.out.println("Enter a number: ");
            userNumber = scan.nextInt(); 
            sum = userNumber + sum; ++totalNum; //As the user enters the number it will add to the sum and count the number entered
        }
        //this } works as the else statement
        //Loop 2
        userNumber = sum - 100;
        System.out.println("You entered " + --totalNum + " values before the total was greater than 100.");
        System.out.println("The total exceeded 100 by " + userNumber + ".");
        System.exit(0);//this ends the program although the scaner closes it this is not directly for the system to close
        scan.close();  
        
    }
}
//Futher notes for this code is in book
