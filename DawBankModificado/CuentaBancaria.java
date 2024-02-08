import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;



public class CuentaBancaria
{
	
	private String IBAN;
	private String cliente;
	private TipoMovimiento tipomov;
	
	private double saldo;
	private int movimientos;
	double dineroIngresado;
	double dineroRetirado;
	

	ArrayList<Movimiento> ColeccionMovimientos = new ArrayList<Movimiento>();
	Iterator<Movimiento> itera = ColeccionMovimientos.iterator();
	//private Movimiento[] Movimientoarray;
	
	private int numMovimActuales = 0;
	
	private String MostrarMovimientos;
	
	
	public CuentaBancaria(String IBAN, String cliente) throws CuentaException
	{
		this.setIBAN(IBAN);
		this.setCliente(cliente);
	}
	
	
	public String getIBAN() 
	{
		return IBAN;
	}
	
	
    private void setIBAN(String IBAN)  throws CuentaException
    {
    	if(IBAN.length()>22)
    	{
		this.IBAN = IBAN;
    	}
    	
    	else
    	{
		throw new CuentaException(IBAN, cliente);
    	}
	}
    
   
    
	public String getCliente() 
	{
		return cliente;
	}
	
	
	public void setCliente(String cliente) throws CuentaException
	{
		if(cliente.length() > 5) 
		{
			this.cliente = cliente;
		}
		
		else
		{
		throw new CuentaException(IBAN, cliente);
		}
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
	
	
	
	public double ingreso(double cantidad) throws AvisarHaciendaException
	{ 
			if (cantidad > 0)
			{
				saldo = (cantidad + saldo);
				System.out.println("Usted ha ingresado la cantidad de " + cantidad +"€");
				
				if(cantidad > 3000)
				{
					saldo = (cantidad + saldo);
					System.out.println("Usted ha ingresado la cantidad de " + dineroIngresado 
							+ "€, debido a que esta cantidad supera los 3000€, notificar a Hacienda");
					throw new AvisarHaciendaException(cliente, IBAN, tipomov);
					
				}
				
				
			
			}
			
			else
			{
				System.out.println("¡ERROR! Solo se puede ingresar valores superiores a cero");
			}
			
		return saldo;
	}
	
	
	
	public double retirada(double cantidad)
	{ 
			if (cantidad > 0)
			{
				saldo = (saldo - cantidad);
				System.out.println("Usted ha retirado la cantidad de " + dineroRetirado +"€");
				
			
			}
			else
			{
				System.out.println("¡ERROR! Solo se puede retirar valores superiores a cero");
			}
			
			if(saldo < 0)
			{
				saldo = (saldo - cantidad);
				System.out.println("Su saldo es negativo");
			}
			
			if(saldo < -50)
			{
				System.out.println("¡ERROR! No puede tener un saldo de -50€ en la cuenta");
			}
		
			
		return saldo;
	}
	
	
	
	
	public void MostrarMovimientos()
	{
		while (itera.hasNext()) //mostrar lista
		{
		    Movimiento movimientoss = itera.next();
		    System.out.println(movimientoss.toString());
		}
	}
	
	
}//clase CuentaBancaria
