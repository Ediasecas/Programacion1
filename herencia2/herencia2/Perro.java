package herencia2;

public class Perro extends Mascotas
{

	private String raza;
	private boolean pulgas;
	
	
	public Perro(String nombre, String edad, String estado, String fechNacimiento, String raza, boolean pulgas)
	{
		super(nombre, edad, estado, fechNacimiento);
		this.raza = raza;
		this.pulgas = pulgas;
	}


	public String getRaza()
	{
		return raza;
	}


	public void setRaza(String raza) 
	{
		this.raza = raza;
	}

	

	public boolean isPulgas() 
	{
		return pulgas;
	}


	public void setPulgas(boolean pulgas) 
	{
		this.pulgas = pulgas;
	}
	
	
	public String mostrarInfoMascota()
	{
		
		String info = super.mostrarInfoMascota();
		info += ", El perro es de raza: " + this.raza + ", " + "¿Tiene pulgas? " + this.pulgas;
		return info;
	}
	
	
	
	public String getTipoAnimal() 
	{
	   return "Perro";
	}
	
}
