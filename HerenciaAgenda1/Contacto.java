
public  class Contacto 
{

	private String nombre;
	private String numTelf;
	
	
	public Contacto(String nombre, String numTelf) 
	{
		
		this.nombre = nombre;
		this.numTelf = numTelf;
	}


	
	public String getNombre() 
	{
		return nombre;
	}


	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	

	public String getNumTelf()
	{
		return numTelf;
	}


	public void setNumTelf(String numTelf) 
	{
		this.numTelf = numTelf;
	}
	
	
	
	public String mostrarInfoContacto()
	{
		String info = "";
		info =  "Nombre de la mascota: " + this.nombre + ", " + "Numero telefono: " + this.numTelf ;
		return info;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}//clase Contacto
