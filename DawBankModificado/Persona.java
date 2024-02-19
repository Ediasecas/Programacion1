import java.time.LocalDate;

public class Persona 
{
	protected String Nombre;
	protected String DNI;
	protected LocalDate Fecha;
	
	
	public Persona(String nombre, String dNI, LocalDate fecha) 
	{
		this.Nombre = nombre;
		this.DNI = dNI;
		this.Fecha = fecha;
	}


	
	
	public String getNombre() 
	{
		return Nombre;
	}


	public void setNombre(String nombre)
	{
		Nombre = nombre;
	}


	
	public String getDNI()
	{
		return DNI;
	}


	public void setDNI(String dNI) 
	{
		DNI = dNI;
	}


	
	public LocalDate getFecha()
	{
		return Fecha;
	}


	public void setFecha(LocalDate fecha) 
	{
		Fecha = fecha;
	}




	@Override
	public String toString() 
	{
		return "Persona [Nombre=" + Nombre + ", DNI=" + DNI + ", Fecha=" + Fecha + "]";
	}
	
	
	
	
	
	
}//clase Persona
