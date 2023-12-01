package dawBank;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CuentaBancaria
{
	private String IBAN;
	private String titular;
	private double saldo;
	private int movimientos;
	double dineroIngresado;
	double dineroRetirado;
	
	private String ID;
	private String fecha;
	private String tipoMovimiento;
	private double cantidad;
	
	private int numMaxMovimientos = 100;
	private Movimiento[] Movimientoarray;
	
	private int numMovimActuales = 0;
	
	
	public CuentaBancaria(String IBAN, String titular)
	{
		this.IBAN = IBAN;
		this.titular = titular;
		this.Movimientoarray = new Movimiento [100];
		
	}
	
	
	public String getIBAN() 
	{
		return IBAN;
	}
	
	
    private void setIBAN(String iBAN) 
    {
		this.IBAN = iBAN;

	}
    
   
    public boolean validacionIBAN()
    {
    	Boolean isFormatOk = false;
		String formato = ("[A-Z]{2}[0-9]{22}");
		Pattern pattern = Pattern.compile(formato);
		Matcher matcher = pattern.matcher(IBAN);
		if(matcher.matches())
		{
			this.IBAN = IBAN;
			isFormatOk = true;
		}

		return isFormatOk;
    }
    /**Pattern formato = Pattern.compile("[A-Z]{2}[0-9]{22}"); //ES1234567891234567890000 EJEMPLO IBAN
        formato.matcher(IBAN);
        Matcher matcher = formato.matcher(IBAN);
        */
    
	
	
    
	public String getTitular() 
	{
		return titular;
	}
	
	
	public void setTitular(String titular) 
	{
		this.titular = titular;
	}
	
	
   /* public boolean validacionTitular()
    {
    	Boolean isFormatOk = false;
		String formato = ("^([A-Za-zÑñÁáÉéÍíÓóÚú]+['\\-]{0,1}[A-Za-zÑñÁáÉéÍíÓóÚú]+)(\\s+([A-Za-zÑñÁáÉéÍíÓóÚú]+['\\-]{0,1}[A-Za-zÑñÁáÉéÍíÓóÚú]+))*$");
		Pattern pattern = Pattern.compile(formato);
		Matcher matcher = pattern.matcher(titular);
		if(matcher.matches())
		{
			this.titular = titular;
			isFormatOk = true;
		}

		return isFormatOk;
    }
    */
    
	
	public double getSaldo() 
	{
		return saldo;
	}
	
	
	public void setSaldo(double saldo)
	{
		this.saldo = saldo;
	}
	
	
	
	public int getMovimientos() 
	{
		return movimientos;
	}
	
	
	public void setMovimientos(int movimientos) 
	{
		this.movimientos = movimientos;
	}
	
	
	
	public double ingreso()
	{ 
			if (dineroIngresado > 0)
			{
				saldo = (dineroIngresado + saldo);
				System.out.println("Usted ha ingresado la cantidad de " + dineroIngresado +"€");
				
				if(dineroIngresado > 3000)
				{
					saldo = (dineroIngresado + saldo);
					System.out.println("Usted ha ingresado la cantidad de " + dineroIngresado 
							+ "€, debido a que esta cantidad supera los 3000€, notificar a Hacienda");
					
				}
			}
			
			else
			{
				System.out.println("¡ERROR! Solo se puede ingresar valores superiores a cero");
			}
			
		return saldo;
	}
	
	
	public double retirada()
	{ 
			if (dineroRetirado > 0)
			{
				saldo = (saldo - dineroRetirado);
				System.out.println("Usted ha retirado la cantidad de " + dineroRetirado +"€");
				
				if(saldo < 0)
				{
					saldo = (saldo - dineroRetirado);
					System.out.println("Su saldo es negativo");
				}
				
				if(saldo < -50)
				{
					System.out.println("¡ERROR! No puede tener un saldo de -50€ en la cuenta");
				}
			}
			
			else
			{
				System.out.println("¡ERROR! Solo se puede retirar valores superiores a cero");
			}
			
		return saldo;
	}
	
	
	public void MostrarMovimientos()
	{
		String movi = ("ID: " + this.ID + ", Fecha: " + this.fecha + ", Tipo(ingreso o retirada): " + this.tipoMovimiento 
				+ ", Cantidad: " + this.cantidad);
		
		if(this.numMovimActuales > 0)
		{
			movi = movi + "\nMovimientos: \n";
			for(int i = 0; i < numMovimActuales; i++)
			{
				
			}
		}
	
	}
	

	
	
	
}//clase CuentaBancaria

