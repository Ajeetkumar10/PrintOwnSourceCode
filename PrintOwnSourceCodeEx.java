import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PrintOwnSourceCodeEx {
    public static void main(String[] args) {
        try {
            String fileName = "PrintOwnSourceCode.java"; 
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("An error occurred while reading the source code: " + e.getMessage());
        }
    }
}
