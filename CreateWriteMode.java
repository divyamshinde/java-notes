import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateWriteMode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int x = sc.nextInt();

        try {
            File file = new File("example1.txt");

            FileWriter writer = new FileWriter(file);
            writer.write(x + "\n");
            writer.write("This file was created and written in one go.");
            

            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } 
    }
}
