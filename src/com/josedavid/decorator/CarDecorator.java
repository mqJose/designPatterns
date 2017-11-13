package com.josedavid.decorator;

//step 3 for implementing a decorator
public abstract class CarDecorator implements Car{

    private Car car;

    CarDecorator(Car car) {
        this.car = car;
    }
    // It is important that it be protected
    protected Car getCar(){
        return this.car;
    }
}
