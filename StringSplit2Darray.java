import java.util.Scanner;

public class StringSplit2Darray {

    // length of a string without using length()
    public static int findLength(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            count++;
        }
        return count;
    }

    // string into words without using split()
    public static String[] splitWords(String str) {
        int wordCount = countWords(str); // Get the number of words
        String[] words = new String[wordCount];
        
        String word = "";
        int index = 0;

        for (int i = 0; i < str.toCharArray().length; i++) {
            if (str.charAt(i) == ' ') {
                if (!word.isEmpty()) {
                    words[index++] = word;
                    word = "";
                }
            } else {
                word += str.charAt(i);
            }
        }
        if (!word.isEmpty()) {
            words[index] = word;
        }

        return words;
    }

    // Method to count words in a string
    public static int countWords(String str) {
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }

        return count;
    }

    // 2D array with words and their lengths
    public static String[][] create2DArray(String[] words) {
        String[][] wordLengthArray = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i]; 
            wordLengthArray[i][1] = String.valueOf(findLength(words[i]));
        }

        return wordLengthArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = sc.nextLine();

        String[] words = splitWords(input);
        String[][] wordLengthArray = create2DArray(words);

        for (String[] row : wordLengthArray) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
    }
}


// Sample Case
// BridgeLab       9
// is      2
// training        8
// partner 7
// of      2
// Capgemini       9