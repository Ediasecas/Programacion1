package herencia2;

public class Loro extends Aves
{

	private String origen; 
	private boolean habla ;

	
	
	/** Constructor de Loro Proveninente de "AVE" que a su vez es proveniente de "MASCOTAS"
	 * 
	 * @param nombre 
	 * @param edad
	 * @param estado
	 * @param fechNacimiento
	 * @param pico
	 * @param vuela
	 * @param origen Parametro de tipo String que nos indica el origen del Loro
	 * @param habla Parameto de tipo boolean que nos indica "true" si habla el loro, o "false" si no lo hace.
	 */
	public Loro(String nombre, String edad, String estado, String fechNacimiento, String pico, boolean vuela, String origen, boolean habla)
	
	{
		super(nombre, edad, estado, fechNacimiento, pico, vuela);
		this.origen = origen;
		this.habla = habla;
	} 


	public String getOrigen()
	{
		return origen;
	}


	public void setOrigen(String origen) 
	{
		this.origen = origen;
	}

	

	public boolean ishabla() 
	{
		return habla;
	}


	public void sethabla(boolean habla) 
	{
		this.habla = habla;
	}

	
	/**
	 * Metodo para mostrar info de la mascota(en este caso Loro), debido a la herencia se usara el mismo metodo que en "MASCOTAS" pero anadiendo en este caso la informacion de esta clase  "origen" y "habla" 
	 */
	public String mostrarInfoMascota()
	{
		
		String info = super.mostrarInfoMascota();
		info += ", Es de origen " + this.origen +", " + "¿Habla? " + this.habla;
		return info;
	}
	
	public String getTipoAnimal() 
	{
	   return "Loro";
	}
	
}//public class Loro
