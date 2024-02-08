import java.time.LocalDate;

public class Movimiento implements Comparable                                                                                                                                                                                                             
{                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                     
	private String ID;                                                                                                                                                                                                               
	private LocalDate fecha;                                                                                                                                                                                                            
	private String tipoMovimiento;                                                                                                                                                                                                   
	private double cantidad;                                                                                                                                                                                                         
	                                                                                                                                                                                                                                 
	                                                                                                                                                                                                                                 
	public Movimiento(String ID, LocalDate fecha, String tipo, double cantidad)                                                                                                                                                         
	{                                                                                                                                                                                                                                
		this.ID = ID;                                                                                                                                                                                                                
		this.fecha = fecha;                                                                                                                                                                                                          
		this.tipoMovimiento = tipo;                                                                                                                                                                                                  
		this.cantidad = cantidad;                                                                                                                                                                                                    
	}                                                                                                                                                                                                                                
                                                                                                                                                                                                                                     
	public String getID()                                                                                                                                                                                                            
	{                                                                                                                                                                                                                                
		return this.ID;                                                                                                                                                                                                              
	}                                                                                                                                                                                                                                
                                                                                                                                                                                                                                     
	public void setID(String ID)                                                                                                                                                                                                     
	{                                                                                                                                                                                                                                
		this.ID=ID;                                                                                                                                                                                                                  
	}                                                                                                                                                                                                                                
	                                                                                                                                                                                                                                 
                                                                                                                                                                                                                                     
	                                                                                                                                                                                                                                 
	public LocalDate getFecha()                                                                                                                                                                                                         
	{                                                                                                                                                                                                                                
		return this.fecha;                                                                                                                                                                                                                
	}                                                                                                                                                                                                                                
                                                                                                                                                                                                                                     
	private void setFecha(LocalDate Fecha)                                                                                                                                                                                              
	{                                                                                                                                                                                                                                
		this.fecha = fecha;                                                                                                                                                                                                          
	}                                                                                                                                                                                                                                
	                                                                                                                                                                                                                                 
	          
	
	public String getTipoMovimiento()                                                                                                                                                                                                
	{                                                                                                                                                                                                                                
		return tipoMovimiento;                                                                                                                                                                                                       
	}                                                                                                                                                                                                                                
                                                                                                                                                                                                                                     
	private void setTipoMovimiento(String tipo)                                                                                                                                                                                      
	{                                                                                                                                                                                                                                
		this.tipoMovimiento = tipo;                                                                                                                                                                                                  
	}                                                                                                                                                                                                                                
	                                                                                                                                                                                                                                 
                                                                                                                                                                                                                                     
	                                                                                                                                                                                                                                 
	public double getCantidad()                                                                                                                                                                                                      
	{                                                                                                                                                                                                                                
		return cantidad;                                                                                                                                                                                                             
	}                                                                                                                                                                                                                                
                                                                                                                                                                                                                                     
	public void setCantidad(double cantidad)                                                                                                                                                                                         
	{                                                                                                                                                                                                                                
		this.cantidad = cantidad;                                                                                                                                                                                                    
	}                                                                                                                                                                                                                                
	                                                                                                                                                                                                                                 
	public String mostrarInfoMovimiento()                                                                                                                                                                                            
	{                                                                                                                                                                                                                                
		String datosmov;                                                                                                                                                                                                             
		datosmov = ( this.fecha + ", " + this.tipoMovimiento + ", " + this.cantidad);                                                                                                                                                
		System.out.println("Sus movimientos recientes son: " + datosmov);                                                                                                                                                            
		                                                                                                                                                                                                                             
		return datosmov;                                                                                                                                                                                                             
	}

	
	
	@Override
	public int compareTo(Object o) 
	{
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	@Override
	public String toString() {
		return "Movimiento [ID=" + ID + ", fecha=" + fecha + ", tipoMovimiento=" + tipoMovimiento + ", cantidad="
				+ cantidad + "]";
	}                                                                                                                                                                                                                                
	                                                                                                                                                                                                                                 
	                                                                                                                                                                                                                                 
	
	                                                                                                                                                                                                                                
	                                                                                                                                                                                                                                 
}                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                     

