package herencia2;

public class inventarioClases 
{

	

	private String nombreMasc;
    private String tipoMasc;
    private Mascotas[] inventarioMascotas;
    private int mascotasRegistradas;

    public inventarioClases (String nombreMascota, String tipoMascota)
    {
        this.nombreMasc = nombreMasc;
        this.tipoMasc = tipoMasc;
        this.inventarioMascotas = new Mascotas [50];
    }
    
    
    
    public String getNombreMasc() 
    {
		return nombreMasc;
	}

    
	public void setNombreMasc(String nombreMasc) 
	{
		this.nombreMasc = nombreMasc;
	}

	
	
	public String getTipoMasc() 
	{
		return tipoMasc;
	}

	public void setTipoMasc(String tipoMasc)
	{
		this.tipoMasc = tipoMasc;
	}

	
	public Mascotas[] getInventarioMascotas() 
	{
		return inventarioMascotas;
	}

	
	public void setInventarioMascotas(Mascotas[] inventarioMascotas) 
	{
		this.inventarioMascotas = inventarioMascotas;
	}

	
	
	public int getMascotasRegistradas() 
	{
		return mascotasRegistradas;
	}

	
	public void setMascotasRegistradas(int mascotasRegistradas)
	{
		this.mascotasRegistradas = mascotasRegistradas;
	}

	
	
	
	public void mostrarListaTipoNombre() // CASE 1
	{
	    for (int i = 0; i < mascotasRegistradas; i++) 
	    {
	        if (inventarioMascotas[i] != null) 
	        {
	            System.out.println("Nombre: " + inventarioMascotas[i].getNombre() +
	                    ", Tipo: " + inventarioMascotas[i].getTipoAnimal());
	        }
	    }
	}
	
	
	
	public void mostrarDatosAnimal(String Nombre) // CASE 2
	{
	    boolean encontrado = false;

	    for(int i = 0; i < mascotasRegistradas; i++)
	    {
	        if(inventarioMascotas[i] != null && inventarioMascotas[i].getNombre().equals(Nombre))
	        {
	            System.out.println(inventarioMascotas[i].mostrarInfoMascota());
	            encontrado = true;
	            break;  
	        }
	    }

	    if (!encontrado) {
	        System.out.println("Animal no encontrado.");
	    }
	}
	
	
	
    public void mostrarTodosDatos() //       CASE 3 
    {
        for (int i = 0; i < mascotasRegistradas; i++)
        {
            if (inventarioMascotas[i] != null) 
            {
                System.out.println(inventarioMascotas[i].mostrarInfoMascota());
            }
        }
    }
    
    
    
    public void añadirMascota(Mascotas a) //        CASE    AÑADIR MASCOTA
    {
    	if (a != null && mascotasRegistradas < inventarioMascotas.length)
    	{
    		this.inventarioMascotas[mascotasRegistradas++] = a;
    	}
     } 

    
    
    public void borrarAnimal(String Nombre) //    Case 5 BORRAR MASCOTA
    {
        int restar = -1;
        for (int i = 0; i < inventarioMascotas.length; i++)
        {
            if (inventarioMascotas[i].getNombre().equals(Nombre))
            {
                restar = i;
            }
        }

    }

    
    
    public void vaciarInventario() //           Case 6 VACIAR INVENTARIO
    {
        this.mascotasRegistradas = 0;
    }



	
    
    
}
