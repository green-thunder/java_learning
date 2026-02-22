import java.util.ArrayList;


public class lucky_item {
    public static void main(String[] args) {
        ArrayList<Integer> unlucky_numbers = new ArrayList<>();
        int items_num = 20;
        unlucky_numbers.add(4);
        unlucky_numbers.add(13);
        unlucky_numbers.add(17);
        System.out.println(unlucky_numbers);

        for (int i = 0; i < items_num; i++) {
            System.out.println(unlucky_numbers.contains(i + 1));
            System.out.println(((unlucky_numbers.contains(i + 1)) ? "Skipping unlucky number: " + (i + 1) : "Item #" + (i + 1) + ": Get this item!"));
        }
    }
}
