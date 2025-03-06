import java.util.Scanner;

public class ToggleCaseofCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        String newString = toogleString(str);
        System.out.println("Toogle String: "+newString);
    }

    // Toogle String -> Upper to lower, vice versa
    public static String toogleString(String str){
        String newStr = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                char lowerCh = Character.toLowerCase(ch);
                newStr+=lowerCh;
            }
            else if(Character.isLowerCase(ch)){
                char upperCh = Character.toUpperCase(ch);
                newStr+=upperCh;
            }
            else{
                newStr+=ch;
            }
        }
        return newStr;
    }
}
