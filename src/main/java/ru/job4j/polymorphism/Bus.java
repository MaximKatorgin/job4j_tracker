package ru.job4j.polymorphism;

public class Bus implements Transport {
    private int fuel = 0;

    @Override
    public void move() {
        System.out.println("Автобус поехал");
    }

    @Override
    public void passengers() {
        System.out.println("Пересчитываем пассажиров");
    }

    @Override
    public int refuel(int fuel) {
        return this.fuel + fuel;
    }
}
