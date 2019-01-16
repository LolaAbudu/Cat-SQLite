package com.example.lolaabudu.cat_sqlite;

public class Cat {
    private String name;
    private String color;
    private String hairyness;

    public Cat(String name,
             String color,
             String hairyness){
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHairyness(String hairyness) {
        this.hairyness = hairyness;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getHairyness() {
        return hairyness;
    }

    //override this method so that when you do .toString, it gives you first, last and company rather than the address in memory
    @Override
    public String toString() {
        return name + " " + color + " " + hairyness;
    }
}
