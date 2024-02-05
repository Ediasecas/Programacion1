package EJER5;


public class Gato 
{
	private String nombre;
	private int edad;
	
	
	public String getNombre() 
	{
		return nombre;
	}
	
	public void setNombre(String nombre) throws GatoException
	{
		if(nombre.length() >= 3)
		{
			this.nombre = nombre;
		}
		
		else
		{
			throw new GatoException(nombre);
		}
	}
	
	
	
	public int getEdad() 
	{
		return edad;
	}
	
	public void setEdad(int edad) throws GatoException
	{
		if(edad > 0) 
		{
		this.edad = edad;
		}
		
		else
		{
			throw new GatoException(edad);
		}
	}

	public Gato(String nombre, int edad) 
	{
		super();
		this.nombre = nombre;
		this.edad = edad;
	}	
	
	
	
	

}//Gato
