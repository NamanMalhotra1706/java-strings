import java.util.Scanner;

public class UniqueCharacters {
    public static int[] alphabets = new int[26];

    // Frequenct of each character
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

    // Get Unique Characters from alphabets array
    public static void getUniqueCharacters(){
        for(int i=0;i<alphabets.length;i++){
            if(alphabets[i]==1){
                char ch = (char) (i + 'a'); 
                System.out.print(ch+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine().toLowerCase();

        checkFrequency(str);
        getUniqueCharacters();

    }
}

// Sample Case
// Enter the String: Hello How are you
// a r u w y