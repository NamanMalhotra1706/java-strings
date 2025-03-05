import java.util.Arrays;
import java.util.Scanner;

public class StringToCharacter {
    
    // Method to convert a string into a character array manually
    public static char[] toChArray(String s1) {
        char[] chArray = new char[s1.length()];

        for (int i = 0; i < chArray.length; i++) {
            chArray[i] = s1.charAt(i);
        }

        return chArray;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String s1 = sc.next(); 

        
        char[] charArray = s1.toCharArray();

        char[] charArray2 = toChArray(s1);

        // Comparing both character arrays and printing whether they are equal
        System.out.print("Two Arrays are Equal: " + Arrays.equals(charArray, charArray2));
    }
}
