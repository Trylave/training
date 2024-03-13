package io.hexlet;

public class App {
    public static double getSquare(int a, int b, double c) {
        double pi = (Math.PI * c) / 180;
        double sin = Math.sin(pi);
        int ab = a * b / 2;
        double fin = (double)ab * sin;
        return fin;
    }
}
