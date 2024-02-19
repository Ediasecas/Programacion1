package herencia2;

public abstract class Aves extends Mascotas{

	private String pico;
	private boolean vuela;
	
	/**Constructor de  "AVE"  proveniente de "MASCOTAS"
	 * 
	 * @param nombre
	 * @param edad
	 * @param estado
	 * @param fechNacimiento
	 * @param pico parametro de tipo String que nos indicara el pico que tiene el AVE
	 * @param vuela parametro de tipo boolean que nos indicara "true" si el AVE vuela o "false" si no lo hace
	 */
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

	
	/**
	 * Metodo para mostrar info de la mascota(en este caso AVE), debido a la herencia se usara el mismo metodo que en "MASCOTAS" pero anadiendo en este caso la informacion de esta clase  "pico" y "vuela" 
	 */
	public String mostrarInfoMascota()
	{
		
		String info = super.mostrarInfoMascota();
		info += ", Tiene un pico: " + this.pico + ", " + "¿Vuela? " + this.pico;
		return info;
	}
//al ser clase abstracta no esta obligado a implementar a repetir los metodos del paddre(MASCOTAS) solo los propios 
}
