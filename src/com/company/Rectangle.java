package com.company;


public class Rectangle extends Shape implements Resizeable {
    private int height = 4;
    private  int wight = 3;



    public Rectangle(int height, int wight) {
        this.height = height;
        this.wight = wight;
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWight() {
        return wight;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }
    public double AreaCN(){
        return height*wight;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                " heigh t= " + height +
                ", wight=" + wight +
                " Area = " + this.AreaCN() +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.wight*=percent;
        this.height*=percent;

    }
}
