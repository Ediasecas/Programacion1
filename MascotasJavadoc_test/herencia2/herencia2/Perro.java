package herencia2;

public class Perro extends Mascotas
{

	private String raza;
	private boolean pulgas;
	
	/**Constructor de Perro que proviene de la clase Mascotas
	 * 
	 * @param nombre
	 * @param edad
	 * @param estado
	 * @param fechNacimiento
	 * @param raza paraemtro de tipo String que nos indicara la raza del Perro
	 * @param pulgas parametro de tipo boolean que nos indicara "true" si el perro tiene pulgas o "false" si no tiene
	 */
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
	
	
	/**
	 * 
	 * Metodo para mostrar info de la mascota(en este caso Perro), debido a la herencia se usara el mismo metodo que en "MASCOTAS" pero anadiendo en este caso la informacion de esta clase  "raza" y "pulgas" 
	 */
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
