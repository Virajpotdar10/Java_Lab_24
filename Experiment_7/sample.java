import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) {

        try {
            // Give full path of the file
            FileReader fr = new FileReader("C:\\Users\\YourName\\Desktop\\sample.txt");

            BufferedReader br = new BufferedReader(fr);

            String line;

            System.out.println("File Content:");

            while((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            fr.close();
        }

        catch(IOException e) {
            System.out.println("Error reading file");
        }
    }
}