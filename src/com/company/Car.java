package com.company;

public class Car implements AutoCloseable {

    public void drive(){
        System.out.println("Mashina jurup jatat");
    }
    public void close(){
        System.out.println("Mashina jabylyp jatat");
    }
}
