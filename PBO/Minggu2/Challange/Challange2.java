package Minggu2.Challange;

import java.util.Scanner;

public class Challange2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        try {
            int i, n, o;
            System.out.print("Input value : ");
            n = keyboard.nextInt();
            i = 0;

            for (o = 2; o <= n; o += 2) {
                i = o + i;
            }
            System.out.println("Output : " + i);
        } finally {
            keyboard.close();
        }
    }
}
