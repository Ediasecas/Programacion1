
public class  CuentaException extends Exception
{
	private String IBAN;
	private String cliente;
	
	
	public CuentaException(String IBAN,String cliente)
	{
		
		this.IBAN = IBAN;
		this.cliente = cliente;
	}
	
}
