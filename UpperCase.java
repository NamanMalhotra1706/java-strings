import java.util.Scanner;

public class UpperCase {
    public static String toUpperCase(String str){
        String res = "";

        for(int i=0;i<str.length();i++){
            int typeCast = (int) str.charAt(i);
            if (typeCast >= 97 && typeCast <= 122) { 
                typeCast = typeCast - 32;  
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

        String upperCaseMethod = str.toUpperCase();
        String upperCaseFunc = toUpperCase(str);

        System.out.println("UpperCase String : " + upperCaseFunc);

        System.out.println("Comparing both cases: " + upperCaseMethod.equals(upperCaseFunc));

    }
}
