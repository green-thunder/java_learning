public class stringLength {
   
    public static String checkLength(String username) {
        String output = String.format("Username length: %d%nLong enough: %b", username.length(), username.length() >= 6);
        return output;
    }

    public static String checkStart(String username) {
        String output = String.format("Starts with user_: %b%nStarts with admin_: %b", username.startsWith("user_"), username.startsWith("admin_"));
        return output;
    }

    public static String modifyUsername(String username) {
        String output = String.format("First 5 chars: %s%nUppercase: %s", username.substring(0, 5), username.substring(0, 5).toUpperCase());
        return output;
    }
    
    
    public static void main(String[] args) {
        // Test with this username
        String username = "user_123admin";
        
        System.out.println("Length Check:");
        System.out.println(checkLength(username));
        
        System.out.println("\nPrefix Check:");
        System.out.println(checkStart(username));
        
        System.out.println("\nModified Username:");
        System.out.println(modifyUsername(username));
    }
}

