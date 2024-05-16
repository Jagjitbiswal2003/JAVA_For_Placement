// File handling in Java

// while both FileReader and BufferedReader can be used to read text from files, BufferedReader is generally preferred for reading text efficiently, especially when dealing with large files or when reading lines of text.

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;

public class Assignment_49 {
    public static void main(String[] args) {
        // File creation
        File file = new File("example.txt");

        try {
            // Writing to a file
            FileWriter writer = new FileWriter(file);
            writer.write("Hello, this is a text file!");
            writer.close();
            System.out.println("File created and written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Reading from a file
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("Contents of the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        // Deleting the file
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
