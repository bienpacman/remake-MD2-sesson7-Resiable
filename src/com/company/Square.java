package com.company;

public class Square extends Shape implements Resizeable {
    private int d = 5;

    public  Square(){

    }

    public Square(int d) {
        this.d = d;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
    public double AreaVuong(){
        return d*d;
    }
    @Override
    public String toString() {
        return "Square{" +
                "d=" + d +
                "Area=" +this.AreaVuong()+
                '}';
    }

    @Override
    public void resize(double percent) {
        this.d*=percent;
    }
}

