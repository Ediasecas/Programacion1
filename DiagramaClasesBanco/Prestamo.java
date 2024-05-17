import java.time.LocalDate;

public class Prestamo 
{
	private double cantidad;
    private LocalDate fechaInicio;
    private int numeroPagosTotales;
    private int numeroPagosRealizados;
    
    
	public Prestamo(double cantidad, LocalDate fechaInicio, int numeroPagosTotales, int numeroPagosRealizados) 
	{
		super();
		this.cantidad = cantidad;
		this.fechaInicio = fechaInicio;
		this.numeroPagosTotales = numeroPagosTotales;
		this.numeroPagosRealizados = numeroPagosRealizados;
	}


	public double getCantidad() 
	{
		return cantidad;
	}

	public void setCantidad(double cantidad) 
	{
		this.cantidad = cantidad;
	}


	public LocalDate getFechaInicio()
	{
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio)
	{
		this.fechaInicio = fechaInicio;
	}


	public int getNumeroPagosTotales()
	{
		return numeroPagosTotales;
	}

	public void setNumeroPagosTotales(int numeroPagosTotales)
	{
		this.numeroPagosTotales = numeroPagosTotales;
	}


	public int getNumeroPagosRealizados() 
	{
		return numeroPagosRealizados;
	}

	public void setNumeroPagosRealizados(int numeroPagosRealizados) 
	{
		this.numeroPagosRealizados = numeroPagosRealizados;
	}
    
    
	public void realizarPago() 
	{ 
		
	}
}
