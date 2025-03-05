import java.util.Scanner;

public class LowerCase {
    public static String toLowerCase(String str){
        String res = "";

        for(int i=0;i<str.length();i++){
            int typeCast = (int) str.charAt(i);
            if (typeCast >= 65 && typeCast <= 90) { 
                typeCast = typeCast + 32;  
            }
            char ch = (char) typeCast;
            res+=ch;
            System.out.println(ch);
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.next();

        String lowerCaseMethod = str.toLowerCase();
        String lowerCaseFunc= toLowerCase(str);

        System.out.println("UpperCase String : " + lowerCaseFunc);

        System.out.println("Comparing both cases: " + lowerCaseMethod.equals(lowerCaseFunc));
}
}
