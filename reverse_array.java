import java.util.Scanner;
import java.util.Arrays;

public class reverse_array {
    public static int[] reverse(int[] arr) {
        int [] reversed_arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed_arr[arr.length - 1 - i] = arr[i];
        }

        return reversed_arr;
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
        
        int[] result = reverse(arr);
        System.out.println("The reversed array is: " + Arrays.toString(result));
    }
}