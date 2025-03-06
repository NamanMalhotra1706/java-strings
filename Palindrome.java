import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();

        if(isPalindrome(str)){
            System.out.println("The string is Palindrome");
        }
        else{
            System.out.println("The string is not Palindrome");
        }
    }

    // Boolean function to check the string is Palindrome
    public static boolean isPalindrome(String str){
        int st = 0;
        int en = str.length()-1;

        while(st<en){
            if(str.charAt(st)!=str.charAt(en)){
                return false;
            }
            st++;
            en--;
        }

        return true;
    }
}


// Sample Case
// Enter the string: naman
// The string is Palindrome