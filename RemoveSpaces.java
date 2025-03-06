import java.util.Scanner;

public class RemoveSpaces {

    // Method to trim leading and trailing spaces using charAt
    public static int[] trimSpaces(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // create a substring using charAt
    public static String customSubstring(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    // compare two strings using charAt
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();

        int[] trimIndices = trimSpaces(input);
        String trimmedCustom = customSubstring(input, trimIndices[0], trimIndices[1]);

        String trimmedBuiltIn = input.trim();
        boolean isSame = compareStrings(trimmedCustom, trimmedBuiltIn);

        System.out.println("Original String: "+ input );
        System.out.println("Trimmed (Custom Method): " + trimmedCustom);
        System.out.println("Trimmed (Built-in Method): " + trimmedBuiltIn );
        System.out.println("Are both trimmed results the same? " + isSame);
    }
} 

// Sample Case
// Enter the string:         Helloo Capgemini, Chitkara University      
// Original String:         Helloo Capgemini, Chitkara University      
// Trimmed (Custom Method): Helloo Capgemini, Chitkara University
// Trimmed (Built-in Method): Helloo Capgemini, Chitkara University
// Are both trimmed results the same? true