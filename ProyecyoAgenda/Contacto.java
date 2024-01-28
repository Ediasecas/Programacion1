
public class Contacto
{

	private String nombre;
	private String telefono;
	private String correoElectronico;
	
	
	public Contacto(String nombre, String telefono, String correoElectronico) 
	{
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.correoElectronico = correoElectronico;
	}


	public String getNombre() 
	{
		return nombre;
	}


	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}


	
	public String getTelefono() 
	{
		return telefono;
	}


	public void setTelefono(String telefono) 
	{
		this.telefono = telefono;
	}


	
	public String getCorreoElectronico()
	{
		return correoElectronico;
	}


	public void setCorreoElectronico(String correoElectronico) 
	{
		this.correoElectronico = correoElectronico;
	}
	
	
	
	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", telefono=" + telefono + ", correoElectronico=" + correoElectronico
				+ "]";
	}
	
	
	
	
	
	
	
	
	
}//clase contacto
