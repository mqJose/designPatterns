package com.josedavid.observer;

public class Motor implements Observer{
    @Override
    public void update() {
        System.out.println("Pediste acelerar, Motor acelerando");
    }
}
