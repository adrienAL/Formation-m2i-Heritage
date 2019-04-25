package zo;

import m2i.formation.java.Forme;
import m2i.formation.java.Genre;
import m2i.formation.java.Point;
import m2i.formation.java.Point3d;

public class Principale {

	public static void main(String[] args) {
		
		Point3d p = new Point3d(1,6,99);
		Point3d p1 = new Point3d(7,0,1);
		Point p2 = new Point(0,9);
		Point3d p3 = new Point3d(2,0,3);
		Point p4 = new Point(13,2);
		Point3d p5 = new Point3d(48,44,5);
		
		
		Forme f = new Forme();
		
		f.addPoint(p3);
		f.addPoint(p5);
		f.addPoint(p2);
		f.addPoint(p);
		f.addPoint(p4);
		f.addPoint(p1);
		
		f.affiche();
		f.triSimple2();
		System.out.println("\napres tri par module");
		f.affiche();
		
		Genre sexe = Genre.Masculin;
		
	}

}
