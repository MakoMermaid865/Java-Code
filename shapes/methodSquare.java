//Ari Kinney
//LAB 6
import java.util.Scanner;


public class methodSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    

        //Prompt the user for Height
        System.out.println("Enter Height: ");
        int numN = scan.nextInt(); //Prompts for height

        //Prompts for charcater 
        System.out.print("Enter a character: ");
        char character = scan.next().charAt(0); //Prompts for character

        //Call the printSquare method 
        printSquare(numN, character);

        scan.close();
        

    }
    public static void printSquare(int numN, char character) {
        //Draw the square
        for (int rows = 0; rows < numN; rows++) {
            for (int columns = 0; columns < numN; columns++) {
                //first row
                if (rows == 0 || columns == 0 ){
                    System.out.print("" + character + " ");
                
                } else if( rows == numN - 1||columns == numN-1 ){
                    System.out.print("" + character + " ");
                }
                else {
                    System.out.print("  ");
                }
        
                
            }
            System.out.println();// go to the next row
        
            }

}
}
