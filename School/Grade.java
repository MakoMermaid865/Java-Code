// Ari Kinney
// Practice Code

import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        //Assign your named varible that you will use in the code
        double grade1;
        double grade2;
        double grade3;
        double averageScore;

        //Prompt the user for 3 grade assignments
        System.out.println("What was the percentage for the first assignment? Example: 90.0");
        grade1 = scan.nextDouble();
        System.out.println("Your grade is:" + grade1);

        System.out.println("What was the percentage for the second assignment? Example: 90.0");
        grade2 = scan.nextDouble();
        System.out.println("Your grade is:" + grade2);

        System.out.println("What was the percentage for the third assignment?");
        grade3 = scan.nextDouble();
        System.out.println("Your grade is:" + grade3);


        //Formula to find the average
        averageScore = (grade1 + grade2 + grade3)/3;
        

        if (averageScore >= 90) {
            System.out.println("Your average score is: A");
        }
        else if (averageScore >= 80) {
            System.out.println("Your average score is: B");
        }
        else if (averageScore >= 70) {
            System.out.println("Your average score is: C");
        }
        else if (averageScore >= 60) {
            System.out.println("Your average score is: B");
        }
        else {
            System.out.println("Your average score is: F");
        }

    }
}
