import java.util.Scanner;

public class UniqueCharacter2DArray {
    public static String[][] charFrequency; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        
        // unique characters and frequency
        charFrequency = findCharacterFrequency(str);
        
        displayFrequency();

    }

    // unique characters in the string
    public static char[] uniqueCharacters(String str) {
        String unique = "";
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ' && unique.indexOf(ch) == -1) {
                unique += ch;
            }
        }
        
        return unique.toCharArray();
    }

    // frequency of unique characters
    public static String[][] findCharacterFrequency(String str) {
        int[] frequency = new int[256]; 
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                frequency[ch]++;
            }
        }
        
        char[] uniqueChars = uniqueCharacters(str);
        String[][] charFrequency = new String[uniqueChars.length][2];
        
        for (int i = 0; i < uniqueChars.length; i++) {
            charFrequency[i][0] = Character.toString(uniqueChars[i]);
            charFrequency[i][1] = Integer.toString(frequency[uniqueChars[i]]);
        }
        
        return charFrequency;
    }

    // isplay frequency of characters
    public static void displayFrequency() {
        System.out.println("Character Frequency Table:");
        System.out.printf("%-10s %-10s%n", "Character", "Frequency");
        System.out.println("-----------------------------");

        for (int i = 0; i < charFrequency.length; i++) {
            System.out.printf("%-10s %-10s%n", charFrequency[i][0], charFrequency[i][1]);
        }
    }
}

// Sample Case
// Enter the string: 
// Jai Shree Ram
// Character Frequency Table:
// Character  Frequency
// -----------------------------
// J          1
// a          2
// i          1
// S          1
// h          1
// r          1
// e          2
// R          1         
// m          1
