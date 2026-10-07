package m.ennassiry.lab44;

public class TestComplexe { 
	 public static void main(String[] argv) { 
	  Complexe c1 = new Complexe(2,2) ; // Création du nombre complexe 2 + 2i 
	  Complexe c2 = new Complexe(-3,4) ;  // Création du nombre complexe -3 + 4i 
	  Complexe c3, c4 ; 
	  c3 = c1.plus( c2 ) ;

	//   Addition de c1 et c2 
	  c4 = c1.moins( c2) ;   // Soustraction de c1 par c2 
	  System.out.println( "c1 + c2 = " + c3 ) ; // Affiche : "c1 + c2 = -1 +6i" 
	  System.out.println( "c1 - c2 = " + c4 ) ;  // Affiche : "c1 - c2 = 5 -2i " 
	 } 
	} 