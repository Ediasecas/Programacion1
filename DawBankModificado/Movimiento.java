import java.time.LocalDate;

public class Movimiento implements Comparable                                                                                                                                                                                                             
{                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                     
	private int ID;                                                                                                                                                                                                               
	private LocalDate fecha;                                                                                                                                                                                                            
	private TipoMovimiento tipomov;                                                                                                                                                                                                   
	private double cantidad;                                                                                                                                                                                                         
	                                                                                                                                                                                                                                 
	                                                                                                                                                                                                                                 
	public Movimiento(int ID, LocalDate fecha, TipoMovimiento tipomov, double cantidad)                                                                                                                                                         
	{                                                                                                                                                                                                                                
		this.ID = ID;                                                                                                                                                                                                                
		this.fecha = fecha;                                                                                                                                                                                                          
		this.tipomov = tipomov;                                                                                                                                                                                                  
		this.cantidad = cantidad;                                                                                                                                                                                                    
	}                                                                                                                                                                                                                                
                                                                                                                                                                                                                                     
	public int getID()                                                                                                                                                                                                            
	{                                                                                                                                                                                                                                
		return this.ID;                                                                                                                                                                                                              
	}                                                                                                                                                                                                                                
                                                                                                                                                                                                                                     
	public void setID(int ID)                                                                                                                                                                                                     
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
	                                                                                                                                                                                                                                 
	          
	
	public  TipoMovimiento getTipomov()                                                                                                                                                                                                
	{                                                                                                                                                                                                                                
		return tipomov;                                                                                                                                                                                                       
	}                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
	public void setTipomov(TipoMovimiento tipomov) {
		this.tipomov = tipomov;
	}

	
	public double getCantidad()                                                                                                                                                                                                      
	{                                                                                                                                                                                                                                
		return cantidad;                                                                                                                                                                                                             
	}                                                                                                                                                                                                                                
                                                                                                                                                                                                                                     
	public void setCantidad(double cantidad)                                                                                                                                                                                         
	{                                                                                                                                                                                                                                
		this.cantidad = cantidad;                                                                                                                                                                                                    
	}                                                                                                                                                                                                                                
	                                                                                                                                                                                                                                 
	
	@Override
	public String toString() {
		return "Movimiento [ID=" + ID + ", fecha=" + fecha + ", tipoMovimiento=" + tipomov + ", cantidad="
				+ cantidad + "]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}                                                                                                                                                                                                                                
	                                                                                                                                                                                                                                 
	                                                                                                                                                                                                                                 
	
	                                                                                                                                                                                                                                
	                                                                                                                                                                                                                                 
}                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                     

