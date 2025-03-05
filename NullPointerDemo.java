public class NullPointerDemo {

    // Generating Exception
    public static void generateNullPointerException() {
        String text = null;  
        System.out.println(text.toUpperCase());  // This will throw NullPointerException
    }

    // Handling Exception
    public static void handleNullPointerException() {
        String text = null; 
        try {
            System.out.println(text.toUpperCase()); 
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
    
        System.out.println("Demonstrating NullPointerException without handling:");
        generateNullPointerException();
        
        // handle the NullPointerException
        System.out.println("\nDemonstrating NullPointerException with handling:");
        handleNullPointerException();
    }
}
