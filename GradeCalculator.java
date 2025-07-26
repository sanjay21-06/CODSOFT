import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Grade Calculator!");
        System.out.print("Enter total number of subjects: ");
        int subjectCount = sc.nextInt();

        int totalMarks = 0;
        
        for (int i = 1; i <= subjectCount; i++) {
            System.out.print("Enter marks for subject " + i + " (out of 100): ");
            int marks = sc.nextInt();
            
            while (marks < 0 || marks > 100) {
                System.out.print("Invalid input. Enter marks between 0 and 100: ");
                marks = sc.nextInt();
            }

            totalMarks += marks;
        }

        double average = (double) totalMarks / subjectCount;
        String grade;
        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F (Fail)";
        }

        System.out.println("\n📝 Final Report:");
        System.out.println("Total Marks: " + totalMarks + " / " + (subjectCount * 100));
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
