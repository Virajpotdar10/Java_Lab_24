import java.util.*;

public class Filecount{

    public static void main(String[] args) {

        int vowels = 0;
        int words = 0;
        int countA = 0;

        try {

            FileReader fr = new FileReader("sample.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {

                // Count words
                String w[] = line.split(" ");
                words += w.length;

                for (int i = 0; i < line.length(); i++) {

                    char ch = line.charAt(i);

                    // Count vowels
                    if ("aeiouAEIOU".indexOf(ch) != -1) {
                        vowels++;
                    }

                    // Count 'a'
                    if (ch == 'a' || ch == 'A') {
                        countA++;
                    }
                }
            }

            br.close();
            System.out.println("Total Vowels: " + vowels);
            System.out.println("Total Words: " + words);
            System.out.println("Number of 'a': " + countA);

        } catch (Exception e) {
            System.out.println("Error reading file");
        }
    }
}