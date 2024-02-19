package EJER6;

public class GatoExceptionA extends Exception 
{
    private String nombre;
    private int edad;
    
    public GatoExceptionA(String nombre) 
    {
        this.nombre = nombre;
    }

    public GatoExceptionA(int edad)
	{
		this.edad = edad;
	}
}
