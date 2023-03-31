package Minggu4.Example;

public class MainCalculate {
    public static void name(String[] args) {
        Calculate access = new Calculate();

        access.welcome("YOUR NAME");

        access.number1=8;
        access.number2=5;
        System.out.println("The Result 8 added by 5 equals to "+access.additionNumber());

        int resultAdd= access.additionNumber();
        System.out.println("----- Result 8 added by 5 equals to "+resultAdd);

        access.substractionNumber(7,3);
    }
}
