// Ari kinney
// 10/28/0224
// File
import java.io.*;
import java.util.Scanner;
import java.io.IOException;

public class File {
/**
 * Creats a file, writes  string to file, retuen File object
 * @param HelloWorld the name of the file will be created to the file
 * @param s is going to be assigned to datatype of string to wrtie the file
 * @return null 
 * @throws used in the try catch block 
 */
public static File writeText(String HelloWorld, String s){
    File file = new File(HelloWorld);
    try{
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.print(s);
    }
    catch (FileNotFoundException exception){
        System.out.println("fileNotFound");
    }
        
    return null;
}

/**
 * Counts number of words in file
 * A word is any text separated by a whitespace
 * @param f is the file that will be used to count the words
 * @return 0 or wordcount total in the file or null
 * @throws FileNotFoundException
 */
public static int countWords(File f) {
    int wordCount = 0;
    File file2 = new File(f);
    try{
        Scanner scnr= new Scanner ( f);
        scnr.hasNext();
        wordCount++;
    }
    catch
        (FileNotFoundException exception){
            System.out.println("fileNotFound");
        }

return null;
}
    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);
        System.out.println("What is the name of the file? ");
        String fileName = scnr.nextLine();

        System.out.println("What would you like to print to the file? ");
        String fileText = scnr.nextLine();

        writeText(fileName, fileText);
        // try a catch block run it a do while loop for it to be done once
        do {
            try{
            // comapre the strings and the name that was use in the write text file 
            int wordCount= countWords(writeText(fileName, fileText));
            System.out.println(wrtieText.getName() + " contains" + countWords + " words");

            //use the FileNotFoundExceptio exception to run the code through all the same file
            } catch (FileNotFoundException exception){
                System.out.println("fileNotFound");
            }
            file.close();
            while (true);{
            
        }
    }
        //make sure to close file and scanner
        file.close();
        scnr.close();
    }   
}
