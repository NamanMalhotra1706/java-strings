import java.util.Scanner;
import java.util.Random;

public class GradeSystem2Darray {

    // random scores for PCM subjects
    public static int[][] generateRandomScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];
        
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = random.nextInt(100); 
            scores[i][1] = random.nextInt(100);
            scores[i][2] = random.nextInt(100); 
        }
        return scores;
    }

    // calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];
        
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double percentage = Math.round((total / 300.0) * 100 * 100.0) / 100.0;
            double average = Math.round((total / 3.0) * 100.0) / 100.0;
            
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
        return results;
    }

    // grade based on percentage
    public static String[] calculateGrades(double[][] results) {
        String[] grades = new String[results.length];
        
        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];
            
            if (percentage >= 80) grades[i] = "Level 4, above agency-normalized standards";
            else if (percentage >= 70) grades[i] = "Level 3, at agency-normalized standards";
            else if (percentage >= 60) grades[i] = "Level 2, below, but approaching agency-normalized standards";
            else if (percentage >= 50) grades[i] = "Level 1, well below agency-normalized standards";
            else if (percentage >= 40) grades[i] = "Level 1, too below agency-normalized standards";
            else grades[i] = "Remedial standards";
        }
        return grades;
    }

    // scorecard
    public static void scorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.println("\nStudent Scorecard:");
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", "Student", "Physics", "Chemistry", "Maths", "Total", "Avg", "%", "Grade");
        System.out.println("------------------------------------------------------------");
        
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.2f %-10.2f %-10s\n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2] + "%", grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        
        int[][] scores = generateRandomScores(numStudents);
        double[][] results = calculateResults(scores);
        String[] grades = calculateGrades(results);
        
        scorecard(scores, results, grades);
        
        sc.close();
    }
}

// Sample Case
// Enter the number of students: 5

// Student Scorecard:
// ------------------------------------------------------------
// Student    Physics    Chemistry  Maths      Total      Avg        %
// ------------------------------------------------------------
// 1          3          73         69         145.00     48.33      48.33%    
// 2          18         98         7          123.00     41.00      41.0%     
// 3          83         10         97         190.00     63.33      63.33%    
// 4          20         12         55         87.00      29.00      29.0%     
// 5          72         90         25         187.00     62.33      62.33% 