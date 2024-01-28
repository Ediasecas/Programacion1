import java.util.HashMap;
import java.util.Map;
public class Agenda 
{

	private Contacto[] contactostaller;
	private int contactoRegistrados;
	private int numMaxContactos;
	
	
	private HashMap<String, Contacto> contactos;
	
	
	public Agenda() 
	{
		this.contactos = new HashMap<String,Contacto>();
	}


	
	public Contacto[] getContactostaller() 
	{
		return contactostaller;
	}


	public void setContactostaller(Contacto[] contactostaller) 
	{
		this.contactostaller = contactostaller;
	}


	
	public int getContactoRegistrados() 
	{
		return contactoRegistrados;
	}


	public void setContactoRegistrados(int contactoRegistrados)
	{
		this.contactoRegistrados = contactoRegistrados;
	}


	
	public int getNumMaxContactos() 
	{
		return numMaxContactos;
	}


	
	public void setNumMaxContactos(int numMaxContactos) 
	{
		this.numMaxContactos = numMaxContactos;
	}
	
	
	
	public boolean anadirContacto(String nombre, Contacto contacto) //metodo añadir contacto
	{
	    if (nombre != null && contacto != null)
	    {
	        if (!contactos.containsKey(nombre)) 
	        {
	            contactos.put(nombre, contacto);
	            return true; 
	        } 
	        
	        else 
	        {
	            System.out.println("El contacto con nombre " + nombre + " ya existe en la agenda.");
	        }
	    }
	    
	    else 
	    {
	        System.out.println("Datos de contacto no válidos. No se pudo añadir el contacto.");
	    }
	    
	    return false; 
	}
	
	
	
	public boolean eliminarContacto(String nombre) //metodo eliminar Contacto
	{
		if(nombre != null)
		{
			contactos.remove(nombre);
		}
		
		else
		{
			System.out.println("Esta contacto no se encuentra en la agenda de contactosw");
		}
		
		return false;
	}
	
	
	
	public Contacto buscarContacto(String nombre) //metodo buscar contacto
	{
	    if (nombre != null) 
	    {
	        return contactos.get(nombre);
	    } 
	    
	    else 
	    {
	        System.out.println("Nombre de contacto no válido.");
	        return null; 
	    }
	}
	
	
	
	public void MostrarAgenda() //metodo Mostrar Agenda
	{
        System.out.println("Visualización de Agenda:");
        for (Map.Entry<String, Contacto> entry : contactos.entrySet()) 
        {
            String nombre = entry.getKey();
            Contacto contacto = entry.getValue();
            System.out.println(" CONTACTOS;\n Nombre: " + contacto.getNombre() + ", Telefono: " + contacto.getTelefono() + ", Correo electronico: " + contacto.getCorreoElectronico());
        }
    }
	
	
	
	public int NumContactosAgenda()
	{
	    return contactos.size();
	}
	
}
