import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        // Input marks obtained in each subject
        System.out.println("Enter the number of subjects:");
        int numberOfSubjects = scanner.nextInt();
        int[] marks = new int[numberOfSubjects];

        System.out.println("Enter the marks obtained in each subject out of 100:");
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Calculate Total Marks
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        // Calculate Average Percentage
        double averagePercentage = (double) totalMarks / numberOfSubjects;

        // Grade Calculation
        String grade;
        if (averagePercentage >= 80) {
            grade = "A+";
        } else if (averagePercentage >= 75 && averagePercentage <= 79) {
            grade = "B+";
        } else if (averagePercentage >= 70 && averagePercentage <= 74) {
            grade = "B";
        } else if (averagePercentage >= 65 && averagePercentage <= 69) {
            grade = "B-";
        } else if(averagePercentage >= 60 && averagePercentage <= 64){
            grade = "C+";
        }else if (averagePercentage >= 55 && averagePercentage <= 59) {
            grade = "C";
        }else if (averagePercentage >=50 && averagePercentage <= 54) {
            grade = "C-";
        }else if (averagePercentage >= 40 && averagePercentage <= 49) {
            grade = "D";
        }else {
            grade = "F";
        }

        // Display Results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
