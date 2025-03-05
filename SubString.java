import java.util.Scanner;

public class SubString {
    public static String getSubString(int st, int en, String s2){
        String subStr = "";

        while(st<en){
            subStr+=s2.charAt(st);
            st++;
        }
        return subStr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first String: ");
        String s1 = sc.next();

        System.out.print("Enter the second String: ");
        String s2 =  sc.next();

        System.out.print("Give the start index: ");
        int stIndex = sc.nextInt();

        System.out.print("Give the end index: ");
        int enIndex = sc.nextInt();

        String subString1 = s1.substring(stIndex,enIndex);
        System.out.println("Substring using method: " +  subString1);

        String subString2 = getSubString(stIndex, enIndex, s2);
        System.out.println("Substring using charAt: " +  subString2);

        System.out.println("Both strings are equal, ==? " + subString2==subString1);
        System.out.println("Both strings are equal, .equals? " + subString2.equals(subString1));
    }
}
