import java.util.Arrays;
import java.util.Scanner;

public class StringSplit {

    public static int countWords(String str) {
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }

        return count;
    }

    public static String[] stringSplitMethod(int wordsCount, String str) {
        String[] split = new String[wordsCount];
        String newStr = "";
        int sIx = 0, wordIndex = 0;

        while (sIx < str.length()) {
            if (str.charAt(sIx) == ' ') {
                split[wordIndex] = newStr;
                wordIndex++;
                newStr = "";
            } else {
                newStr += str.charAt(sIx);
            }
            sIx++;
        }

        // Add the last word
        if (!newStr.isEmpty()) {
            split[wordIndex] = newStr;
        }

        return split;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        String words[] = str.split(" ");

        System.out.println("Words using split method: ");
        for(int i=0;i<words.length;i++){
        System.out.print(words[i]+" ") ;
        }

        int stringWordsCount = countWords(str);

        System.out.println("\nNumber of words in string: " + stringWordsCount);
        String splitWords[] = stringSplitMethod(stringWordsCount, str);
        for (int i = 0; i < stringWordsCount; i++) {
            System.out.print(splitWords[i] + " ");
        }

        System.out.println("\nBoth Array are Equal? : " + Arrays.equals(words,splitWords));
    }
}


// Sample Case
    // Enter the string: My name is Naman Malhotra
    // Words using split method: 
    // My name is Naman Malhotra 
    // Number of words in string: 5
    // My name is Naman Malhotra 
    //Both Array are Equal? : true