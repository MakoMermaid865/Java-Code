//Practice java code class activity
//Write a method the calcuate and returns the average of the three grade
//write method header //method body //code to call main method from method and print the result

public class methodGrade {
    public static double averageOfGrade(double grade1, double grade2, double grade3) {
        double sum = grade1 + grade2 + grade3;
        double average = sum/3.0;
        return average;
    }

    public static void main(String[] args) {
        double average = averageOfGrade(98.6, 56.9, 80.7);
        System.out.println("The average grade is: " + average );
    }
}
