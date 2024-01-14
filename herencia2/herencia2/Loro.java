package herencia2;

public class Loro extends Aves
{

	private String origen;
	private boolean habla ;
	
	
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
