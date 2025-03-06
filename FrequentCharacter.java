import java.util.Scanner;

public class FrequentCharacter {
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

    // Get Frequent Characters from alphabets array
    public static char getFrequentCharacters(){
        int mostFrequent=0;
        char ch = 0;
        for(int i=0;i<alphabets.length;i++){
            if(alphabets[i]>=mostFrequent){
                ch = (char) (i + 'a'); 
                mostFrequent = alphabets[i];
            }
        }
        return ch;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine().toLowerCase();

        checkFrequency(str);
        System.out.print("Most Frequent Character: "+getFrequentCharacters());

    }
}
