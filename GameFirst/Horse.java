package com;

import java.util.ArrayList;
import java.util.List;

public class Horse {
    private String name;
    private double speed;
    private double distance;



    public Horse(String name, double speed, double distance){
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }
    public String getName(){
        return name;
    }

    public double getDistance() {
        return distance;
    }

    public double getSpeed() {
        return speed;
    }
    public void setName(String name){
        this.name=name;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double move(){
        distance += speed *Math.random();
        return distance;
    }public void print(){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i =0;i < (int) distance;i++){
            stringBuilder.append(".");
        }
        System.out.println(stringBuilder+name);

    }
}
