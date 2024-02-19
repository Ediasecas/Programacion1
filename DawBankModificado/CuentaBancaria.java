import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CuentaBancaria
{
	
	private String IBAN;
	private Cliente cliente;
	private TipoMovimiento tipomov;
	private double saldo;
	private List<Movimiento> movimientos;
	private int contadorMovimientos = 0; //contador de movimientos para crear id
	
	
	public CuentaBancaria(String iban, Cliente cliente)
	{
		this.IBAN = iban;
		this.cliente = cliente;
	    this.saldo = 0;
	    this.movimientos = new ArrayList<>();
	}
	
	
	public CuentaBancaria(String iBAN2, String nombreCliente) {
		// TODO Auto-generated constructor stub
	}


	public String getIBAN() 
	{
		return IBAN;
	}
	
	public void setIban(String IBAN) 
	{
	     this.IBAN = IBAN;
	}

	
	
	public Cliente getCliente() 
	{
	    return cliente;
	}

	public void setCliente(Cliente cliente)
	{
		this.cliente = cliente;
	}

	
	
	public double getSaldo() 
	{
		return saldo;
	}

	 public void setSaldo(double saldo) 
	 {
		 this.saldo = saldo;
	 }
	 
	 

	 public List<Movimiento> getMovimientos()
	 {
		 return movimientos;
	 }

	 public void setMovimientos(List<Movimiento> movimientos) 
	 {
		 this.movimientos = movimientos;
	 }
  
   
    
	 private int generarIdMovimiento()//metodo para generar un id de movimiento nuevo caada vez que se cree un nuevo mov
	 {
		 return ++contadorMovimientos;
	 }
	 
	 
	public void ingreso(double cantidad) throws CuentaException
	{ 
		if (cantidad <= 0) 
		{
			throw new CuentaException("No se puede ingresar una cantidad no positiva.");
		}
		
		saldo += cantidad;//actualizamos el saldo con la cantidad que vayamos a ingresar
		
		int idMovimiento = generarIdMovimiento();//creamos un id de movimiento para este ingreso
		
	    Movimiento movimiento = new Movimiento(idMovimiento, LocalDate.now(), TipoMovimiento.INGRESO, cantidad); //Teenemos q crear el nuevo objeto Movimiento
	    movimientos.add(movimiento);
	    
	    if (cantidad > 3000) 
	    {
           try 
           {
              throw new AvisarHaciendaException(cliente.getNombre(), IBAN, TipoMovimiento.INGRESO);
           } 
           catch (AvisarHaciendaException e) 
           {
                e.printStackTrace();
                System.out.println("Mensaje enviado a hacienda");
           }
        }
	 
	}
	
	
	
	public void retirada(double cantidad) throws CuentaException 
	{ 
	    if (cantidad <= 0) 
	    {
	        throw new CuentaException("No se puede retirar una cantidad no positiva.");
	    }
	    
	    double nuevoSaldo = saldo - cantidad;
	    
	    if (nuevoSaldo < -50) 
	    {
	        throw new CuentaException("AVISO: No puede realizar la retirada, el saldo quedaría por debajo de -50.");
	    }
	    
	    saldo = nuevoSaldo;
	    
	    if (saldo < 0) 
	    {
	        throw new CuentaException("AVISO: Saldo en negativo. " );
	    }
	    
	    int idMovimiento = generarIdMovimiento();
	    Movimiento movimiento = new Movimiento(idMovimiento, LocalDate.now(), TipoMovimiento.RETIRADA, cantidad);
	    movimientos.add(movimiento);
	}
	
	
	
	public void mostrarMovimientos() 
	{
	    System.out.println("Historial de movimientos:");
	    if (movimientos.isEmpty()) 
	    {
	        System.out.println("No hay movimientos registrados.");
	    } 
	    else 
	    {
	        for (Movimiento movimiento : movimientos) 
	        {
	            System.out.println(movimiento);
	        }
	    }
	   
	}
	
	
	public void mostrarDatosCuenta() 
	{
	    System.out.println("Datos de la cuenta:");
	    System.out.println("IBAN: " + this.IBAN);
	    System.out.println("Cliente: " + this.cliente.getNombre());
	    System.out.println("Saldo: " + this.saldo + " euros");
	}
	
	
}//clase CuentaBancaria
