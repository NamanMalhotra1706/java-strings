import java.util.Scanner;

public class NonRepeatingCharacter {
    public static int[] alphabets = new int[26];

    // Frequency of each character
    public static void checkFrequency(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                continue;
            }
            else{
                int typeCast = str.charAt(i)-'a';
                alphabets[typeCast] +=1;
            }
        }
    }

    // Get First Non Repeating Characters from alphabets array
    public static void getFirstNonRepeatingCharacters(String str){
        for(int i=0;i<str.length();i++){
            int typeCast = str.charAt(i)-'a';
            if(alphabets[typeCast] == 1){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine().toLowerCase();

        checkFrequency(str);
        getFirstNonRepeatingCharacters(str);

    }
}


// Sample Case
// Enter the String: My name is naman
// y