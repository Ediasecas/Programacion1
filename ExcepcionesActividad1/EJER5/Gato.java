package EJER5;


public class Gato 
{
	private String nombre;
	private int edad;
	
	
	 public Gato(String nombre, int edad) throws GatoException
	 {
	     this.setNombre(nombre);
	     this.setEdad(edad);
	 }
	 
	
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

	
	public void imprimirDatosGato() 
	{
        System.out.println("Nombre del gato: " + this.nombre);
        System.out.println("Edad del gato: " + this.edad);
    }
	

	
	
	
	

}//Gato
