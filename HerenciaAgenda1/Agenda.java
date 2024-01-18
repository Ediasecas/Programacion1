
public class Agenda 
{
		
		private String nombreAgenda;
	    private Contacto[] agendaContactos;
	   
	    private int contactosRegistrados;
	    private int numMaxContactos;

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


	    private String getNombre() 
	    {
				// TODO Auto-generated method stub
				return null;
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
	    
	   
	    

		public boolean eliminarContacto (Contacto contacto) // BORRAR CONTACTO
		{
			boolean isRemoved = false;
			if(this.agendaContactos != null)
			{
				if(this.contactosRegistrados > 0)
				{
					int pos = -1;
					for(int i =0; i< this.contactosRegistrados; i++)
					{
						if(this.agendaContactos[i] != null)
						{
							if(this.agendaContactos[i].getNombre().equalsIgnoreCase(contacto.getNombre()))
							{
								this.agendaContactos[i] = null;
								isRemoved = true;
								contactosRegistrados --;
								pos = i;
							}
						}
					}
					
					for(int i = pos; i < this.agendaContactos.length-1; i++)
					{
						this.agendaContactos[i] = this.agendaContactos[i+1];
					}
					this.agendaContactos[agendaContactos.length-1] = null;
					
					
				}
				else 
				{
					System.out.println("La coleccion esta vacia");
				}	
			}
			
			return isRemoved;
		}
	    
	    
	    
	    public void existeContacto (String Nombre) //   ¿EXISTE CONTACTO?
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

		    for(int i = 0; i < contactosRegistrados; i++)
		    {
		        if(agendaContactos[i] != null && agendaContactos[i].getNombre().equals(Nombre))
		        {		            
		            existe = true;
		            System.out.println("El contacto: " + this.getNombre() + ", existe y se encuentra en la posicion " + i);
		            
		            break; 		          
		        }
		    }

		    if (!existe)
		    {
		        System.out.println("Contacto no encontrado.");
		    }
		}



		public void eliminarContacto(String nombreContactoEliminar) {
			// TODO Auto-generated method stub
			
		}
	     
	    
	  



		
	    
	    
}
	
	
	
	
	
	
	
	



	    
	    
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


	    private String getNombre() 
	    {
				// TODO Auto-generated method stub
				return null;
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
	    
	   
	    

		public boolean eliminarContacto () // BORRAR CONTACTO
		{
			boolean isRemoved = false;
			if(this.agendaContactos != null)
			{
				if(this.contactosRegistrados > 0)
				{
					int pos = -1;
					for(int i =0; i< this.contactosRegistrados; i++)
					{
						if(this.agendaContactos[i] != null)
						{
							if(this.agendaContactos[i].getNombre().equalsIgnoreCase(contacto.getNombre()))
							{
								this.agendaContactos[i] = null;
								isRemoved = true;
								contactosRegistrados --;
								pos = i;
							}
						}
					}
					
					for(int i = pos; i < this.agendaContactos.length-1; i++)
					{
						this.agendaContactos[i] = this.agendaContactos[i+1];
					}
					this.agendaContactos[agendaContactos.length-1] = null;
					
					
				}
				else 
				{
					System.out.println("La coleccion esta vacia");
				}	
			}
			
			return isRemoved;
		}
	    
	    
	    
	    public void existeContacto (String Nombre) //   ¿EXISTE CONTACTO?
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

		    for(int i = 0; i < contactosRegistrados; i++)
		    {
		        if(agendaContactos[i] != null && agendaContactos[i].getNombre().equals(Nombre))
		        {		            
		            existe = true;
		            System.out.println("El contacto: " + this.getNombre() + ", existe y se encuentra en la posicion " + i);
		            
		            break; 		          
		        }
		    }

		    if (!existe)
		    {
		        System.out.println("Contacto no encontrado.");
		    }
		}
	     
	    
	  



		
	    
	    
}
	
	
	
	
	
	
	
	


