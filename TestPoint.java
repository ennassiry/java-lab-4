package m.ennassiry.lab44;

public class TestPoint {
	public static void main(String[] argv) {
		Point p1 = new Point(1.0, 3.0); // Création du point de coordonnées x=1 et y=3

		Point p2 = new Point(5.0, 6.0); // Création du point de coordonnées x=5 et y=6


		Point p3 = p1.translation(2.0, 1.5); // retourne le point résultant de la translation
//	//(2,1.5) appliquée sur p1  
		double d = Point.distance(p1, p2); // calcule la distance entre p1 et p2
		System.out.println("p1 = " + p1); // Affiche : "p1 = ( 1.0 , 3.0 )" System.out.println( "p2 = " + p2 ) ; //
											// Affiche : "p2 = ( 5.0 , 6.0 )"
		System.out.println("p3 = " + p3); // Affiche : "p3 = ( 3.0 , 4.5 )"
		System.out.println("Distance  = " + d); // Affiche : "distance = 5.0 "
	}
}