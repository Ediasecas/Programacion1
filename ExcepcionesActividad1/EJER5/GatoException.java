package EJER5;


public class GatoException extends Exception
{
	private String nombre;
	private int edad;
	
	public GatoException(String nombre)
	{
		this.nombre = nombre;
	}
	
	public GatoException(int edad)
	{
		this.edad = edad;
	}
}
