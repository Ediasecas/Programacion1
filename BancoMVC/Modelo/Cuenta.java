package Modelo;


public class Cuenta {

	private String cod;
	private String nombreCuenta;
	private String numCuenta;
	private double saldo;
	
	public Cuenta(String cod, String nombreCuenta, String numCuenta, double saldo)
	{
		super();
		this.cod = cod;
		this.nombreCuenta = nombreCuenta;
		this.numCuenta = numCuenta;
		this.saldo = saldo;
	}

	
	public String getCod() 
	{
		return cod;
	}

	public void setCod(String cod) 
	{
		this.cod = cod;
	}

	
	public String getNombreCuenta() 
	{
		return nombreCuenta;
	}


	public void setNombreCuenta(String nombreCuenta) 
	{
		this.nombreCuenta = nombreCuenta;
	}

	
	public String getNumCuenta() 
	{
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) 
	{
		this.numCuenta = numCuenta;
	}
	

	public double getSaldo() 
	{
		return saldo;
	}

	public void setSaldo(double saldo) 
	{
		this.saldo = saldo;
	}


	
	@Override
	public String toString() 
	{
		return "Cuenta [cod=" + cod + ", nombreCuenta=" + nombreCuenta + ", numCuenta=" + numCuenta + ", saldo=" + saldo
				+ "]";
	}

}


