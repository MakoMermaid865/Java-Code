import java.util.Scanner;

public class square {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
int numN;
System.out.println("Enter a number for the vaibile n");
numN = scanner.nextInt();

//Draw the square
for (int rows = 0; rows < numN; rows++) {
    for (int columns = 0; columns < numN; columns++) {
        //first row
        if (rows == 0 || columns == 0 ){
            System.out.print("* ");
        
        } else if( rows == numN - 1||columns == numN-1 ){
            System.out.print("* ");
        }
        else {
            System.out.print("  ");
        }

        
    }
    System.out.println();// go to the next row


    }
    scanner.close(); //

}


}


