package Minggu3.BasicAbstract;

abstract class Car {
    abstract void accelerate();
}

// concrete class
class Suzuki extends Car {
    void accelerate() {
        System.out.println("Suzuki::accelerate");

    }
}

class Main {
    public static void main(String args[]) {
        Car obj = new Suzuki();     // Car object =>contents of Suzuki
        obj.accelerate();           // calt the method
    }
}