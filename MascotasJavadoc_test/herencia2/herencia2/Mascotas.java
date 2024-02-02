package herencia2;

public abstract class Mascotas {

	
	
	private String nombre;
	private String edad;
	private String estado;
	private String fechNacimiento;
	
	/**  Constructor de Mascotas del cual herederan todas las demas clases
	 * 
	 * @param nombre Parametro tipo String que nos indica el nombre de la mascota
	 * @param edad Parametro tipo String que nos indica la edad de la mascota
	 * @param estado Parametro tipo String que nos indica el estado de la mascota
	 * @param fechNacimiento Parametro tipo String que nos indica la fecha de nacimiento de la mascota
	 */
	public Mascotas(String nombre, String edad, String estado, String fechNacimiento) 
	{
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.estado = estado;
		this.fechNacimiento = fechNacimiento;
	}

	
	public String getNombre() {
		return nombre;
	}

	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getEdad() {
		return edad;
	}


	public void setEdad(String edad) {
		this.edad = edad;
	}



	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	
	public String getFechNacimiento() {
		return fechNacimiento;
	}


	public void setFechNacimiento(String fechNacimiento) {
		this.fechNacimiento = fechNacimiento;
	}


	/**
	 * Metodo para mostrar informacion de Mascota la cual sera utilizada por las demas clases, este metodo nos indicara el nombre,edad,estado y fecha de nacimiento de la mascota
	 * 
	 */
	public String mostrarInfoMascota()
	{
		String info = "";
		info =  "Nombre de la mascota: " + this.nombre + ", " + "Edad: " + this.edad + "años, " + "Estado: " + this.estado +", "+ "Fecha de nacimiento: " + this.fechNacimiento ;
		return info;
	}
	
	
	public abstract String getTipoAnimal();//para pooder pedir el tipo de animal en perro gato loro canario

	    
	
	
}//clase mascota
