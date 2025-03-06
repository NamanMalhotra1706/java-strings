import java.util.Scanner;

public class RemoveAllOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        System.out.print("Character to Remove: ");
        char ch = sc.next().charAt(0);

        String newStr = removeOccurence(str, ch);
        System.out.println("Modified String: "+newStr);
    } 

    // Removing Occurence 
    public static String removeOccurence(String str, char ch){
        String modifiedString = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=ch){
                modifiedString+=str.charAt(i);
            }
            else{
                continue;
            }
        }

        return modifiedString;
    }
}


// Sample Case
// Enter the String: Hello World  
// Character to Remove: l
// Modified String: Heo Word