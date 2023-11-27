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
	
	public CuentaBancaria(String IBAN, String titular, double saldo, int movimientos)
	{
		this.IBAN = IBAN;
		this.titular = titular;
		this.saldo = saldo;
		this.movimientos = movimientos;
	}
	
	
	
	public String getIBAN() 
	{
		return IBAN;
	}
	
	
    private void setIBAN(String iBAN) 
    {
		this.IBAN = iBAN;

	}
    
    
    private boolean validacionIBAN(String IBAN)
    {
    	Boolean isFormatOk = false;
		String formato = "[A-Z](2) [0-9](22)";
		Pattern pattern = Pattern.compile(formato);
		Matcher matcher = pattern.matcher(IBAN);
		if(matcher.matches())
		{
			this.IBAN = IBAN;
			isFormatOk = true;
		}

		return isFormatOk;
    }
	
	
    
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
				dineroIngresado = (dineroIngresado + saldo);
				System.out.println("Usted ha ingresado la cantidad de " + dineroIngresado +"€");
				
				if(dineroIngresado > 3000)
				{
					dineroIngresado = (dineroIngresado + saldo);
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
				dineroRetirado = (saldo - dineroRetirado);
				System.out.println("Usted ha retirado la cantidad de " + dineroRetirado +"€");
				
				if(dineroRetirado < 0)
				{
					dineroRetirado = (saldo - dineroRetirado);
					System.out.println("Su saldo es negativo");
				}
				
				if(dineroRetirado < -50)
				{
					System.out.println("No puede tener un saldo de -50€ en la cuenta");
				}
			}
			
			else
			{
				System.out.println("¡ERROR! Solo se puede retirar valores superiores a cero");
			}
			
		return saldo;
	}	

	
	
	
}//clase CuentaBancaria

