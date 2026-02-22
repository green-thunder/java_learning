import java.util.Scanner;


public class asterisk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = scanner.nextInt();
        int height = scanner.nextInt();

        for (int w = 0; w < width; w++) {
            for (int h = 0; h < height; h++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        scanner.close();

    }
}
