import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the original sentence: ");
        String sentence = sc.nextLine();
        
        System.out.print("Enter the word to replace: ");
        String oldWord = sc.nextLine();
        
        System.out.print("Enter the new word: ");
        String newWord = sc.nextLine();
        
        String updatedSentence = replaceWord(sentence, oldWord, newWord);
        System.out.println("Updated sentence: " + updatedSentence);
    }

    // Replace a word in a sentence with another word
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        if (oldWord.isEmpty()) {
            return sentence;
        }
        
        return sentence.replace(oldWord, newWord);
    } 
}
