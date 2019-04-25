package m2i.formation.java;

import java.util.Comparator;

public class ComparateurEnY implements Comparator<Point> {

	@Override
	public int compare(Point o1, Point o2) {
		return ((Integer) o1.getY()).compareTo(o2.getY());
	}

}
