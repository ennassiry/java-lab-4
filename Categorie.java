
package ma.projet.bean;

public class Categorie {

    // Compteur statique partagé par toutes les catégories.
    // Il permet de générer automatiquement les identifiants.
    private static int compteur = 0;

    // Identifiant unique de la catégorie.
    // final garantit que l'identifiant ne sera pas modifié.
    private final int id;

    // Libellé de la catégorie, par exemple "Ordinateur Portable".
    private String libelle;

    // Code de la catégorie, par exemple "OPR" ou "OPO".
    private String code;

    // Constructeur permettant d'initialiser une catégorie.
    public Categorie(String libelle, String code) {

        // Incrémente le compteur et attribue un identifiant
        // qui commence à 1 pour la première catégorie.
        this.id = ++compteur;

        // Initialise le libellé et le code.
        this.libelle = libelle;
        this.code = code;
    }

    // Retourne l'identifiant de la catégorie.
    public int getId() {
        return id;
    }

    // Retourne le libellé de la catégorie.
    public String getLibelle() {
        return libelle;
    }

    // Modifie le libellé de la catégorie.
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    // Retourne le code de la catégorie.
    public String getCode() {
        return code;
    }

    // Modifie le code de la catégorie.
    public void setCode(String code) {
        this.code = code;
    }

    // Retourne une représentation textuelle de la catégorie.
    @Override
    public String toString() {
        return "Categorie{id=" + id +
               ", libelle='" + libelle + '\'' +
               ", code='" + code + '\'' +
               '}';
    }
}

