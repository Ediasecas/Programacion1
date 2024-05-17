import java.util.LinkedList;
import java.util.List;

public class Museo
{
	private String nombre;
	private String direccion;
	private String email;
	private String numTelefono;
	private List<Exposicion> listaExpos = new LinkedList<>();

	
	public Museo(String nombre, String direccion, String email, String numTelefono) 
	{
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.email = email;
		this.numTelefono = numTelefono;
	}

	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public String getDireccion()
	{
		return direccion;
	}

	public void setDireccion(String direccion) 
	{
		this.direccion = direccion;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public String getNumTelefono() 
	{
		return numTelefono;
	}

	public void setNumTelefono(String numTelefono) 
	{
		this.numTelefono = numTelefono;
	}

	
	@Override
	public String toString() 
	{
		return "Museo [nombre=" + nombre + ", direccion=" + direccion + ", email=" + email + ", numTelefono="
				+ numTelefono + "]";
	}
	
	
	
	
	
}
