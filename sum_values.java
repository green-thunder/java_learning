import java.util.Scanner;

public class sum_values {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number of values >>> " );

        int num_values = scanner.nextInt();
        int value = 0;
        int sum = 0;
        for (int i = 0; i < num_values; i++) {
            value = scanner.nextInt();
            sum += value;

        }

        System.out.print("\n" + sum);
        scanner.close();
    }
}
