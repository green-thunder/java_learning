import java.util.Scanner;

public class stats {
    public static double[] calculateStats(int[] arr) {
        double max = (double) arr[0];
        double min = (double) arr[0];
        double sum = (double) arr[0];

        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            max = (arr[i] > max) ? arr[i] : max;
            min = (arr[i] < min) ? arr[i] : min;
        }

        double avg = sum / arr.length;

        return new double[] {sum, avg, max, min};
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        scanner.close();
        String[] arrString = text.split(",");
        int[] numbers = new int[arrString.length];
        for (int i = 0; i < arrString.length; i++) {
           numbers[i] = Integer.parseInt(arrString[i]);
        }
        double[] stats = calculateStats(numbers);
        System.out.println("Sum: " + stats[0]);
        System.out.println("Average: " + stats[1]);
        System.out.println("Maximum: " + stats[2]);
        System.out.println("Minimum: " + stats[3]);
    }
}