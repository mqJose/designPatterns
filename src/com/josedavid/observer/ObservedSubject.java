package com.josedavid.observer;

public interface ObservedSubject {
    public void notifyStatus();

    /*
        * Class Observer
        * */
    class Motor implements Observer{
        @Override
        public void update() {
            System.out.println("modifico su estado");
        }
    }
}
