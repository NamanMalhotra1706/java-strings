import java.util.Scanner;

public class VowelsAndConsonants {

    public static int[] vowelsAndConsonantsCount(String str){
        int vowelsCount = 0;
        int consonantsCount = 0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                continue;
            }
            else if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='O' || str.charAt(i)=='I' || str.charAt(i)=='U'){
                vowelsCount+=1;
            }
            else if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                vowelsCount+=1;
            }
            else{
                consonantsCount+=1;
            }
        }

        return new int[]{vowelsCount, consonantsCount};
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in); 

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        int[] vowelsAndConsonants = vowelsAndConsonantsCount(str);

        System.out.println("Vowel Count: " + vowelsAndConsonants[0]);
        System.out.println("Consonants Count: " + vowelsAndConsonants[1]);
    }
}


// Sample Case
// Enter the string: The quick brown fox jumps over the lazy dog
// Vowel Count: 11
// Consonants Count: 24