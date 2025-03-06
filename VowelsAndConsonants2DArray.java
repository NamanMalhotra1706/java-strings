import java.util.Scanner;

public class VowelsAndConsonants2DArray {

    // Method to check character type
    public static String checkCharType(char ch) {
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            char lowerChar = (ch >= 'A' && ch <= 'Z') ? (char)(ch + 32) : ch;
            
            if (lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' || lowerChar == 'o' || lowerChar == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to find vowels and consonants in a string
    public static String[][] findVowelsAndConsonants(String str) {
        int length = str.length();
        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharType(ch);
        }

        return result;
    }

    // tabular format
    public static void displayResult(String[][] array) {

        for (String[] pair : array) {
            System.out.println(pair[0] + "\t\t" + pair[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();

        String[][] charArray = findVowelsAndConsonants(input);
        displayResult(charArray);
    }
}
