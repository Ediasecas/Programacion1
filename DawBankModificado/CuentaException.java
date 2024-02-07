
public class CuentaException extends Exception
{
	private String IBAN;
	private String titular;
	
	
	public CuentaException(String IBAN)
	{
		this.IBAN = IBAN;
	}
	
	public CuentaException(String titular)
	{
		this.titular = titular;
	}
	
	

}
