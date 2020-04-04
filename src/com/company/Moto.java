package com.company;

public class Moto {

    private String color;
    private int capacity;
    private String model;
    private String brand;


    public Moto(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
    }

    public Moto(String color, int capacity, String model, String brand) {

        this(color, capacity);
        this.model = model;
        this.brand = brand;


    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getBrand() {
        return brand;
    }



}
