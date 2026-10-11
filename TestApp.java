
package ma.projet.test;

import ma.projet.bean.Categorie;
import ma.projet.bean.Article;

public class Main {

    public static void main(String[] args) {

        // Création de deux catégories.
        Categorie c1 = new Categorie("Ordinateur Portable", "OPR");
        Categorie c2 = new Categorie("Ordinateur Poste", "OPO");

        // Création de trois articles associés aux catégories.
        Article a1 = new Article(14, "DELL INSPIRON", c1);
        Article a2 = new Article(4, "SONY VAIO", c1);
        Article a3 = new Article(74, "HP Compaq", c2);

        // Affichage des catégories.
        System.out.println(c1);
        System.out.println(c2);

        // Affichage des articles.
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        // Affichage de la catégorie du premier article.
        System.out.println(a1.getCategorie().getLibelle());
    }
}
