import java.util.Scanner;

public class EqualStrings {

    public static boolean compareString(String s1, String s2){
        if(s1.length()!=s2.length()) {
            return false;
        }
        int st = 0;
        int en = s1.length()-1;
        while(st<=en){
            if(s1.charAt(st)!=s2.charAt(st)){
                return false;
            }
            st++;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first String: ");
        String s1 = sc.next();

        System.out.print("Enter the second String: ");
        String s2 =  sc.next();

        System.out.println("Two strings are equal ? Using charAt() : " + compareString(s1, s2));

        System.out.println("Two strings are equal ? Using .equals() : " + s1.equals(s2));

        System.out.println("Two strings are equal ? Using == : " + s1==s2);
    }
}
