package Minggu1;
import java.util.Scanner;
public class Week1InputOutput {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an first integer: ");
        int number1 = input.nextInt();
        System.out.print("Enter an second integer: ");
        int number2 = input.nextInt();
        System.out.println("\nYou first integer is " + number1 + "\nThe second integer is "+number2 );

        // closing the scanner object
        input.close();
    }
}