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
	
	
	public String getIBAN() 
	{
		return IBAN;
	}
	
	
    private boolean setIBAN(String iBAN) 
    {
		this.IBAN = iBAN;
		return true;
	}
	
    private boolean validacionISBN(String IBAN)
    {
    	Boolean isFormatOk = false;
		String formato = "^(?:ISBN(?:-10)?:? )?(?=[0-9X]{10}$|(?=(?:[0-9]+[- ]){3})[- 0-9X]{13}$)[0-9]{1,5}[- ]?[0-9]+[- ]?[0-9]+[- ]?[0-9X]$";
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
	
	
}

