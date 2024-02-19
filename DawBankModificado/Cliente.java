import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona
{

	private String numeroTelefono;
	private String email;
	private String direccion;
	private List<CuentaBancaria> cuentasBancarias;
	private int idCliente;
	private static int contadorClientes = 0;
	
	public Cliente(String nombre, String dNI, LocalDate fecha, String numeroTelefono, String email, String direccion)
	{
		super(nombre, dNI, fecha);
		this.numeroTelefono = numeroTelefono;
		this.email = email;
		this.direccion = direccion;
		this.cuentasBancarias = new ArrayList<>();
		this.idCliente = ++contadorClientes;
	}

	
	
	public String getNumeroTelefono() 
	{
		return numeroTelefono;
	}

	
	public void setNumeroTelefono(String numeroTelefono) 
	{
		this.numeroTelefono = numeroTelefono;
	}

	
	
	public String getEmail() 
	{
		return email;
	}

	
	public void setEmail(String email)
	{
		this.email = email;
	}


	
	public String getDireccion() 
	{
		return direccion;
	}

	
	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
	}


	public List<CuentaBancaria> getCuentasBancarias() //Devuelve la lista de cuentas bancarias asociadas al cliente, nos da todas las cuentas bancarias qye tiene un cliente
	{
        return cuentasBancarias;
    }

    public void setCuentasBancarias(List<CuentaBancaria> cuentasBancarias) 
    {
        this.cuentasBancarias = cuentasBancarias;
    }
    
    
    public void agregarCuentaBancaria(CuentaBancaria cuenta) //metodo para añadir una cuenta bancaria  a la lista de cuentas del cliente
    {
        cuentasBancarias.add(cuenta);
    }
    
    
	@Override
	public String toString()
	{
		return "Cliente [Nombre=" + Nombre + ", DNI=" + DNI + ", Fecha=" + Fecha + " numeroTelefono=" + numeroTelefono + ", email=" + email + ", direccion=" + direccion + "]";
	 } 

	
	public void mostrarDatosCliente() 
	{
		
	    System.out.println("Nombre: " + this.getNombre());
	    System.out.println("DNI: " + this.getDNI());
	    System.out.println("Fecha de nacimiento: " + this.getFecha());
	    System.out.println("Número de teléfono: " + this.getNumeroTelefono());
	    System.out.println("Email: " + this.getEmail());
	    System.out.println("Dirección: " + this.getDireccion());
	}
	
	public int getCantidadCuentasBancarias() //metodo para saber cuantas cuentas tiene un cliente
	{
	    return cuentasBancarias.size();
	}



	public int getIdCliente() 
	{
		return idCliente;
	}



	public void setIdCliente(int idCliente) 
	{
		this.idCliente = idCliente;
	}
	
	
	
}//clase Cliente
