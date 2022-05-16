package com.company;

import com.company.Resizeable;

public class Cricle extends Shape implements Resizeable {
    private double radius = 2.4;
    private String color = "blue";



    public Cricle(){
    }

    public Cricle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double AreaHinhTron(){
        return (radius*radius)*Math.PI;
    }
    @Override
    public String toString() {
        return "Cricle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                "Area =" + this.AreaHinhTron()+
                '}';
    }

    @Override
    public void resize(double percent) {
        this.radius *= percent;
    }
}