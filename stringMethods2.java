import java.util.Scanner;

public class stringMethods2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String delimiter = scanner.nextLine();
        scanner.close();

        String[] listString = text.split(" ");
        String joinedString = String.join(delimiter, listString);

        System.out.println(joinedString);
        
    }
}