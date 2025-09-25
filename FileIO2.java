// 9/25/25
// Omari Jones

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;




public class FileIO2 {
    public static void main(String[] args) {

        System.out.println("Welcome to my Zoo Program!");
    //  Create a file named filecreation.txt
        try {
            File myObj = new File("filecreation.txt"); // Create File object
            if (myObj.createNewFile()) {           // Try to create the file
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace(); // Print error details


    }
        // Open and read arriving animals.txt
        File myObj = new File("arrivinganimals.txt");

        // try-with-resources: Scanner will be closed automatically
        try (Scanner myReader = new Scanner(myObj)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }
        // I wanted a buffered file reader


        System.out.println("This is from a Buffered Reader \n");
        try (BufferedReader br = new BufferedReader(new FileReader("arrivinganimals.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                // Parse the string named line into 6 array elements
                
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }

    }
}