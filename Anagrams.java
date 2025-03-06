import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string1: ");
        String str = sc.next();

        System.out.print("Enter the string2: ");
        String str2 = sc.next();

        int freqOfString1[] = frequency(str);
        int freqOfString2[] = frequency(str2);

        if(isAnagrams(freqOfString1,freqOfString2)){
            System.out.println("The string is Anagram");
        }
        else{
            System.out.println("The string is not Anagram");
        }
    }

    // Frequeny of char in string
    public static int[] frequency(String str){
        int[] frequency = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') { 
                frequency[ch]++;
            }
        }
        return frequency;
    }

    // Checking the string is Anagram
    public static boolean isAnagrams(int[] freqOfString1, int [] freqOfString2){
        return Arrays.equals(freqOfString1, freqOfString2);
    }
}
