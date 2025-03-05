import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method to generate IllegalArgumentException
    public static void generateIllegalArgumentException() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine(); 
        System.out.println("Trying to get substring with invalid indices (start > end): ");
        System.out.println(input.substring(5, 3)); 
    }

    // Method to handle IllegalArgumentException
    public static void handleIllegalArgumentException() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine(); 

        try {
            System.out.println("substring with invalid indices (start > end): ");
            System.out.println(input.substring(5, 3));  
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // generate IllegalArgumentException
        System.out.println("Demonstrating IllegalArgumentException without handling:");
        generateIllegalArgumentException();
        
        // handle IllegalArgumentException
        System.out.println("\nDemonstrating IllegalArgumentException with handling:");
        handleIllegalArgumentException();
    }
}
