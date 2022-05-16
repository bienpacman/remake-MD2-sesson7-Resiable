package com.company;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Shape[] sapes = new Shape[3];
        sapes[0] = new Cricle(3, "blue");
        sapes[1] = new Rectangle(4, 3);
        sapes[2] = new Square(6);
        for (int i = 0; i < sapes.length; i++) {
            System.out.println(sapes[i]);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap pham tram : ");
        double percents = scanner.nextDouble();

        for (int i = 0; i < sapes.length; i++) {
            ((Resizeable)sapes[i]).resize(percents);
            System.out.println(sapes[i]);
        }
    }
}