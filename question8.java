package JavaPractice;

import java.util.Scanner;

class question8{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       
        System.out.print(" Enter the number of subject you have: ");
        int subjects = scanner.nextInt();

        double[] grades = new double[subjects];

        double total = 0;

        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter grade for subject " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
            total += grades[i];
        }

        // Calculate average grade
        double average = total / subjects;

        // Determine letter grade
        char letterGrade;
        if (average >= 90) {
            letterGrade = 'A';
        } else if (average >= 80) {
            letterGrade = 'B';
        } else if (average >= 70) {
            letterGrade = 'C';
        } else if (average >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }

        System.out.printf("Average Grade: %.2f\n", average);
        System.out.println("Letter Grade: " + letterGrade);

        scanner.close();
    }
}