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

        if (numN <= 0 ){ //this is able to take in negative number and will promt the user for error
            System.out.println("Error: n cannot be negative");
            System.exit(0);
            }

    
        //Call the printSquare method 
        printSquare(numN, character);

        scan.close();
        

    }
    /**
     * This method prints a square of a given size and character
     * @param numN taking in the number of height the user wants
     * @param character taking in the character the user wants to use
     * @return void this method does not return anything it only prints the number of height and character
     */
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
