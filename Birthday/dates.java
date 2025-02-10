import java.util.Scanner;
public class dates {
    //This is the page that I used understand the using the primitive data types include
    //https://www.geeksforgeeks.org/data-types-in-java/
//this is a shorter version of the birthday code really only needing to know the date year and birth month, like how it is when applying to job or online apps
    public static void main(String[] args) {
        Scanner scnr = new Scanner (System.in);

        System.out.println("What is the month you were born?");
        String month = scnr.nextLine();
        System.out.println("Month: " + month );
        scnr.nextLine();

        System.out.println("What is the day you were born?");
        int date = scnr.nextInt();
        System.out.println("Day: " + date );
        scnr.nextLine();

        System.out.println("What is the year you were born? Make sure it is four digits like 2022 0r 1879.");
        int year = scnr.nextInt();
        System.out.println("Day: " + year );
        scnr.nextLine();

        System.out.println("Great you were born at " + month + " " + date + " " + year + "!");

        scnr.close();//make sure scanner is closed it is not mandatory like you will not get a error if it is not there but its good syntax

    }
}
