
public class Agenda extends Contacto
{

		private boolean añadirContacto;
		private boolean eliminarContacto;
		private boolean existeContacto;
		private int buscaContacto;
	    private Contacto[] agendaContactos;
	    private int contactosRegistrados;
	    

	    
	    
	    public Agenda(String nombre, String numTelf, boolean añadirContacto, boolean eliminarContacto, boolean existeContacto, int buscaContacto) 
	    {
			super(nombre, numTelf);
			this.añadirContacto = añadirContacto;
			this.eliminarContacto = eliminarContacto;
			this.existeContacto = existeContacto;
			this.buscaContacto = buscaContacto;
			this.agendaContactos = new Contacto [100];
		}

	    
	    
		public boolean isAñadirContacto() 
		{
			return añadirContacto;
		}


		public void setAñadirContacto(boolean añadirContacto) 
		{
			this.añadirContacto = añadirContacto;
		}



		public boolean isEliminarContacto() 
		{
			return eliminarContacto;
		}


		public void setEliminarContacto(boolean eliminarContacto) 
		{
			this.eliminarContacto = eliminarContacto;
		}



		public boolean isExisteContacto() 
		{
			return existeContacto;
		}



		public void setExisteContacto(boolean existeContacto) 
		{
			this.existeContacto = existeContacto;
		}



		public int getBuscaContacto()
		{
			return buscaContacto;
		}


		public void setBuscaContacto(int buscaContacto) 
		{
			this.buscaContacto = buscaContacto;
		}



		public int getContctosRegistrados() {
			return contactosRegistrados;
		}


		public void setContctosRegistrados(int contctosRegistrados) 
		{
			this.contactosRegistrados = contctosRegistrados;
		}



		public Contacto[] getAgendaContactos()
		{
			return agendaContactos;
		}


		public void setAgendaContactos(Contacto[] agendaContactos) 
		{
			this.agendaContactos = agendaContactos;
		}


		
		
	    public void añadirContacto(Contacto c) //       AÑADIR CONTACTO
	    {
	    	if (c != null && contactosRegistrados < agendaContactos.length)
	    	{
	    		this.agendaContactos[contactosRegistrados++] = c;
	    	}
	    } 
	    
	    

	    public void borrarContacto(String Nombre) //     BORRAR CONTACTO
	    {
	        int restar = -1;
	        for (int i = 0; i < agendaContactos.length; i++)
	        {
	            if (agendaContactos[i].getNombre().equals(Nombre))
	            {
	                restar = i;
	            }
	            else
	            {
	            	System.out.println("No se pudo eliminar");
	            }
	        }

	    }
	    
	    
	    
	    public void existeContacto (String Nombre) //   EXISTE CONTACTO
		{
		    boolean existe = false;

		    for(int i = 0; i < contactosRegistrados; i++)
		    {
		        if(agendaContactos[i] != null && agendaContactos[i].getNombre().equals(Nombre))
		        {		            
		            existe = true;
		            System.out.println("El contacto: " + this.getNombre() + ", existe");
		            
		            break; 		          
		        }
		    }

		    if (!existe) {
		        System.out.println("Animal no encontrado.");
		    }
		}
	     
	
		
	    public void mostrarTodosDatos() //      MOSTRAR DATOS AGENDA
	    {
	        for (int i = 0; i < contactosRegistrados; i++)
	        {
	            if (agendaContactos[i] != null) 
	            {
	                System.out.println(agendaContactos[i].mostrarInfoContacto());
	            }
	        }
	    }
	    
	   
	   
	    
	    
	  



		
	    
	    
}
	
	
	
	
	
	
	
	


