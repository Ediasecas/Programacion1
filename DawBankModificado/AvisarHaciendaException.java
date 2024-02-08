
public class AvisarHaciendaException extends Exception
{
	private String cliente;
	private String IBAN;
	private TipoMovimiento tipomov;
	
	public AvisarHaciendaException(String cliente, String IBAN, TipoMovimiento tipomov) 
	{
		this.cliente = cliente;
		this.IBAN = IBAN;
		this.tipomov = tipomov;
	}
	
}
