import java.util.Scanner;

public class prod_array {
    public static int prod(int[] arr) {
        int prod = 1;

        for (int i = 0; i < arr.length; i++) {
            prod *= arr[i];
        }

        return prod;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        scanner.close();
        String[] stringArr = text.split(",");
        int[] arr = new int[stringArr.length];
        for (int i = 0; i < stringArr.length; i++) {
            arr[i] = Integer.parseInt(stringArr[i]);
        }
        
        int result = prod(arr);
        System.out.println("Product of array elements: " + result);
    }
}