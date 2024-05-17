import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;


public class Exposicion 
{
	private String nombreE;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private List<Cuadro> listaCuadrosExps = new LinkedList<>();
	private List<Autor> listaAutores = new LinkedList<>();

	
	public Exposicion(String nombreE, LocalDate fechaInicio, LocalDate fechaFin, List<Cuadro> listaCuadrosExps)
	{
		super();
		this.nombreE = nombreE;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}


	public String getNombreE() 
	{
		return nombreE;
	}


	public void setNombreE(String nombreE) 
	{
		this.nombreE = nombreE;
	}


	public LocalDate getFechaInicio() 
	{
		return fechaInicio;
	}


	public void setFechaInicio(LocalDate fechaInicio)
	{
		this.fechaInicio = fechaInicio;
	}


	public LocalDate getFechaFin() 
	{
		return fechaFin;
	}


	public void setFechaFin(LocalDate fechaFin) 
	{
		this.fechaFin = fechaFin;
	}


	@Override
	public String toString() 
	{
		return "Exposicion [nombreE=" + nombreE + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + "]";
	}

	
	
	public void añadirCuadro(Cuadro c) 
	{
		
	}
	
	public boolean quitarCuadro() 
	{
		return false;
	}
	
	public boolean cambiarFechaInicio() 
	{
		return false;
	}
	
	public boolean cambiarFechaFin() 
	{
		return false;
	}
}
