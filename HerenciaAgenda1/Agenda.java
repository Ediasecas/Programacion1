
public class Agenda 
{
		
		private String nombreAgenda;
	    private Contacto[] agendaContactos;
	   
	    private int contactosRegistrados;
	    private int numMaxContactos;

	    
	    
	    public Agenda(String nombreAgenda, int contactosRegistrados, int numMaxContactros) 
	    {
			this.nombreAgenda = nombreAgenda;
			this.numMaxContactos = numMaxContactos;
			this.agendaContactos = new Contacto [this.numMaxContactos];
			
		}

	   

		public Agenda(int numMaxContactos) 
		{
			this.numMaxContactos = numMaxContactos;
			this.agendaContactos = new Contacto[this.numMaxContactos];
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


		
	    
	    public boolean añadirContacto(Contacto c) //       AÑADIR CONTACTO
		{
			boolean contactoInsertado = false;
			if(this.agendaContactos != null)
			{
				if(this.contactosRegistrados >= 0 && this.contactosRegistrados < this.numMaxContactos)
				{
					boolean existeContacto = false;
					for(int i = 0; i< this.contactosRegistrados; i++)
					{
						if(this.agendaContactos[i].getNombre().equalsIgnoreCase(c.getNombre()))
						{
							existeContacto = true;
							System.out.println("He pasado por aqui: Contacto repetido");
						}
					}
					
					if(existeContacto == false)
					{
						agendaContactos[contactosRegistrados] = c;
						contactosRegistrados ++;
						contactoInsertado = true;
						System.out.println("Se añadió el contacto correctamente");
					}
					else 
					{
						System.out.println("El contacto ya existe en la coleccion");
					}

				}
				else 
				{
					System.out.println("La agenda de contactos  esta completa");
				}
			}
			
			return contactoInsertado;
		}
	    
	   
	    

	    public boolean eliminarContacto(String nombreContactoEliminar) // eliminar contacto
	    {
	        boolean isRemoved = false;

	        for (int i = 0; i < this.contactosRegistrados; i++) {
	            if (this.agendaContactos[i] != null && this.agendaContactos[i].getNombre().equalsIgnoreCase(nombreContactoEliminar))
	            {
	                
	                this.agendaContactos[i] = null;
	                isRemoved = true;
	                contactosRegistrados--;

	                
	                for (int j = i; j < this.contactosRegistrados; j++) //Bucle para reorganizar el contacto "perdido" y cerrar hueco
	                {
	                    this.agendaContactos[j] = this.agendaContactos[j + 1];
	                }
	                
	                this.agendaContactos[this.contactosRegistrados] = null;

	                
	                break;
	            }
	        }

	        if (isRemoved) 
	        {
	            System.out.println("El contacto '" + nombreContactoEliminar + "' ha sido eliminado correctamente.");
	        } 
	        else 
	        {
	            System.out.println("El contacto '" + nombreContactoEliminar + "' no existe en la colección.");
	        }

	        return isRemoved;
	    }
	    
	    
	    
	    public void existeContacto (String Nombre) //   ¿EXISTE CONTACTO?
		{
		    boolean existe = false;

		    for (int i = 0; i < contactosRegistrados; i++)
		    {
		        if(agendaContactos[i] != null && agendaContactos[i].getNombre().equals(Nombre))
		        {		            
		            existe = true;
		            System.out.println("El contacto: " + Nombre + ", existe");
		            
		            break; 		          
		        }
		    }

		    if (!existe)
		    {
		        System.out.println("Contacto no encontrado.");
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
	    
	   
	   
	    public void posicionContacto (String Nombre) //   POSICION CONTACTO
		{
		    boolean existe = false;

		    for (int i = 0; i < contactosRegistrados; i++)
		    {
		        if(agendaContactos[i] != null && agendaContactos[i].getNombre().equals(Nombre))
		        {		            
		            existe = true;
		            System.out.println("El contacto: " + Nombre + ", existe y se encuentra en la posicion " + i+1);
		            
		            break; 		          
		        }
		    }

		    if (!existe)
		    {
		        System.out.println("Contacto no encontrado.");
		    }
		}



	
	     
	    
	  



		
	    
	    
}
	
	
	
	
	
	
	
	



	    
	  