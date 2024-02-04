package herencia2;

public class inventarioClases 
{

	
	/**Clase de inventario de Clases la cual usaremos para almacenar los metodos que nos pida el ejercicio como : Anadir mascota, mostrar Datos ...
	 * 
	 * En esta clase necesitaremos un atributo para poder almacenar las mascotas( Private Mascotas[] inventarioMascotas ), y un atributo para saber el numero de mascotas Registradas ( private int mascotasRegistradas )
	 */
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

	
	
	/*
	 * Metodo para mostrar el nombre y el tipo de mascota que es(Perro,Gato,Loro...)
	 */
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
	
	
	/**
	 * Metodo para mostrar los datos del animal(metodo de mostrarInfoMascota)
	 * @param Nombre de la Mascota a mostrar del inventario.
	 */
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
	
	
	/**
	 * Metodo para mostrar todos los datos de todas las mascotas.
	 */
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
    
    
    /**
     * Metodo para poder registrar una mascota a nuestro inventario y asi poder tratar con ella.
     * @param a nombre de la Mascota a anadir
     */
    public void anadirMascota(Mascotas a) //      CASE    AÑADIR MASCOTA
    {
    	if (a != null && mascotasRegistradas < inventarioMascotas.length)
    	{
    		this.inventarioMascotas[mascotasRegistradas++] = a;
    	}
     } 

    
    
    /**
     * Metodo para poder eliminar una mascota de nuestro inventario.
     * @param Nombre de la Mascota a eliminar del inventario.
     */
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

    
    /*
     * Metodo para poder vaciar nuestro inventario, y que no haya ninguna mascota registrada.
     */
    public void vaciarInventario() //           Case 6 VACIAR INVENTARIO
    {
        this.mascotasRegistradas = 0;
    }



	
    
    
}
