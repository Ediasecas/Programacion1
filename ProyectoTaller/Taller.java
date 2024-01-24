import java.util.Map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set; 

public class Taller 
{
	
	private Coche[] cochestaller;
	private int cochesRegistrados;
	private int numMaxContactos;
	
	
	

	public Coche[] getCochestaller() 
	{
		return cochestaller;
	}


	public void setCochestaller(Coche[] cochestaller) 
	{
		this.cochestaller = cochestaller;
	}


	public int getCochesRegistrados() 
	{
		return cochesRegistrados;
	}


	public void setCochesRegistrados(int cochesRegistrados) 
	{
		this.cochesRegistrados = cochesRegistrados;
	}


	public int getNumMaxContactos() {
		return numMaxContactos;
	}


	public void setNumMaxContactos(int numMaxContactos) 
	{
		this.numMaxContactos = numMaxContactos;
	}

	

	Map<String,Coche> parejas = new HashMap<String,Coche>();
	 
	
	public boolean eliminarCoche(String matricula)
	{
		if(matricula != null)
		{
			parejas.remove(matricula);
		}
		
		else
		{
			System.out.println("Esta matricula no se encuentra en el taller");
		}
		
		return false;
	}
	
	public void MostrarMatriculas() 
	{
		Set <String> claves = parejas.keySet();
		for (String key : claves) 
		{
			System.out.println(key + " - " + parejas.get(key));
		}
	}

	
	
	public void MostrarCoche()
	{
		Collection<Coche> claves1 = parejas.values();
		for (Coche values : claves1) 
		{
			System.out.println( values + " - " + parejas.get(values));
		}
	}
	
	
	public void MostrarTaller()
	{
		
	}
	
	
	
}//clase Taller
