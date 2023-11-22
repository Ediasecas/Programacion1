package dawBank;



public class Movimiento
{

	private String ID;
	private String fecha;
	private String tipo;
	private double cantidad;
	
	
	public Movimiento(String ID, String fecha, String tipo, double cantidad)
	{
		this.ID = ID;
		this.fecha = fecha;
		this.tipo = tipo;
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

	public void setFecha(String Fecha)
	{
		this.fecha = fecha;
	}
	/*
	private boolean setFecha(String Fecha)
	{
		this.fecha = fecha;
		return true;

	}
	
	private boolean FechaValidacion(String fecha) 
	{
		boolean isFormatOk = false;
		LocalDateTime fechita = LocalDateTime.now();
		DateTimeFormatter formatfechita = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String fechaconsuformato = fechita.format(formatfechita);
		Pattern pattern = Pattern.compile(fechaconsuformato);
		Matcher matcher = pattern.matcher(fecha);
		
		if(matcher.matches())
		{
			this.fecha = fecha;
			isFormatOk = true;
		}
		
		return isFormatOk;
	}
	
	!Esta validacion escribirla en el main principal(en la cuenta bancaria)!
	*/
	
	public String getTipo() 
	{
		return tipo;
	}

	public void setTipo(String tipo) 
	{
		this.tipo = tipo;
	}
	

	
	public double getCantidad() 
	{
		return cantidad;
	}

	public void setCantidad(int cantidad) 
	{
		this.cantidad = cantidad;
	}

	
}
