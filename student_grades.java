public class student_grades {
    // Write your methods here

    public static void improveGrade(int[] grades, int index) {
        grades[index] = (grades[index] + 5 > 100) ? 100 : grades[index] + 5;
    }
    
    public static void replaceFailingGrade(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            grades[i] = (grades[i] < 60) ? 60 : grades[i];
        }
    }

    public static void addBonusPoints(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            grades[i] = (grades[i] + 2 > 100) ? 100 : grades[i] + 2;
        }
    }

    public static void main(String[] args) {
        // Test your methods with these values
        int[] grades = {70, 85, 55};
        
        improveGrade(grades, 0);
        System.out.print("After improving grade: [");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i]);
            if (i < grades.length - 1) System.out.print(", ");
        }
        System.out.println("]");
        
        replaceFailingGrade(grades);
        System.out.print("After replacing failing: [");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i]);
            if (i < grades.length - 1) System.out.print(", ");
        }
        System.out.println("]");
        
        addBonusPoints(grades);
        System.out.print("After adding bonus: [");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i]);
            if (i < grades.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}