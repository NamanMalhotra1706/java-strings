import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the main string: ");
        String mainStr = sc.nextLine();
        
        System.out.print("Enter the substring to count: ");
        String subStr = sc.nextLine();
        
        int count = countSubstringOccurrences(mainStr, subStr);
        System.out.println("The substring \"" + subStr + "\" occurs " + count + " times in the main string.");

    }

    // occurrences of a substring within a string
    public static int countSubstringOccurrences(String mainStr, String subStr) {
        if (subStr.isEmpty() || mainStr.length() < subStr.length()) {
            return 0;
        }
        
        int count = 0;
        int index = 0;
        
        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
        }
        
        return count;
    }
}
