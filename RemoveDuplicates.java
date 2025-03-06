import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine().toLowerCase(); 

        System.out.println("Modified String: " + removeDuplicates(str));
        sc.close();
    }

    // Remove Duplicates from String
    public static String removeDuplicates(String str) {
        int[] alphabets = new int[26]; 
        String newStr = "";

        for (char c : str.toCharArray()) {
            if (c != ' ') {
                alphabets[c - 'a']++;
            }
        }

        // Append only unique characters
        for (char c : str.toCharArray()) {
            if (c != ' ' && alphabets[c - 'a'] == 1) {
                newStr += c; 
            }
        }

        return newStr;
    }
}
