import java.util.Scanner;

public class LongestWordInASentence {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in); 

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        String[] words = splitWords(str);
        String[] ShortestandLongest = findShortestandLongest(words); 
        System.out.println("Shortest: "+ShortestandLongest[0]);
        System.out.println("Longest: " + ShortestandLongest[1]);
    }

    public static String[] splitWords(String str) {
        String words[] = str.split(" ");
        return words;
    }

    // Method to find the shortest and longest words in the given array of words
    public static String[] findShortestandLongest(String[] words) {
        String shortest = ""; 
        String longest = ""; 

        int shortestLength = Integer.MAX_VALUE; 
        int longestLength = Integer.MIN_VALUE;  

       
        for (int i = 0; i < words.length; i++) {
            if (shortestLength >= words[i].length()) {
                shortestLength = words[i].length();
                shortest = words[i];
            }
            else if (longestLength <= words[i].length()) { 
                longestLength = words[i].length();
                longest = words[i];
            }
        }

        return new String[]{shortest, longest};
    }
}
