package Minggu4.Example1;

public class Main {
public static void main(String[] args){
    
        Person pertama = new Person();
        pertama.setName("John");
        pertama.age=30;

        System.out.println("Name: " + pertama.getName());
        System.out.println("Age: " + pertama.getAge());
    }
}