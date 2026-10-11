package com.example.tp2;

public class Livre {

    // Compteur statique partagé par tous les objets Livre.
    // Il permet de générer automatiquement les identifiants des livres.
    private static int compteur = 0;

    // Identifiant unique du livre.
    // Le mot-clé final empêche sa modification après son initialisation.
    private final int id;

    // Titre du livre.
    private String titre;

    // Référence vers l'auteur de ce livre.
    // Chaque livre est associé à un objet de type Auteur.
    private Auteur auteur;

    // Constructeur permettant de créer un livre
    // en initialisant son titre et son auteur.
    public Livre(String titre, Auteur auteur) {

        // Incrémente le compteur et attribue un identifiant unique.
        // Le premier livre reçoit l'identifiant 1.
        this.id = ++compteur;

        // Initialise le titre du livre.
        this.titre = titre;

        // Associe l'auteur au livre.
        this.auteur = auteur;

        // Ajoute ce livre à la liste des livres de son auteur.
        // "this" désigne l'objet Livre qui vient d'être créé.
        // Cela établit la liaison dans les deux sens :
        // le livre connaît son auteur et l'auteur connaît ce livre.
        auteur.ajouterLivre(this);
    }

    // Retourne l'identifiant du livre.
    public int getId() {
        return id;
    }

    // Retourne le titre du livre.
    public String getTitre() {
        return titre;
    }

    // Retourne l'objet Auteur associé à ce livre.
    public Auteur getAuteur() {
        return auteur;
    }

    // Redéfinit la méthode toString() héritée de la classe Object.
    // Elle retourne une représentation textuelle du livre.
    @Override
    public String toString() {

        // Construit une chaîne contenant :
        // - l'identifiant du livre ;
        // - son titre ;
        // - le nom de son auteur.
        //
        // getNom() permet de récupérer le nom de l'auteur associé.
        return "Livre[id=" + id +
               ", titre=" + titre +
               ", auteur=" + auteur.getNom() +
               "]";
    }
}
