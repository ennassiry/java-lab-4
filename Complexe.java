package m.ennassiry.lab44;

public class Complexe {
private int e;
private int i;


public Complexe(int e, int i) {
	super();
	this.e = e;
	this.i = i;
}

public Complexe plus(Complexe c) {
	Complexe tmp = new Complexe(0,0);
	 tmp.e = this.e + c.e;
	 tmp.i = this.i + c.i;
	 return  tmp;
}

public Complexe moins(Complexe c) {
	Complexe tmp = new Complexe(0,0);
	 tmp.e = this.e - c.e;
	 tmp.i = this.i - c.i;
	 return  tmp;
}


@Override
public String toString() {
	return this.e +" + "+this.i+"i";
}

}
