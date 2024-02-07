import java.time.LocalDate;

public class Cliente extends Persona
{

	private String numeroTelefono;
	private String email;
	private String direccion;
	
	public Cliente(String nombre, String dNI, LocalDate fecha, String numeroTelefono, String email, String direccion)
	{
		super(nombre, dNI, fecha);
		this.numeroTelefono = numeroTelefono;
		this.email = email;
		this.direccion = direccion;
	}

	
	
	public String getNumeroTelefono() 
	{
		return numeroTelefono;
	}

	
	public void setNumeroTelefono(String numeroTelefono) 
	{
		this.numeroTelefono = numeroTelefono;
	}

	
	
	public String getEmail() 
	{
		return email;
	}

	
	public void setEmail(String email)
	{
		this.email = email;
	}


	
	public String getDireccion() 
	{
		return direccion;
	}

	
	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
	}



	@Override
	public String toString()
	{
		return "Cliente [Nombre=" + Nombre + ", DNI=" + DNI + ", Fecha=" + Fecha + " numeroTelefono=" + numeroTelefono + ", email=" + email + ", direccion=" + direccion + "]";
	}

	
	
	
}//clase Cliente
