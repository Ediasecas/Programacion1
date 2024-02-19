import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) 
	{
	
		ArrayList<Producto> products = new ArrayList<Producto>();
		
		
		products.add(new Producto("Estuche",54));
		products.add(new Producto("Ratón ",21));
		products.add(new Producto("Monitor",64));
		products.add(new Producto("Movil",21));
		products.add(new Producto("Proyector",18));
		
		
		
		for(int i = 0; i < products.size(); i++) 
		{
			System.out.println(products.get(i).toString());
		}
		
		
		
		Iterator<Producto> itera = products.iterator();
		Producto products1;
		while (itera.hasNext()) 
		{
			products1 = itera.next();
			if(products1.getNombre().equals(nombre))
			{
				itera.remove();
			}
			
			System.out.println(products1.toString());
		}
		
		
		
		
		int posEliminar = -1;	
		Producto pEliminar = null;
		
			for(Producto p : products)
				{
					if(p.getNombre().equals("72000031-A"))
					{
						posEliminar = products.indexOf(p);
						pEliminar = p;
					}
					else {
						System.out.println(p.toString());
					}
				}
				
				products.remove(pEliminar);
		
		
	}//

}//Clase 
