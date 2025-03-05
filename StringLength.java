import java.util.Scanner;

public class StringLength {
    public static int stringLength(String str){
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index Out Of Bounds Exception");
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();

        System.out.println("String length using length method: "+ str.length());
        System.out.println("String length using defined method: "+stringLength(str));

    }
}
