package com.example.tp3;


public class Complexe {

    // Les deux parties du nombre complexe : a + bi
    private double reel;
    private double imaginaire;

    // Constructeur : initialise la partie réelle et la partie imaginaire
    public Complexe(double reel, double imaginaire) {
        this.reel = reel;
        this.imaginaire = imaginaire;
    }

    // Addition de deux nombres complexes
    public Complexe plus(Complexe c) {
        double r = this.reel + c.reel;
        double i = this.imaginaire + c.imaginaire;

        return new Complexe(r, i);
    }

    // Soustraction de deux nombres complexes
    public Complexe moins(Complexe c) {
        double r = this.reel - c.reel;
        double i = this.imaginaire - c.imaginaire;

        return new Complexe(r, i);
    }

    // Représentation du nombre complexe sous forme de texte
    @Override
    public String toString() {
        if (imaginaire >= 0) {
            return reel + " +" + imaginaire + "i";
        } else {
            return reel + " " + imaginaire + "i";
        }
    }
}
