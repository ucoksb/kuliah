package Minggu4.Example;

public class Calculate {
    int number1;
    int number2;

    void welcome(String name) {
        System.out.println("Welcome to the calculation program");
        System.out.println("Created by " + name);
    }
    int additionNumber(){
        int result= number1 + number2;
        return result;
    }

    void substractionNumber(int var1, int var2){
        //store var1 to internal methode variabel 
        int internal_number1=var1;
        
        int result=internal_number1 - var2;
        System.out.println("The Result "+internal_number1+"-"+var2+" is "+result);
    }
}