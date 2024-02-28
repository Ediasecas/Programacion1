
public class Producto 
{
	private String codigo;
	private String nombre;
	private int cantiddad;
	private double precio;
	
	public Producto(String codigo, String nombre, int cantiddad, double precio) 
	{
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.cantiddad = cantiddad;
		this.precio = precio;
	}
	
	

	public String getCodigo() 
	{
		return codigo;
	}

	
	public void setCodigo(String codigo) 
	{
		this.codigo = codigo;
	}

	
	
	public String getNombre() 
	{
		return nombre;
	}

	
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	
	
	public int getCantiddad()
	{
		return cantiddad;
	}

	
	public void setCantiddad(int cantiddad)
	{
		this.cantiddad = cantiddad;
	}

	
	
	public double getPrecio() 
	{
		return precio;
	}

	
	public void setPrecio(double precio) 
	{
		this.precio = precio;
	}



	@Override
	public String toString()
	{
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", cantiddad=" + cantiddad + ", precio=" + precio
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
