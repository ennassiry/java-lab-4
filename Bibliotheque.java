package com.example.tp2;


import java.util.HashSet;
import java.util.Set;

public class Bibliotheque {

    // Compteur statique partagé par toutes les bibliothèques.
    // Il permet de générer automatiquement les identifiants.
    private static int compteur = 0;

    // Identifiant unique de la bibliothèque.
    // Le mot-clé final empêche sa modification après initialisation.
    private final int id;

    // Nom de la bibliothèque.
    private String nom;

    // Collection contenant les livres de la bibliothèque.
    // Set représente un ensemble qui ne conserve pas les doublons
    // selon les règles de comparaison des objets.
    // HashSet est une implémentation de l'interface Set.
    private Set<Livre> collection = new HashSet<>();

    // Constructeur permettant de créer une bibliothèque
    // en lui attribuant un nom.
    public Bibliotheque(String nom) {

        // Incrémente le compteur et attribue un nouvel identifiant.
        // La première bibliothèque reçoit l'identifiant 1.
        this.id = ++compteur;

        // Initialise le nom de la bibliothèque.
        this.nom = nom;
    }

    // Retourne l'identifiant de la bibliothèque.
    public int getId() {
        return id;
    }

    // Retourne le nom de la bibliothèque.
    public String getNom() {
        return nom;
    }

    // Retourne l'ensemble des livres de la bibliothèque.
    public Set<Livre> getCollection() {
        return collection;
    }

    // Ajoute un livre à la collection de la bibliothèque.
    public void ajouterLivre(Livre livre) {

        // Ajoute le livre à l'ensemble.
        // Si le même objet est déjà présent, HashSet ne l'ajoute pas
        // une deuxième fois.
        collection.add(livre);
    }

    // Redéfinit la méthode toString() héritée de la classe Object.
    // Elle retourne une représentation textuelle de la bibliothèque.
    @Override
    public String toString() {

        // Construit une chaîne contenant :
        // - l'identifiant de la bibliothèque ;
        // - son nom ;
        // - le nombre de livres dans sa collection.
        //
        // collection.size() retourne le nombre d'éléments présents.
        return "Bibliotheque[id=" + id +
               ", nom=" + nom +
               ", taille=" + collection.size() +
               "]";
    }
}
