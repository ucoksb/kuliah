package Minggu4.BasicAbstraction;

//abstract class
abstract class Car {
    abstract void accelerate();
    void identity(){
        System.out.println("cars generally have 4 wheels and 1 steering wheel");
    }
    void maxSpeed() {
        System.out.println("Maximum speed is 100km/hour");
        calculateFuel();
    }
    private void calculateFuel() {
        System.out.println("The average use of car gasoline is 10km/1liter");
    }
}

    // concrete class
    class Suzuki extends Car {
        void accelerate() {
        System.out.println("Suzuki::accelerate");
    }
}

class Main {
    public static void main(String args[]) {
        Car obj = new Suzuki(); // Car object->contents of Suzuki
        obj.accelerate();
        obj.identity();
        obj.maxSpeed();
        // call the method S..
    }
}
