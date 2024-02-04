package herencia2;

public class Canario extends Aves 
{
	
	private String color;
	private boolean canta ;
	
	
	/**Constructor de Canario Proveninente de "AVE" que a su vez es proveniente de "MASCOTAS"
	 * 
	 * @param nombre
	 * @param edad
	 * @param estado
	 * @param fechNacimiento
	 * @param pico
	 * @param vuela
	 * @param color constructor tipo String que nos indica el color del Canario.
	 * @param canta constructor de tipo boolean que nos indicará "true" si el Canario canta o "false" si no lo hace.
	 */
	public Canario(String nombre, String edad, String estado, String fechNacimiento, String pico, boolean vuela,
			String color, boolean canta) 
	{
		super(nombre, edad, estado, fechNacimiento, pico, vuela);
		this.color = color;
		this.canta = canta;
	}


	public String getColor() 
	{
		return color;
	}

	
	public void setColor(String color) 
	{
		this.color = color;
	}



	public boolean isCanta() 
	{
		return canta;
	}


	public void setCanta(boolean canta) 
	{
		this.canta = canta;
	}

	/**
	 * Metodo para mostrar info de la mascota(en este caso Canario), debido a la herencia se usara el mismo metodo que en "MASCOTAS" pero anadiendo en este caso la informacion de esta clase  "color" y "canta" 
	 */
	
	public String mostrarInfoMascota()
	{
		
		String info = super.mostrarInfoMascota();
		info += ", Es de color " + this.color +", " + "¿Canta? " + this.canta;
		return info;
	}
	
	
	public String getTipoAnimal() 
	{
	   return "Canario";
	}
	
	
	
	
	
}//clase Canario
