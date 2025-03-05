import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

    // generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names, int index) {
        System.out.println("Accessing element at index " + index + ": " + names[index]);
    }

    // handling the ArrayIndexOutOfBoundsException
    public static void handleArrayIndexOutOfBoundsException(String[] names, int index) {
        try {
            generateException(names, index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Index " + index + " is out of bounds for the array.");
        } catch (RuntimeException e) {
            System.out.println("A runtime exception occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] names = {"Naman", "naman", "Manvi", "Malhotra", "grover"};
        System.out.print("Enter an index to access the array (0 to " + (names.length - 1) + "): ");
        int index = sc.nextInt();

        handleArrayIndexOutOfBoundsException(names, index);
    }
}
