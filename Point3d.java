package m2i.formation.java;

public class Point3d extends Point {
	


	//Attribut
	private int z;
	


	
	public Point3d(int x, int y, int z) {
		super(x, y) ; 									//super appel le constructeur de la classe point (super ne fait référence que à la classe mere 
														//et pas plus haut dans la hierarchie)
		this.z = z ;  
	}
	
	public void Initialise(int dx, int dy, int dz) { 	// surcharge de la méthode initialise de la classe point (meme nom mais signature dif)
		System.out.println("point 3d");
		super.Initialise(dx, dy); 						//super appel le initialise de la classe point => met dx et dy dans x et y
		this.z =dz;
	}

	@Override
	public String Affiche() { 							// redefinition de la méthode affiche et non une surcharge car meme nom et meme signature
		return "(" + x + "," + y + "," + z + ") Module = " + this.module();
	}

	@Override
	public double module() {
		return Math.sqrt(x*x + y*y + z*z);
	}

	@Override
	public String toString() {
		return "Point3d [x = " + x + " y = " + y + " z = " + z + " ]";
	}
	
	
	
	

}
