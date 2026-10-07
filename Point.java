package m.ennassiry.lab44;

import  java.lang.Math;

public class Point {
	private double x;
	private double y;

	public Point(double x, double y) {

		this.x = x;
		this.y = y;
	}

	public Point translation(double a, double b) {

		Point tmp = new Point(0, 0);
		tmp.x = this.x + a;
		tmp.y = this.y + b;
		return tmp;

	}

public static double distance(Point p1 , Point p2) {
           double x = p2.x - p1.x;
        		  x = x*x;
          double y = p2.y - p1.y;
                 y = y*y;
           
		   double res = Math.sqrt(x+y);
		   return res;
	
}



	@Override
	public String toString() {
		return "( " + this.x + " , " + this.y + " )";
	}

}
