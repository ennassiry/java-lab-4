package ma.projet.test;

import ma.projet.bean.Article;
import ma.projet.bean.Categorie;

public class TestApp {
	public static void main(String[] args) {
		Categorie[] categorie = new Categorie[3];
		Article[] atricle = new Article[4];

		categorie[0] = new Categorie("O", "PR");
		categorie[1] = new Categorie("P", "PO");
		
		atricle[0] = new Article("14","DELL INSPIRON",categorie[0]);
		atricle[1] = new Article("4","SONY VAIO",categorie[0]);
		atricle[2] = new Article("74","TERRA",categorie[1]);
		atricle[3] = new Article("785","HP Compaq",categorie[1]);
	
		for (Article a : atricle) {
			System.out.println(a);
			System.out.println("----------------------");
		}
	}
}
