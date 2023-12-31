package dawBank;



public class Movimiento
{

	private String ID;
	private String fecha;
	private String tipoMovimiento;
	private double cantidad;
	
	
	public Movimiento(String ID, String fecha, String tipo, double cantidad)
	{
		this.ID = ID;
		this.fecha = fecha;
		this.tipoMovimiento = tipo;
		this.cantidad = cantidad;
	}

	public String getID() 
	{
		return this.ID;
	}

	public void setID(String ID)
	{
		this.ID=ID;
	}
	

	
	public String getFecha()
	{
		return fecha;
	}

	private void setFecha(String Fecha)
	{
		this.fecha = fecha;
	}
	
	
	public String getTipoMovimiento() 
	{
		return tipoMovimiento;
	}

	private void setTipoMovimiento(String tipo) 
	{
		this.tipoMovimiento = tipo;
	}
	

	
	public double getCantidad() 
	{
		return cantidad;
	}

	public void setCantidad(double cantidad) 
	{
		this.cantidad = cantidad;
	}
	
	public String mostrarInfoMovimiento()
	{
		String datosmov;
		datosmov = ( this.fecha + ", " + this.tipoMovimiento + ", " + this.cantidad);
		System.out.println("Sus movimientos recientes son: " + datosmov);
		
		return datosmov;
	}
	
	

	
}
