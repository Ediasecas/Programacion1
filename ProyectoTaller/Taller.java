import java.util.Map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set; 

public class Taller 
{
	
	private Coche[] cochestaller;
	private int cochesRegistrados;
	private int numMaxContactos;
	
	
	 public Taller() 
	 {
	        this.parejas = new HashMap<String,Coche>();
	 }

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


	public int getNumMaxContactos() 
	{
		return numMaxContactos;
	}


	public void setNumMaxContactos(int numMaxContactos) 
	{
		this.numMaxContactos = numMaxContactos;
	}

	

	Map<String,Coche> parejas;
	
	 
	public boolean anadirCoche(String matricula, Coche coche)  //metodo añadir Coche
	{
        
        if (!parejas.containsKey(matricula)) 
        {
            parejas.put(matricula, coche);
            return true; 
        }
        
        else 
        {
            return false; 
        }
    }
	
	
	
	public boolean eliminarCoche(String matricula) //metodo eliminar Coche
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
	
	
	
	public void MostrarMatriculas()  //metodo Mostrar Matricula
	{
		System.out.println("Visualización de Matriculas:");
		Set <String> claves = parejas.keySet();
		for (String matricula : claves) 
		{
			System.out.println(matricula);
		}
	}

	
	
	public void MostrarCoche() //metodo Mostrar Coche
	{
		 System.out.println("Visualización de Coches:");
		Collection<Coche> coches = parejas.values();
		for (Coche coche : coches) 
		{
			System.out.println("Color: " + coche.getColor() + ", Marca: " + coche.getMarca());
		}
	}
	
	
	
	public void MostrarTaller() //metodo Mostrar Taller
	{
        System.out.println("Visualización del Taller:");
        for (Map.Entry<String, Coche> entry : parejas.entrySet()) 
        {
            String matricula = entry.getKey();
            Coche coche = entry.getValue();
            System.out.println(" COCHES;\n Matrícula: " + matricula + ", Color: " + coche.getColor() + ", Marca: " + coche.getMarca());
        }
    }
	
	
	
}//clase Taller
