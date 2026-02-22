public class gradebookAnalyser {
    public static String getClassStats(int[] grades) {
        int max = grades[0];
        int min = grades[0];
        int sum = grades[0];
        int passing_grades = (grades[0] >= 60) ? 1 : 0; 

        for (int i = 1; i < grades.length; i++) {
            sum += grades[i];
            max = (grades[i] > max) ? grades[i] : max;
            min = (grades[i] < min) ? grades[i] : min;
            passing_grades = (grades[i] >= 60) ? passing_grades + 1 : passing_grades;
        }

        double avr = (double) sum / grades.length;
        String output = "Class Average: " + avr + "\nHighest Grade: " + max + "\nLowest Grade: " + min + "\nPassing Grades: " + passing_grades + "/" + grades.length;

        return output;


    }
    
    public static String getLetterGrades(int[] grades) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int f = 0;


        for (int grade : grades) {
            a = (grade >= 90 && grade <= 100) ? a + 1 : a;
            b = (grade >= 80 && grade <= 89) ? b + 1 : b;
            c = (grade >= 70 && grade <= 79) ? c + 1 : c;
            d = (grade >= 60 && grade <= 69) ? d + 1 : d;
            f = (grade >= 0 && grade <= 59) ? f + 1 : f;
        }

        String output = "A (90-100): " + a + "\n" +
                        "B (80-89): " + b + "\n" + 
                        "C (70-79): " + c + "\n" +
                        "D (60-69): " + d + "\n" +
                        "F (0-59): " + f;

        return output;
    }
    
    public static String getImprovement(int[] start, int[] end) {

        int most_improved = 0;
        int improved = 0;
        int sum = 0;
        int difference = 0;

        for (int i = 0; i < start.length; i++) {
            difference = end[i] - start[i];
            if (difference > 0) {
                sum += difference;
                improved += 1;
                most_improved = (difference > most_improved) ? difference : most_improved;
            }
        }

        double avr = (double) sum / start.length;

        String output = "Average Improvement: " + avr + " points\n" + 
                        "Most Improved: " + most_improved + " points\n" + 
                        "Students Improved: " + improved + "/" + start.length;

        return output;
    }
    
    public static void main(String[] args) {
        int[] grades = {85, 92, 78, 65, 88, 72, 89, 98, 93, 77};
        int[] startGrades = {72, 85, 68, 90, 77};
        int[] endGrades = {84, 90, 75, 92, 80};
        
        System.out.println("Class Statistics:");
        System.out.println(getClassStats(grades));
        
        System.out.println("\nGrade Distribution:");
        System.out.println(getLetterGrades(grades));
        
        System.out.println("\nImprovement Analysis:");
        System.out.println(getImprovement(startGrades, endGrades));
    }
}