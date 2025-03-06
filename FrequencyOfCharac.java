import java.util.Scanner;

public class FrequencyOfCharac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        findCharacterFrequency(str);
        sc.close();
    }

    // frequency of characters
    public static void findCharacterFrequency(String str) {
        char[] charArray = str.toCharArray();
        int[] frequency = new int[charArray.length];
        
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '0') continue;
            frequency[i] = 1;
            
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    frequency[i]++;
                    charArray[j] = '0'; // Mark as counted
                }
            }
        }
        
        System.out.println("Character Frequency:");
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != '0') {
                System.out.println(charArray[i] + " : " + frequency[i]);
            }
        }
    }
}


// Sample Case
// Enter a string: 
// nama
// Character Frequency:
// n : 1
// a : 2
// m : 1