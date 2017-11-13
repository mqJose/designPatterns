package com.josedavid.decorator;

//step 4 for implementing a decorator
public class ElectricCar extends CarDecorator {

    public ElectricCar(Car car) {
        super(car);
    }

    @Override
    public void speedUp() {
        System.out.println("Starting electrically");
        getCar().speedUp();
    }

    @Override
    public void start() {
        System.out.println("Starting Operative System");
        getCar().start();
    }

    @Override
    public void stop() {
        System.out.println("Controlling electronic brakes ");
        getCar().stop();
    }
}
