import java.util.Scanner;

/**
 * Average the numbers in the arrays
 * @param temputuares in the array list of integers representing average temperatures of morning in the days
 * @return average tempurave by dividing to get the integer
 */
public class Tempcal {
    public static int average(int[] temputuares){
        int total = 0; 
        int num1; // mornings
        int average;
        //use the for loop to compare the number of integers and the morning 
    for (int i = 0; i< temputuares.length; i++){
        num1 = temputuares[i];
        total = total + num1;
    }
    //Average = sum of number / number of numbers
    average = total/temputuares.length;
    return average;
    }
    public static void main(String[] args) throws Exception{
        Scanner scnr = new Scanner (System.in);
        int days;
        //Prompt the user and compare it day
        System.out.print("How many days of data? ");
        days= scnr.nextInt();

        //The length of the array should equal the days of data
        int[] morning = new int[days];
        
//this loops sets your array to how many intergers the user will want for the morning tempurature
    for (int i= 0; i< morning.length; i++){
    System.out.print("Enter morning tempurature: ");
    morning[i] = scnr.nextInt();
    }
    //the method of the average of morning was already set up to add that to the string statment
    System.out.print("Morning average for all days: " + average(morning));
    scnr.close();
    }
}
