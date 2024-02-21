import java.time.LocalDate;

public class Trabajador extends Persona
{

	
	private String numeroSS;
	private	String email;
	private Enumerado tipoDepartamento;
	private double salario;
	private boolean estaOficina = false;
	
	
	public Trabajador(String nombre, LocalDate fechaNacimiento, String dNI, String direccion, String numeroSS, String email,Enumerado tipoDepartamento, double salario, boolean estaOficina)
	{
		super(nombre, fechaNacimiento, dNI, direccion);
		this.numeroSS = numeroSS;
		this.email = email;
		this.tipoDepartamento = tipoDepartamento;
		this.salario = salario;
		this.estaOficina = estaOficina;
	}


	
	
	public String getNumeroSS() 
	{
		return numeroSS;
	}

	public void setNumeroSS(String numeroSS) 
	{
		this.numeroSS = numeroSS;
	}

	

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}


	
	public double getSalario()
	{
		return salario;
	}

	public void setSalario(double salario)
	{
		this.salario = salario;
	}


	
	public boolean isEstaOficina() 
	{
		return estaOficina;
	}

	public void setEstaOficina(boolean estaOficina) 
	{
		this.estaOficina = estaOficina;
	}

	
	public Enumerado getTipoDepartamento() 
	{
		return tipoDepartamento;
	}

	public void setTipoDepartamento(Enumerado tipoDepartamento)
	{
		this.tipoDepartamento = tipoDepartamento;
	}
	
	
	
	@Override
	public String toString()
	{
		return super.toString() + ", numeroSS=" + numeroSS + ", email=" + email + ", salario=" + salario + ", esta en la Oficina="
				+ estaOficina + "]";
	}






	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//CLASE TRABAJADOR
