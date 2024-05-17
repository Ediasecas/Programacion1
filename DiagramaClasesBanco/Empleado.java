
public class Empleado extends Persona
{
	 private double sueldo;
	 private int añosExperiencia;

	 public Empleado(String nombre, String telefono, String email, double sueldo, int añosExperiencia) 
	 {
	        super(nombre, telefono, email);
	        this.sueldo = sueldo;
	        this.añosExperiencia = añosExperiencia;
	 }

	public double getSueldo()
	{
		return sueldo;
	}

	public void setSueldo(double sueldo) 
	{
		this.sueldo = sueldo;
	}

	
	public int getAñosExperiencia() 
	{
		return añosExperiencia;
	}

	public void setAñosExperiencia(int añosExperiencia)
	{
		this.añosExperiencia = añosExperiencia;
	}

	@Override
	public String toString() {
		return "Empleado [sueldo=" + sueldo + ", añosExperiencia=" + añosExperiencia + "]";
	}
	
	 
}
