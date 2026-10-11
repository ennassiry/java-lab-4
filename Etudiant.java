package com.example.tp;

public class Etudiant {

    // Attribut statique partagé par tous les objets Etudiant.
    private static int compteur = 0;

    // Identifiant unique de l'étudiant.
    // Le mot-clé final empêche de modifier cet identifiant après son initialisation.
    private final int id;

    // Attributs qui stockent le nom et le prénom de l'étudiant.
    private String nom;
    private String prenom;

    // Référence vers la filière à laquelle l'étudiant est associé.
    // Elle vaut null si aucune filière n'a encore été attribuée.
    private Filiere filiere;

    // Constructeur : permet de créer un nouvel étudiant
    // en initialisant son nom et son prénom.
    public Etudiant(String nom, String prenom) {

        // Incrémente le compteur puis attribue sa valeur à l'identifiant.
        this.id = ++compteur;

        // Initialise les attributs de l'objet courant.
        this.nom = nom;
        this.prenom = prenom;
    }

    // Associe l'étudiant à une filière.
    // Le paramètre f représente la filière à attribuer.
    public void setFiliere(Filiere f) {

        // Enregistre la référence de la filière dans l'objet étudiant.
        this.filiere = f;
    }

    // Retourne l'identifiant de l'étudiant.
    public int getId() {
        return id;
    }

    // Retourne le nom de l'étudiant.
    public String getNom() {
        return nom;
    }

    // Retourne le prénom de l'étudiant.
    public String getPrenom() {
        return prenom;
    }

    // Retourne l'objet Filiere associé à cet étudiant.
    // Si aucune filière n'est attribuée, la méthode retourne null.
    public Filiere getFiliere() {
        return filiere;
    }

    // Redéfinit la méthode toString() héritée de la classe Object.
    // Elle permet d'obtenir une représentation textuelle de l'étudiant.
    @Override
    public String toString() {

        // Vérifie si une filière a été attribuée.
        // Si oui, récupère son nom ; sinon, utilise "Aucune".
        String fil = (filiere != null)
                ? filiere.getNom()
                : "Aucune";

        // Construit et retourne une chaîne contenant
        // l'identifiant, le nom, le prénom et la filière.
        return "# Étudiant : id=" + id +
               ", nom=" + nom +
               ", prénom=" + prenom +
               ", filière=" + fil;
    }
}

