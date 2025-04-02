import java.util.Scanner;
import java.util.Arrays;

public class Map {
/**
 * Prints the row and column of the '+' sign given a 2D character array
 * @param map This is the 2D array the will represent the treasure map
 * @return 
 */
 public static  void getCoordinates(char[][] map){
    
        for (int i =0; i< map.length; i++)
        {
            //Ms.M github refers to length EX. for (int j = 0; j < colors[i].length; j++)
            for (int j = 0; j< map[i].length ; j++)
            {
                if (map[i][j]== '+' ){
                    System.out.print(" Start digging in row" + i + "column" + j + " ");
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
            if (map[i][j]=='+')
            {
                System.out.println("Digging treasure in row" + i+ "coumn" + j + "!");
                map[i][j]= '-';
                System.out.println("Noooo...the treasure is gone!");
            }

        }
    }

}

 public static void main(String[] args) {
    Scanner scnr = new Scanner (System.in);
    System.out.println("treasure Map");

    char[][] row = new char[10][10];
    char column='-';

    int x = 1, y = 6;


        //for (int i = 0; i < colors.length; i++)
        for (int i =0; i< row.length; i++)
        {
            //for (int j = 0; j < colors[i].length; j++)
            for (int j = 0; j< row[i].length; j++)
            {
                row [i][j]=column;
                if(row[x][y] == row[i][j]) {
                    row[i][j] = '+';
                }
                
            }


        }
    digTreasue(row);
getCoordinates(row);        
}

}