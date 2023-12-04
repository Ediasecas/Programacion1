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
	
	private Movimiento[] Movimientoarray;
	
	private int numMovimActuales = 0;
	
	private String MostrarMovimientos;
	
	
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
    
   
   /* public boolean validacionIBAN()
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
   */
    
	
	
    
	public String getTitular() 
	{
		return titular;
	}
	
	
	public void setTitular(String titular) 
	{
		this.titular = titular;
	}
	
    
	
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
				
			}
			else
			{
				System.out.println("¡ERROR! Solo se puede retirar valores superiores a cero");
			}
			
			if(saldo < 0)
			{
				saldo = (saldo - dineroRetirado);
				System.out.println("Su saldo es negativo");
			}
			
			if(saldo < -50)
			{
				System.out.println("¡ERROR! No puede tener un saldo de -50€ en la cuenta");
			}
		
			
		return saldo;
	}
	
	public String getMostrarMovimientos()
	{
		return MostrarMovimientos;
	}
	
	public void MostrarMovimientos()
	{
		for(int i = 0; i < Movimientoarray.length; i++)
		{
			if(this.Movimientoarray[i] != null)
			{
					this.Movimientoarray[i].mostrarInfoMovimiento();
			}//if
			
		}//for
		
		
	}//metod 

	

	
	
	
}//clase CuentaBancaria

