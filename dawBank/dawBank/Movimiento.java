package dawBank;

public class Movimiento
{

	private String ID;
	private String fecha;
	private String tipo;
	private int cantidad;
	
	
	public Movimiento(String ID, String fecha, String tipo, int cantidad)
	{
		this.ID = ID;
		this.fecha = fecha;
		this.tipo = tipo;
		this.cantidad = cantidad;
		
	}

	public Movimiento()
	{
		
	}
	
}
