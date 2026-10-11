package com.example.tp4;


public class TestPoint {
    public static void main(String[] argv) {

        // Création de deux points
        Point p1 = new Point(1.0, 3.0);
        Point p2 = new Point(5.0, 6.0);

        // Translation du point p1 de (2.0, 1.5)
        Point p3 = p1.translation(2.0, 1.5);

        // Calcul de la distance entre p1 et p2
        double d = Point.distance(p1, p2);

        // Affichage des points et de la distance
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println("p3 = " + p3);
        System.out.println("Distance = " + d);
    }
}
