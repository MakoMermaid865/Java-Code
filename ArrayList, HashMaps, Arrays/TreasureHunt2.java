import java.util.Scanner;

public class TreasureHunt2 {
/**
 * Prints the row and column of the '+' sign given a 2D character array
 * @param map This is the 2D array the will represent the treasure map
 */
public static void getCoordinates(char[][] map){
    for (int i = 0; i< map.length; i++)
    {
        //Ms.M github refers to length EX. for (int j = 0; j < colors[i].length; j++)
        for (int j = 0; j< map[i].length ; j++)
        {
            if (map[i][j]== '+' ){
                System.out.print(" Start digging in row " + i + " column " + j + " ");
            }
        }
        System.out.println();
    }
}

/**
 * Removes the '+' sign from the 2D character array
 * @param map This is the 2D array the will represent the treasure map
 */
public static void digTreasue(char[][] map){
    for (int i= 0; i < map.length; i++)
    {
        for (int j = 0; j< map[i].length; j++)
        {
            if (map[i][j] =='+')
            {
                System.out.println("Digging treasure in row " + i + " column " + j + "!");
                map[i][j]= '-';
                System.out.println("NOOOOOOO...THE TREASURE IS GONE!");
            }
        }
    }
}

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to the Treasure Hunt!");
    char [][] map = {
    // Pass the 2D array to the getCoordinates method and have it print the row & column (“coordinates”) where the + sign was found.

    {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
    {'-', '-', '-', '-', '-', '-', '+', '-', '-', '-'},
    {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
    {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
    {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
    {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
    {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
    {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
    {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'}
    };
    

getCoordinates(map);
digTreasue(map);
}
}
