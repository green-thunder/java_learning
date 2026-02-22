import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList; // Added for a cleaner approach

public class long_words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] arr = text.split(",");
        
        // Using an ArrayList to avoid the "empty string" and comma headache
        ArrayList<String> resultList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            // Trim to handle potential spaces after commas in input
            String word = arr[i].trim(); 
            if (word.length() > 5) {
                resultList.add(word);
            }
        }

        // Convert back to array for the exact output format you want
        String[] long_arr = resultList.toArray(new String[0]);

        System.out.println(Arrays.toString(long_arr));
    }
}