import java.util.Scanner;

public class BMI{

    // Method to calculate BMI and populate the array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100; // Convert height to meters
            data[i][2] = weight / (heightInMeters * heightInMeters);
        }
    }

    // Method to determine BMI status
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal weight";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];

        // Taking input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        // Calculate BMI
        calculateBMI(data);

        // Display results
        System.out.println("\nHeight, Weight, BMI, and Status for each person:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d -> Height: %.2f cm, Weight: %.2f kg, BMI: %.2f, Status: %s\n",
                    (i + 1), data[i][1], data[i][0], data[i][2], getBMIStatus(data[i][2]));
        }
    }
}