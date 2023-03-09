package Minggu1;
import java.util.Scanner;
public class Week1InputOutput {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.print("You entered " + number);

        // closing the scanner object
        input.close();
    }
}
