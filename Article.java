
package ma.projet.bean;

public class Article {

    // Compteur statique partagé par tous les articles.
    // Il permet de générer automatiquement leurs identifiants.
    private static int compteur = 0;

    // Identifiant unique de l'article.
    private final int id;

    // Code numérique de l'article, par exemple 14 ou 785.
    private int code;

    // Désignation de l'article, par exemple "DELL INSPIRON".
    private String designation;

    // Catégorie à laquelle appartient l'article.
    // Il s'agit d'une référence vers un objet de type Categorie.
    private Categorie categorie;

    // Constructeur permettant d'initialiser un article.
    public Article(int code, String designation, Categorie categorie) {

        // Incrémente le compteur et attribue un identifiant
        // commençant à 1 pour le premier article.
        this.id = ++compteur;

        // Initialise les informations de l'article.
        this.code = code;
        this.designation = designation;
        this.categorie = categorie;
    }

    // Retourne l'identifiant de l'article.
    public int getId() {
        return id;
    }

    // Retourne le code de l'article.
    public int getCode() {
        return code;
    }

    // Modifie le code de l'article.
    public void setCode(int code) {
        this.code = code;
    }

    // Retourne la désignation de l'article.
    public String getDesignation() {
        return designation;
    }

    // Modifie la désignation de l'article.
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    // Retourne la catégorie associée à l'article.
    public Categorie getCategorie() {
        return categorie;
    }

    // Modifie la catégorie associée à l'article.
    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    // Retourne exactement l'identifiant, le code
    // et la désignation, séparés par des espaces.
    @Override
    public String toString() {
        return id + " " + code + " " + designation;
    }
}
