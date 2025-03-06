import java.util.Scanner;
import java.util.Random;

public class ValidVoter {

    // generate random ages for n students
    public static int[] generateRandomAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(90) + 10; // random 2-digit age
        }
        return ages;
    }

    // check voting eligibility and create a 2D result array
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            results[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                results[i][1] = "false";
            } else {
                results[i][1] = ages[i] >= 18 ? "true" : "false";
            }
        }
        return results;
    }

    //  results in a tabular format
    public static void displayResults(String[][] results) {
        System.out.println("Age | Can Vote");
        System.out.println("---------------");
        for (String[] result : results) {
            System.out.println(result[0] + "   |   " + result[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        
        int[] ages = generateRandomAges(numStudents);
        String[][] results = checkVotingEligibility(ages);
        
        displayResults(results);
        sc.close();
    }
}

// Sample Case
// Enter the number of students: 5
// Age | Can Vote
// ---------------
// 48   |   true
// 45   |   true
// 65   |   true
// 73   |   true
// 70   |   true