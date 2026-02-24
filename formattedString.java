import java.util.Scanner;

public class formattedString {
    public static String createFormattedString(String productName, int quantity, double unitPrice) {
        String result = String.format("Product: %s, Quantity: %.1f, Unit Price: %.5f", productName, (double) quantity, unitPrice);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int qty = scanner.nextInt();
        double price = scanner.nextDouble();
        scanner.close();
        String formattedString = createFormattedString(product, qty, price);
        System.out.println(formattedString);
    }
}