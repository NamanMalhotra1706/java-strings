import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // generate NumberFormatException
    public static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Parsed number: " + number);
    }

    // handling of the NumberFormatException
    public static void handleNumberFormatException(String text) {
        try {
            generateException(text);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught: Invalid number format! Please enter a valid integer.");
        } catch (RuntimeException e) {
            System.out.println("A runtime exception occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Creating scanner object for user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String userInput = sc.nextLine();

        handleNumberFormatException(userInput);
    }
}
