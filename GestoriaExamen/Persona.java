import java.time.LocalDate;

public class Persona 
{

	private String nombre;
	private LocalDate fechaNacimiento;
	private String DNI;
	private String Direccion;
	
	
	public Persona(String nombre, LocalDate fechaNacimiento, String dNI, String direccion)
	{
	
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.DNI = dNI;
		this.Direccion = direccion;
	}


	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	

	public LocalDate getFechaNacimiento() 
	{
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) 
	{
		this.fechaNacimiento = fechaNacimiento;
	}


	
	public String getDNI() 
	{
		return DNI;
	}

	public void setDNI(String dNI)
	{
		DNI = dNI;
	}


	
	public String getDireccion()
	{
		return Direccion;
	}

	public void setDireccion(String direccion) 
	{
		Direccion = direccion;
	}


	@Override
	public String toString() 
	{
		return "Persona [nombre=" + nombre + ", fecha de Nacimiento=" + fechaNacimiento + ", DNI=" + DNI + ", Direccion="
				+ Direccion + "]";
	}
	
	
	
	
	
	
	
	
	
}//CLASE PERSONA
