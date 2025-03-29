
import java.util.Scanner;

public class Tempful {

/**
 * Average the numbers in the arrays
 * @param temputuares in the array list of integers representing average temperatures of morning in the days
 * @return the average tempurave by dividing to get the integer
 */
    public static int average(int[] temputuares){
        int total = 0; 
        int num1; 
        int average;

        //use the for loop to compare the number of integers and the morning 
    for (int i= 0; i < temputuares.length; i++){
        num1 = temputuares[i];
        total = total + num1;
    }
    //Average = sum of number / number of numbers
    average = total / temputuares.length;
    return average;
    }

    public static void main(String[] args) throws Exception{
        Scanner scnr = new Scanner (System.in);
        int days;

        System.out.print("How many days of data? ");
        days= scnr.nextInt();

        //The length of the array should equal the days of data
        int[] morning = new int[days];
        int[] afternoon = new int[days];
        int[]  night = new int[days];
        
//this loops sets your array to how many intergers the user will want for the morning noon  tempurature
for (int i= 0; i< morning.length; i++){
System.out.print("Morning tempurature: ");
morning[i] = scnr.nextInt();
    }
    for (int i= 0; i< afternoon.length; i++){
        System.out.print("Afternoon tempurature: ");
        afternoon[i] = scnr.nextInt();
        }
        for (int i= 0; i< night.length; i++){
            System.out.print("Night tempurature: ");
            night[i] = scnr.nextInt();
            }

    //the method of the average of morning was already set up to add that to the string statment
    System.out.println("Morning average for all days: " + average(morning));
    System.out.println("Noon average for all days: " + average(afternoon));
    System.out.println("Night average for all days: " + average(night));
    scnr.close();
    }
}