package m2i.formation.java;

import java.util.Comparator;

public class ComparateurEnX implements Comparator<Point> {

	@Override
	public int compare(Point o1, Point o2) {
		
		return ((Integer) o1.getX()).compareTo(o2.getX()); //doit caster le premier mais pas le deuxieme car il compart
				// un à un objet et cet donc en quoi il doit le convertire, on appele ça le boxing
	}

}
