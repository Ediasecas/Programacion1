import java.util.LinkedList;

class Cliente extends Persona 
{
    private String numeroCliente;
    private String clasificacion;
    private Empleado asesorFinanciero;
    private LinkedList<CuentaCorriente> cuentasCorrientes;
    private LinkedList<Prestamo> prestamos;

    public Cliente(String nombre, String telefono, String email, String numeroCliente, String clasificacion) 
    {
        super(nombre, telefono, email);
        this.numeroCliente = numeroCliente;
        this.clasificacion = clasificacion;
    }
    

	public String getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(String numeroCliente) {
		this.numeroCliente = numeroCliente;
	}
	

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	
	public Empleado getAsesorFinanciero() {
		return asesorFinanciero;
	}

	public void setAsesorFinanciero(Empleado asesorFinanciero) {
		this.asesorFinanciero = asesorFinanciero;
	}
    
	
	public void añadirCuentaCorriente(CuentaCorriente cuenta)
	{
		
	}
	public void añadirPrestamo(Prestamo prestamo)
	{
		
	}
    
}
