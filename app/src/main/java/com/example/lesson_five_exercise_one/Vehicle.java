package com.example.lesson_five_exercise_one;

public abstract class Vehicle {
    int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public abstract void ride(int km);
}
