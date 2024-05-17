
public class CuentaCorriente 
{
	private String numeroCuenta;
    private double saldo;
    
	public CuentaCorriente(String numeroCuenta, double saldo) 
	{
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}

	public String getNumeroCuenta() 
	{
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) 
	{
		this.numeroCuenta = numeroCuenta;
	}

	
	public double getSaldo() 
	{
		return saldo;
	}

	public void setSaldo(double saldo) 
	{
		this.saldo = saldo;
	}
	
	
	public void añadirSaldo(double cantidad) 
	{
		
	}
	
	
    public void quitarSaldo(double cantidad) 
    {
    	
    }
    
}
