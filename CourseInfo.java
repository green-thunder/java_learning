public class CourseInfo {
    // Write your methods here
    public static String formatCourseInfo(String courseInfo) {
        String[] infoList = courseInfo.split(":");
        String info = String.format("Course Code: %s%nCourse Name: %s%nDays: %s%nTime: %s", infoList[0], infoList[1], infoList[2], infoList[3]);
        return info;
    }

    public static String createCourseList(String[] courseCodes) {
        String courses = String.format("Available Courses: %s", String.join(", ", courseCodes));
        return courses;
    }

    public static String formatSchedule(String days) {
        String formattedDays = String.join("|", days.split(","));
        return formattedDays;
    }
    
    
    
    public static void main(String[] args) {
        // Test data
        String courseInfo = "MATH101:Algebra:Monday,Wednesday:9AM";
        String[] courseCodes = {"MATH101", "ENG202", "HIST101"};
        String days = "Monday,Wednesday,Friday";
        
        // Test your methods
        System.out.println("Course Information:");
        System.out.println(formatCourseInfo(courseInfo));
        
        System.out.println("\nCourse List:");
        System.out.println(createCourseList(courseCodes));
        
        System.out.println("\nSchedule Format:");
        System.out.println(formatSchedule(days));
    }
}