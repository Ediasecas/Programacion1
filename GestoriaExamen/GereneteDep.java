import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class GereneteDep extends Trabajador
{

	private int numeroTrabajadores;
	private String numeroTelefono;
	private List<Trabajador> trabajadores;
	private List<GereneteDep> gerentesdep;

	
	public GereneteDep(String nombre, LocalDate fechaNacimiento, String dNI, String direccion, String numeroSS,
			String email, double salario, boolean estaOficina, Enumerado tipoDepartamento, String numeroTelefono) 
	{
		super(nombre, fechaNacimiento, dNI, direccion, numeroSS, email, tipoDepartamento, salario, estaOficina);
		this.numeroTelefono = numeroTelefono;
		this.trabajadores = new LinkedList<>();
		this.gerentesdep = new LinkedList<>();
	}

	
	public int getNumeroTrabajadores() 
	{
		return numeroTrabajadores;
	}

	public void setNumeroTrabajadores(int numeroTrabajadores) 
	{
		this.numeroTrabajadores = numeroTrabajadores;
	}


	
	public String getNumeroTelefono()
	{
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) 
	{
		this.numeroTelefono = numeroTelefono;
	}


	
	public List<Trabajador> getTrabajadores() 
	{
		return trabajadores;
	}

	public void setTrabajadores(List<Trabajador> trabajadores) 
	{
		this.trabajadores = trabajadores;
	}


	
	public List<GereneteDep> getGerentesdep() 
	{
		return gerentesdep;
	}

	public void setGerentesdep(List<GereneteDep> gerentesdep) 
	{
		this.gerentesdep = gerentesdep;
	}


	
	
      
	
	
	
	
	
	
	@Override
	public String toString()
	{
		return super.toString() + ", numero de Telefonoi=" + numeroTelefono + "]";
	}
	
	
	
	
	
	
	
	
	
	
}//CLASE GERENTEDEP
