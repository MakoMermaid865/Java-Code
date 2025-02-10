import java.util.Scanner;
public class dates {
    //This is the page that I used understand the using the primitive data types include
    //https://www.geeksforgeeks.org/data-types-in-java/

    public static void main(String[] args) {
        Scanner scnr = new Scanner (System.in);

        System.out.println("What time were you born...yes this is in military time: Example is 10.15 or 20.33");
        double time = scnr.nextDouble();
        System.out.println("Time: " + time );
        scnr.nextLine(); //this will clear the screen and go to a new line for better style


        //this was a trick one because I couldn't find the scanner for a char variable Ai (chat.pgt was used to version (mostly the second line) I asked it to fix my error and this was the result
//        System.out.println("What is the first letter your month starts with");
//        char letter = scnr.nextline();
//        System.out.println("First letter of Month: " + letter );
        System.out.println("What is the first letter that your month starts with");
        char letter = scnr.next().charAt(0); // this work is documented in the notes sent later on explain through Ai
        System.out.println("First letter of Month: " + letter );
        scnr.nextLine();

        //back to geeks website layout lol
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


        //how do Java booleans work... this can help https://www.w3schools.com/java/java_booleans.asp
        //notes are in book btw
        System.out.println("Your birthday is not a holiday: True of False? ");
        //camelCase is used of java!
        boolean notHoliday = scnr.nextBoolean();
        System.out.println("Holiday: " + notHoliday);
        scnr.nextLine();


        System.out.println("Great you were born at " + month + " " + date + " " + year + " "  + "at: "+ time + " So, the letter that you were born is "  + letter + " and it is " + notHoliday + " for being a holiday, Thank you!");

        scnr.close();//make sure scanner is closed it is not mandatory like you will not get a error if it is not there but its good syntax

    }
}
