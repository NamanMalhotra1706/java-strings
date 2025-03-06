import java.util.Scanner;

public class ReverseAString {
    public static String reverseString(String str){
        String ans = "";
        for(int i=str.length()-1;i>=0;i--){
            ans+=str.charAt(i);
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        String revervse = reverseString(str);

        System.out.println("Reverse of String is : " + revervse);
    }
}

// Sample Case
// Enter the String: 
// naman
// Reverse of String is : naman
