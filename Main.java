package com.example.tp2;


public class Main {

    public static void main(String[] args) {

        // 1. Création des auteurs
        Auteur tahar = new Auteur("Tahar Ben Jelloun");
        Auteur leila = new Auteur("Leïla Slimani");
        Auteur camus = new Auteur("Albert Camus");

        // 2. Création des livres
        // Chaque livre est automatiquement associé à son auteur.
        Livre l1 = new Livre("La Nuit sacrée", tahar);
        Livre l2 = new Livre("Le Racisme expliqué à ma fille", tahar);

        Livre l3 = new Livre("Chanson douce", leila);
        Livre l4 = new Livre("Dans le jardin de l'ogre", leila);

        Livre l5 = new Livre("L'Étranger", camus);

        // 3. Création des bibliothèques
        Bibliotheque ens = new Bibliotheque("Bibliothèque ENS");
        Bibliotheque municipale = new Bibliotheque("Bibliothèque Municipale");

        // 4. Association des livres aux bibliothèques

        // Bibliothèque ENS
        ens.ajouterLivre(l1);
        ens.ajouterLivre(l3);
        ens.ajouterLivre(l5);

        // Bibliothèque Municipale
        municipale.ajouterLivre(l2);
        municipale.ajouterLivre(l3);
        municipale.ajouterLivre(l4);
        municipale.ajouterLivre(l5);

        // 5. Affichage des auteurs et de leurs livres
        System.out.println("===== AUTEURS ET LEURS LIVRES =====");

        System.out.println(tahar);
        tahar.getLivres().forEach(l ->
            System.out.println("  • " + l)
        );

        System.out.println(leila);
        leila.getLivres().forEach(l ->
            System.out.println("  • " + l)
        );

        System.out.println(camus);
        camus.getLivres().forEach(l ->
            System.out.println("  • " + l)
        );

        // 6. Affichage de la collection de la bibliothèque ENS
        System.out.println();
        System.out.println("===== BIBLIOTHÈQUE ENS =====");

        System.out.println(ens);
        ens.getCollection().forEach(l ->
            System.out.println(
                "  – " + l.getTitre() + " (id=" + l.getId() + ")"
            )
        );

        // 7. Affichage de la collection de la bibliothèque municipale
        System.out.println();
        System.out.println("===== BIBLIOTHÈQUE MUNICIPALE =====");

        System.out.println(municipale);
        municipale.getCollection().forEach(l ->
            System.out.println(
                "  – " + l.getTitre() + " (id=" + l.getId() + ")"
            )
        );
    }
}
