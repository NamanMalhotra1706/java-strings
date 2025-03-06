import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first String: ");
        String s1 = sc.next();

        System.out.print("Enter the second String: ");
        String s2 = sc.next();

        String result = compareStrings(s1, s2);
        System.out.println(result);

    }

    // Comparing Strings
    public static String compareStrings(String str1, String str2){
        int length = Math.min(str1.length(), str2.length());
        
        for (int i = 0; i < length; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                if (str1.charAt(i) < str2.charAt(i)) {
                    return "\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order";
                } else {
                    return "\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order";
                }
            }
        }

        // If one string is a prefix of the other
        if (str1.length() == str2.length()) {
            return "Both strings are equal";
        } else if (str1.length() < str2.length()) {
            return "\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order";
        } else {
            return "\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order";
        }
    }
}


// Sample Case
// Enter the first String: apple
// Enter the second String: banana
// "apple" comes before "banana" in lexicographical order