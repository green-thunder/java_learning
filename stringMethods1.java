import java.util.Scanner;

public class stringMethods1 {
    public static void analyzeString(String str) {
        System.out.println("Length: " + str.length() + "\n" +
                            "Char at 4: " + str.charAt(4) + "\n" + 
                            "Substring: " + str.substring(7) + "\n" + 
                            "Substring 2: " + str.substring(3, 6) + "\n" + 
                            "Ends with dot: " + str.endsWith(".") + "\n" + 
                            "Uppercase: " + str.toUpperCase() + "\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        scanner.close();
        analyzeString(message);
    }
}