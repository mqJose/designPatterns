package com.josedavid.decorator;

//step 2 for implementing a decorator
public class StandardCar implements Car {
    private String make;
    public StandardCar(String make) {
        this.setMake(make);
    }

    @Override
    public void speedUp() {
        System.out.println(" I love speed Up");
    }

    @Override
    public void start() {
        System.out.println(" I am start");
    }

    @Override
    public void stop() {
        System.out.println(" I am stopping");
    }

    public String getMake() {
        return make;
    }

    private void setMake(String make) {
        this.make = make;
    }
}
