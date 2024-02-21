import java.time.LocalDate;

public class Director extends Trabajador
{
	private String numeroTelfnDirector;
	private boolean estarReunido;
	private boolean fueraDeOficina;
	
	
	public Director(String nombre, LocalDate fechaNacimiento, String dNI, String direccion, String numeroSS,
			String email, Enumerado tipoDepartamento, double salario, boolean estaOficina, String numeroTelfnDirector) 
	{
		super(nombre, fechaNacimiento, dNI, direccion, numeroSS, email, tipoDepartamento, salario, estaOficina);
		this.numeroTelfnDirector = numeroTelfnDirector;
	}

	
	
	public String getNumeroTelfnDirector()
	{
		return numeroTelfnDirector;
	}

	public void setNumeroTelfnDirector(String numeroTelfnDirector) {
		this.numeroTelfnDirector = numeroTelfnDirector;
	}

	


	public boolean isEstarReunido()
	{
		return estarReunido;
	}

	public void setEstarReunido(boolean estarReunido)
	{
		this.estarReunido = estarReunido;
	}

	
	
	public boolean isFueraDeOficina() 
	{
		return fueraDeOficina;
	}

	public void setFueraDeOficina(boolean fueraDeOficina) 
	{
		this.fueraDeOficina = fueraDeOficina;
	}

	
	
	
	public String toString()
	{
		return super.toString() + ", numero de Telefono director=" + numeroTelfnDirector + "]";
	}
	
	
	
	
	
	
	
}//CLASE DIRECTOR
