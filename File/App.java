import java.util.Scanner;
import java.io.*; //able to take in any file type
//File

public class App {
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

    /**
     * Counts number of words in file
     * A word is any text separated by a whitespace
     * @param f the file to be used to count the words
     * @return wordcount total in the file 
     * @throws FileNotFoundException
     */
    public static int countWords(File f) {
        int wordCount = 0;
        try{
            Scanner scnr = new Scanner(f);
            while (scnr.hasNext()){
                scnr.next();
                wordCount++;
            }
            scnr.close();
        }
        catch (FileNotFoundException exception){
            System.out.println("fileNotFound");
        }
        return wordCount;
    }

    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner (System.in);
        System.out.println("What is the name of the file? ");
        String fileName = scnr.nextLine();

        System.out.println ("What would you like to print to the file?");
        String fileText = scnr.nextLine();

        writeText(fileName, fileText);
            int wordCount = countWords(writeText(fileName, fileText));
            File file = writeText(fileName, fileText);
            System.out.println(file.getName() + " contains " + wordCount + " words.");
            scnr.close();

        } 

    }

