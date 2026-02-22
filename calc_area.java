public class calc_area {

    public static int calculateArea(int side_len) {
        System.out.printf("Square area with side %d: %d\n", side_len, side_len * side_len);
        return side_len * side_len;

    }

    public static int calculateArea(int length, int width) {
        System.out.printf("Rectangle area with length %d and width %d: %d\n", length, width, length * width);
        return length * width;

    }

    public static double calculateArea(double radius) {
        double area = radius * radius * 3.14;
        System.out.printf("Circle area with radius %.1f: %.3f", radius, area);
        return area;
    }
    
    public static void main(String[] args) {
        // Test your methods with these exact values
        calculateArea(5);          // square
        calculateArea(4, 6);       // rectangle
        calculateArea(2.5);        // circle
    }

}
