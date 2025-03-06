import java.util.Scanner;

public class FrequencyOfCharacters {
    
    public static int[][] charFrequency; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        
        // frequency and store in 2D array
        charFrequency = checkFrequency(str);
        
        displayFrequency();
    }

    // frequency of each character and store in 2D array
    public static int[][] checkFrequency(String str) {
        int[] frequency = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') { 
                frequency[ch]++;
            }
        }
        
        // Count unique characters
        int uniqueCount = 0;
        for (int freq : frequency) {
            if (freq > 0) uniqueCount++;
        }
        
        // Create 2D array to store character and frequency
        int[][] charFrequency = new int[uniqueCount][2];
        int index = 0;
        
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                charFrequency[index][0] = i; 
                charFrequency[index][1] = frequency[i]; 
                index++;
            }
        }
        
        return charFrequency;
    }

    // frequency of characters
    public static void displayFrequency() {
        System.out.println("Character Frequency Table:");
        System.out.printf("%-10s %-10s%n", "Character", "Frequency");
        System.out.println("-----------------------------");

        for (int i = 0; i < charFrequency.length; i++) {
            System.out.printf("%-10c %-10d%n", (char) charFrequency[i][0], charFrequency[i][1]);
        }
    }
}

// Sample Case
// Enter the string: 
// Naman Malhotra
// Character Frequency Table:
// Character  Frequency 
// -----------------------------
// M          1
// N          1
// a          4
// h          1
// l          1
// m          1
// n          1
// o          1
// r          1         
// t          1