package Exceptions;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FixTheCode {
    private static FileWriter getFileWriter(String filePath) throws IOException {
            FileWriter fileWriter = new FileWriter(filePath, true);
            return fileWriter;
    }

    protected static void closeFileWriter(FileWriter fileWriter) {
        try {
            fileWriter.close();
        }catch (IOException ioe){
            System.out.println("There is an IOException.");
        }

    }

    public static void printToFile(FileWriter fileWriter, String text, int repeat) {
        for (int i = 0; i < repeat; i++) {
            try {
                fileWriter.write(text + "\n");
            }catch (IOException ioe){
                System.out.println("There is an IOException.");
            }

        }
    }

    public static void main(String[] args) throws IOException{
        FileWriter fileWriter = null;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please, enter the path to the file which you want to edit: ");
            String filePath = scanner.nextLine();
            System.out.println("How many times to print the text in the file?: ");
            int howManyTimesToPrintTheTextToFile = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter the text you'd like to add: ");
            String textToAdd = scanner.nextLine();
            fileWriter=getFileWriter(filePath);
            printToFile(fileWriter, textToAdd, howManyTimesToPrintTheTextToFile);
        }catch (IOException ioe){
            System.out.println("Text was not added to the file. Please, try again.");
        }catch (NumberFormatException nfe){
            System.out.println("The number you provided is not valid. Please, try again.");
        }finally {
            if(fileWriter!=null){
                closeFileWriter(fileWriter);
            }
        }
    }
}


