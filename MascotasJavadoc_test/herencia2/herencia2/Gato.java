package herencia2;

public class Gato extends Mascotas
{

	private String color;
	private boolean peloLargo;
	
	/**Constructor de Gato proveniente de Mascotas 
	 * 
	 * @param nombre
	 * @param edad
	 * @param estado
	 * @param fechNacimiento
	 * @param color parametro de tipo String que nos indicara el color del Gato
	 * @param peloLargo parametro de tipo String que nos indicara "true" si el Gato tiene el pelo largo o "false" si no lo tiene
	 */
	public Gato(String nombre, String edad, String estado, String fechNacimiento, String color, boolean peloLargo) 
	{
		super(nombre, edad, estado, fechNacimiento);
		this.color = color;
		this.peloLargo = peloLargo;
	}


	public String getColor() 
	{
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	
	public boolean isPeloLargo() 
	{
		return peloLargo;
	}


	public void setPeloLargo(boolean peloLargo)
	{
		this.peloLargo = peloLargo;
	}
	
	
	/**
	 * Metodo para mostrar info de la mascota(en este caso Gato), debido a la herencia se usara el mismo metodo que en "MASCOTAS" pero anadiendo en este caso la informacion de esta clase  "color" y "peloLargo"
	 */
	public String mostrarInfoMascota()
	{
		
		String info = super.mostrarInfoMascota();
		info += ", El gato es de color : " + this.color + ", " + "¿Tiene el pelo largo? " + this.peloLargo;
		return info;
	}
	
	
	
	public String getTipoAnimal() 
	{
	   return "Gato";
	}
	
	
	
	
	
	
}//Clase Gato
