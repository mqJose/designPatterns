package com.josedavid.observer;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

/*
* Class ObservedSubject
* */
public class Accelerator implements ObservedSubject{

    ArrayList<Observer> observers;

    public Accelerator() {
        this.observers = new ArrayList<Observer>();
    }

    public void linkedObserver( Observer observer ){
        observers.add(observer);
    }

    public Observer removeObserver(){
        return observers.remove(observers.size()-1);
    }

    public void speedUp(){
        notifyStatus();
    }

    @Override
    public void notifyStatus() {
        for (Observer o: observers){
            o.update();
        }
    }
}
