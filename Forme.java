package m2i.formation.java;

import java.util.ArrayList;
import java.util.Comparator;

public class Forme 
{
	//Attributs
	private ArrayList<Point> lstPoint =new ArrayList<>();
	
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Forme [lstPoint=");
		builder.append(lstPoint);
		builder.append("]");
		return builder.toString();
	}


	//Méthode
	public void affiche()
	{
		System.out.println("liste de point");
		for(int i = 0 ; i<this.lstPoint.size() ; i++)
		{
			System.out.println(this.lstPoint.get(i).Affiche());
		}
	}
	
	// permet d'ajouter un point dans la list des attribut de cette classe
	public void addPoint(Point P)
	{
		this.lstPoint.add(P);
	}
	
	public Point mini()
	{
		if (lstPoint.size() == 0)
			return null;
		
		int pos = 0;
		
		for(int i = 1 ; i < this.lstPoint.size() ; i ++)
		{
			if( this.lstPoint.get(i).module() < this.lstPoint.get(pos).module() )
			{
				pos = i;
			}
		}
		return this.lstPoint.get(pos);
	}
	
	
	
	
	public int indice_min( int debut )
	{
		if (lstPoint.size() == 0)
			return -1;
		if (debut >= lstPoint.size())
			return -1;
		
		int pos = debut;
		
		
		for(int i = debut + 1 ; i < this.lstPoint.size() ; i ++)
		{
			if( this.lstPoint.get(i).module() < this.lstPoint.get(pos).module() )
			{
				pos = i;
			}
		}
		return pos;
	}
	
	
	// fonction qui permute deux valeur de lstPoint
	public void permuter(int a, int b)
	{
		if ( (a >= 0) && (a<lstPoint.size()) && (b >= 0) && (b<lstPoint.size()) ) 
		{
			Point pTemp = lstPoint.get(a);
		
			lstPoint.set(a, lstPoint.get(b));
			lstPoint.set(b, pTemp);
		}
	}
	
	
	//
	public void tri()
	{
		for( int i = 0 ; i<this.lstPoint.size() ; i++)
		{
			permuter(indice_min(i), i);
		}
	}
	
	public void triSimple()
	{
		lstPoint.sort(new ComparateurEnY()); 
		// permet de trier une ArrayList mais que de type principale il faut donc implémenté la 
		//méthode Point avec l'interface comparable utilisé par sort pour comparer affin que celle ci sache comment comparer 
		//deux point (voir point.java)
		//si la valeur dans sort est null alors on utilise la méthode par defaut dans Point, il faut definir le moyen de 
		//comparer en retournant -1 si le 1er élément est sup, + 1 si il est sup et 0 si ils sont égaux
		//sinon on peut utiliser une class que l'on a deffini nous meme, exemple ComparateurEnX
	}
	
	public void triSimple2()
	{
		lstPoint.sort(new Comparator<Point>() {
			@Override
			public int compare(Point o1, Point o2) {
				return((Integer) o1.getY()).compareTo(o2.getY());
			}
		}
		); // on est pas obligé de creer une nouvelle classe si on veux l'utiliser une seul fois, on peut directe le 
			// mettre ici
	}
	
	public void triSimple3()
	{
		lstPoint.sort((Point o1, Point o2) ->
									((Integer) o1.getY()).compareTo(o2.getY())
		);
	}
  }
