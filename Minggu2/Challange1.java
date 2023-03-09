package Minggu2;

import java.util.Scanner;

public class Challange1 {
    public static void main(String[] args) {
        String grade, nama;
        int FEScore, MEScore, AScore;
        final double sum_value;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter your name : ");
        nama = keyboard.nextLine();
        System.out.print("Enter Final Exam Score = ");
        FEScore = keyboard.nextInt();
        System.out.print("Enter Middle Exam Score = ");
        MEScore = keyboard.nextInt();
        System.out.print("Enter Assignment Score = ");
        AScore = keyboard.nextInt();
        sum_value = (0.40 * FEScore + 0.35 * MEScore + 0.25 * AScore);

        if (sum_value >= 85 && sum_value < 100) {
            grade = "A";

        } else if (sum_value >= 80 && sum_value < 85) {
            grade = "A-";
        } else if (sum_value >= 75 && sum_value < 80) {
            grade = "B+";
        } else if (sum_value >= 80 && sum_value < 85) {
            grade = "B";
        } else if (sum_value >= 75 && sum_value < 80) {
            grade = "B-";
        } else if (sum_value >= 60 && sum_value < 75) {
            grade = "C+";
        } else if (sum_value >= 50 && sum_value < 60) {
            grade = "C";
        } else if (sum_value >= 40 && sum_value < 50) {
            grade = "D";
        } else {
            grade = "E";
        }
        System.out.print("\nHi " + nama + "\nyour final score is " + grade);

        keyboard.close();
    }
}
