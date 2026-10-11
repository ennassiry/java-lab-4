package com.example.tp3;


public class TestComplexe {
    public static void main(String[] argv) {

        // Création de deux nombres complexes
        Complexe c1 = new Complexe(2, 2);   // 2 + 2i
        Complexe c2 = new Complexe(-3, 4);  // -3 + 4i
        
        Complexe c3, c4;

        // Addition : (2 + 2i) + (-3 + 4i)
        c3 = c1.plus(c2);

        // Soustraction : (2 + 2i) - (-3 + 4i)
        c4 = c1.moins(c2);

        // Affichage des résultats
        System.out.println("c1 + c2 = " + c3);
        System.out.println("c1 - c2 = " + c4);
    }
}
