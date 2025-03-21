import java.util.Scanner;
import java.io.IOException;
import java.io.*; //able to take in any file type
//File

public class LabFile {
    /**
     * Creates a file, writes provided string to file, returns File object
     * @param filename the name of the file
     * @param s the string to be written to the file
     * @return null this is the value of nothing
     * @throws IOException allowing to throw an exception
     */
    public static File writeText(String filename, String s){

            File file = null;

        try{    
            file = new File(filename);
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.print(s);
            printWriter.close();
        }
        catch (IOException exception){
            System.out.println("fileNotFound");
        }
        return file;
    }

    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner (System.in);
        System.out.println("What is the name of the file? ");
        String fileName = scnr.nextLine();

        System.out.println ("What would you like to print to the file?");
        String fileText = scnr.nextLine();

        writeText(fileName, fileText);

    }
}
