import java.util.Scanner;

public class ProgressCard {

    public static float calculateSGPA(int[] grades, int[] credits, int numSubjects) {
        int totalCredits = 0;
        int totalPoints = 0;

        for (int i = 0; i < numSubjects; i++) {
            totalCredits += credits[i];
            totalPoints += grades[i] * credits[i];
        }

        return (float) totalPoints / totalCredits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of semesters: ");
        int numSemesters = scanner.nextInt();

        int totalCredits = 0;
        float totalPoints = 0;
        float[] sgpa = new float[numSemesters];

        for (int i = 0; i < numSemesters; i++) {
            System.out.println("\nSemester " + (i + 1) + ":");
            System.out.print("Enter the number of subjects: ");
            int numSubjects = scanner.nextInt();

            int[] grades = new int[numSubjects];
            int[] credits = new int[numSubjects];

            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Enter grade (point) and credit for subject " + (j + 1) + ": ");
                grades[j] = scanner.nextInt();
                credits[j] = scanner.nextInt();
            }

            sgpa[i] = calculateSGPA(grades, credits, numSubjects);
            System.out.printf("SGPA for semester %d: %.2f%n", i + 1, sgpa[i]);

            for (int j = 0; j < numSubjects; j++) {
                totalCredits += credits[j];
                totalPoints += grades[j] * credits[j];
            }
        }

        float cgpa = totalPoints / totalCredits;

        System.out.println("\n----- Progress Card -----");
        for (int i = 0; i < numSemesters; i++) {
            System.out.printf("Semester %d SGPA: %.2f%n", i + 1, sgpa[i]);
        }
        System.out.printf("Overall CGPA: %.2f%n", cgpa);
        System.out.println("-------------------------");

        scanner.close();
    }
}
