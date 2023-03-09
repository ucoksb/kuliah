package Minggu2;

import java.util.Scanner;

public class Challange1 {
    public static void main(System[] args) {
        String nama;
        int FEScore, MEScore, AScore;
        
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter your name : ");
        nama = keyboard.nextLine();
        System.out.print("Enter Final Exam Score = ");
        FEScore = keyboard.nextInt();
        System.out.print("Enter Middle Exam Score = ");
        MEScore = keyboard.nextInt();
        System.out.print("Enter Assignment Score = ");
        AScore = keyboard.nextInt();
        double sum_value = (0.40 * FEScore + 0.35 * MEScore + 0.25 * AScore);

        System.out.println(nama+" NIlai akhirnya adalah "+sum_value);
    }

}
