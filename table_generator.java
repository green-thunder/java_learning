import java.util.Scanner;


public class table_generator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        scanner.close();
        int sum = 0;

        System.out.println("Multiplication number of " + number);
        System.out.println("--------------------------------");

        for (int i = 0; i < 12; i++) {
            System.out.printf("%d + %d = %d\n", number, i + 1, number * (i + 1));
            sum += number * (i + 1);
        }


        System.out.println("--------------------------------");

        System.out.println("Sum of all results: " + sum);

    }
}
