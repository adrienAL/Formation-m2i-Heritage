package m2i.formation.java;

public class Point implements Comparable<Point> // on implemente la classe Point avec l'interface comparable pour pouvoir comparer
// deux point avec la methode sort dans forme
{
	protected int x;
	protected int y;
	
	
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	

	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}



	public void Initialise(int dx, int dy)
	{
		System.out.println("point 2d");
		this.x=dx;
		this.y=dy;
	}
	
	public String Affiche()
	{
		return "(" + this.x + "," + this.y + ") Module = " + this.module() ;
	}
	
	public double module()
	{
		return Math.sqrt(x*x + y*y);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Point [x=");
		builder.append(x);
		builder.append(", y=");
		builder.append(y);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(Point o) {
		
//		if(this.module() < o.module())
//			return -1 ; 
//		else
//			if(this.module() > o.module())
//				return +1 ;
//			else
//				return 0 ;
		
		return ((Double) this.module()).compareTo(o.module()) ; // la méthode compareTo existe dja pour les objet de 
												//Type Double, on caste donc le module en (Double) et on lui applique compareTo
	}
	
	
	
}
