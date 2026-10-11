package com.example.tp2;

import java.util.ArrayList;
import java.util.List;

public class Auteur {

	// Compteur statique partagé par tous les objets Auteur.
	// Il permet de générer automatiquement les identifiants.
	private static int compteur = 0;

	// Identifiant unique de l'auteur.
	// Le mot-clé final empêche sa modification après initialisation.
	private final int id;

	// Nom de l'auteur.
	private String nom;

	// Liste contenant les livres associés à cet auteur.
	// ArrayList permet d'ajouter des livres dynamiquement.
	private List<Livre> livres = new ArrayList<>();

	// Constructeur permettant de créer un auteur avec son nom.
	public Auteur(String nom) {

		// Incrémente le compteur et attribue un identifiant unique.
		// Le premier auteur reçoit l'identifiant 1.
		this.id = ++compteur;

		// Initialise le nom de l'auteur.
		this.nom = nom;
	}

	// Retourne l'identifiant de l'auteur.
	public int getId() {
		return id;
	}

	// Retourne le nom de l'auteur.
	public String getNom() {
		return nom;
	}

	// Retourne la liste des livres associés à cet auteur.
	public List<Livre> getLivres() {
		return livres;
	}

	// Ajoute un livre à la liste de l'auteur.
	public void ajouterLivre(Livre livre) {

		// Vérifie que le livre n'est pas déjà présent dans la liste.
		// contains() utilise equals() pour comparer les objets.
		if (!livres.contains(livre)) {

			// Ajoute le livre uniquement s'il n'est pas déjà présent.
			livres.add(livre);
		}
	}

	// Redéfinit la méthode toString() héritée de la classe Object.
	// Elle retourne une représentation textuelle de l'auteur.
	@Override
	public String toString() {

		// Affiche l'identifiant, le nom et le nombre de livres associés.
		// size() retourne le nombre d'éléments dans la liste.
		return " # Auteur : id=" + id + ", nom=" + nom + ", nbLivres=" + livres.size();
	}
}
