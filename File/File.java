// Ari kinney
// 10/28/0224
// File
import java.io.*;
import java.util.Scanner;
import java.io.IOException;

public class File {
/**
 * Creats a file, writes  string to file, retuen File object
 * @param 
 * @param
 * @return
 * @throws
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
    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);
        System.out.println("What is the name of the file? ");
        String fileName = scnr.nextLine();

        System.out.println("What would you like to print to the file? ");
        String fileText = scnr.nextLine();

        writeText(fileName, fileText);
        
    }
    
}
