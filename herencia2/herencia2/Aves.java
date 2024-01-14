package herencia2;

public abstract class Aves extends Mascotas{

	private String pico;
	private boolean vuela;
	
	public Aves(String nombre, String edad, String estado, String fechNacimiento,String pico, boolean vuela) 
	{
		super(nombre, edad, estado, fechNacimiento);
		this.pico = pico;
		this.vuela = vuela;
	}

	public String getPico() {
		return pico;
	}

	public void setPico(String pico) {
		this.pico = pico;
	}

	public boolean isVuela() {
		return vuela;
	}

	public void setVuela(boolean vuela) {
		this.vuela = vuela;
	}

	
	public String mostrarInfoMascota()
	{
		
		String info = super.mostrarInfoMascota();
		info += ", Tiene un pico: " + this.pico + ", " + "¿Vuela? " + this.pico;
		return info;
	}

}
