package herencia2;

public class Gato extends Mascotas
{

	private String color;
	private boolean peloLargo;
	
	
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
