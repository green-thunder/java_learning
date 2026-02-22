import java.util.Arrays;

public class class_roster {
    
    public static String[] createSeatingChart(String[] names, int[] grades) {
        String[] seatingChart = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            seatingChart[i] = names[i] + ": " + grades[i];
        }

        Arrays.sort(seatingChart);

        return seatingChart;
    }

    public static String[] findTopStudents(int[] grades) {
        String[] modifiedArray = new String[grades.length];
        for (int i = 0; i < grades.length; i++) {
            modifiedArray[i] = (grades[i] >= 90) ? "A+" : "A";
        }

        return modifiedArray;
    }

    public static boolean isClassEqual(int[] grades, int[] grades2) {
        boolean isEqual = true;

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] != grades2[i]) {
                isEqual = false;
                break;
            }
        }

        return isEqual;
        
    }
    
    public static void main(String[] args) {
        // Test arrays
        String[] names = {"Tom", "Alice", "Bob"};
        int[] grades = {85, 92, 78};
        int[] grades2 = {85, 92, 78};
        
        // Test first method
        String[] seatingChart = createSeatingChart(names, grades);
        System.out.print("Seating Chart: ");
        System.out.println(Arrays.toString(seatingChart));
        
        // Test second method
        String[] gradeLetters = findTopStudents(grades);
        System.out.print("Grade Letters: ");
        System.out.println(Arrays.toString(gradeLetters));
        
        // Test third method
        boolean equalClasses = isClassEqual(grades, grades2);
        System.out.println("Classes Equal: " + equalClasses);
    }
}