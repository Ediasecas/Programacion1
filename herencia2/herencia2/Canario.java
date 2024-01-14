package herencia2;

public class Canario extends Aves 
{
	
	private String color;
	private boolean canta ;
	
	
	
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
