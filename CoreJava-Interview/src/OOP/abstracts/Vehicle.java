package OOP.abstracts;

abstract class Vehicle {

    abstract void start();   // abstract method

    void stop() {            // concrete method
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with key");
    }
}
