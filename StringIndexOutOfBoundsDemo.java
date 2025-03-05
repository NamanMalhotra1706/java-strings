import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // StringIndexOutOfBoundsException
    public static void generateStringIndexOutOfBoundsException() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();  

        // Attempting to access a character beyond the length of the string
        System.out.println("Trying to access character at index 100: ");
        System.out.println(input.charAt(100)); 
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleStringIndexOutOfBoundsException() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();  

        try {

            System.out.println("Trying to access character at index 100: ");
            System.out.println(input.charAt(100));  
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
    
        System.out.println("Demonstrating StringIndexOutOfBoundsException without handling:");
        generateStringIndexOutOfBoundsException();
    
        System.out.println("\nDemonstrating StringIndexOutOfBoundsException with handling:");
        handleStringIndexOutOfBoundsException();
    }
}
