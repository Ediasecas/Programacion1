import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Empresa 
{

	
	private String nombreEmpresa;
	private String CIF;
	private LocalDate fechaFundacion;
	private Enumerado tipoDepartamento;
	
	private List<Trabajador> trabajadores;
	private Director director;
	private List<GereneteDep> gerentesDep;
	
	
	
	public Empresa (String nombreEmpresa, String CIF, LocalDate fechaFundacion, Enumerado tipoDepartamento)
	{
		this.nombreEmpresa = nombreEmpresa;
		this.CIF = CIF;
		this.fechaFundacion = fechaFundacion;
		this.tipoDepartamento = tipoDepartamento;
		this.trabajadores = new LinkedList<>();
	    this.gerentesDep = new LinkedList<>();
	}



	public String getNombreEmpresa() 
	{
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa)
	{
		this.nombreEmpresa = nombreEmpresa;
	}



	public String getCIF() 
	{
		return CIF;
	}


	public void setCIF(String cIF) 
	{
		CIF = cIF;
	}



	public LocalDate getFechaFundacion() 
	{
		return fechaFundacion;
	}

	public void setFechaFundacion(LocalDate fechaFundacion) 
	{
		this.fechaFundacion = fechaFundacion;
	}



	public Enumerado getTipoDepartamento() 
	{
		return tipoDepartamento;
	}

	public void setTipoDepartamento(Enumerado tipoDepartamento) 
	{
		this.tipoDepartamento = tipoDepartamento;
	}


	
	public List<Trabajador> getTrabajadores() 
	{
		return trabajadores;
	}

	public void setTrabajadores(List<Trabajador> trabajadores)
	{
		this.trabajadores = trabajadores;
	}



	public Director getDirector() 
	{
		return director;
	}

	public void setDirector(Director director)
	{
		this.director = director;
	}



	public List<GereneteDep> getGerentesDep() 
	{
		return gerentesDep;
	}

	public void setGerentesDep(List<GereneteDep> gerentesDep)
	{
		this.gerentesDep = gerentesDep;
	}
	
	
	
	public void registrarTrabajador(Trabajador trabajador) 
	{
	 
		trabajadores.add(trabajador); // Agrega al trabajador a la lista de trabajadores
	    System.out.println("Trabajador registrado con éxito.");
	  
	}
	
		
	/* 	public void registrarTrabajador(Trabajador trabajador)  //metodo de registrar trabjador bien hecho mirando el dni ,revisar
	 	{
			for(Trabajador trab : this.trabajadores) 
			{
				if(trab.getDNI().equalsIgnoreCase(trabajador.getDNI()))
				{
				 
					System.out.println("Trabajador ya registrado , dni repetido.");
				}
				else {
					trabajadores.add(trabajador); // Agrega al trabajador a la lista de trabajadores
					System.out.println("Trabajador registrado con éxito.");
				}
			}
	 	} 
	*/
	
	public void registrarGerenteDep(GereneteDep gerenteDep) 
    {
        if (gerentesDep.size() < 3) 
        {
            gerentesDep.add(gerenteDep);
            trabajadores.add(gerenteDep); 
            System.out.println("Gerente de departamento  registrado con éxito.");// Agrega al gerente de departamento a la lista de trabajadores
        } 
        
        else 
        {
            System.out.println("Se ha alcanzado el máximo de 3 gerentes de departamento.");
        }
    }
	
	
	
	public void registrarDirector(Director director)
	{
	   if (this.director == null) 
	   {
	       this.director = director;
	       trabajadores.add(director); // Agrega al director a la lista de trabajadores
	       System.out.println("Director registrado con éxito.");
	   } 
	   
	   else 
	   {
	      System.out.println("Ya hay un director registrado en la empresa, no se puede añadir otro.");
	   }
	}
	
	
	
	public void eliminarTrabajador(String dni) 
	{
	        
		 if (director != null && director.getDNI().equals(dni))
		 {
			 director = null; 
			 System.out.println("El director con DNI " + dni + " ha sido eliminado correctamente.");
		     return;
		 }
	
		       
		 for (int i = 0; i < gerentesDep.size(); i++) 
		 {
		      GereneteDep gerenteDep = gerentesDep.get(i);
		       if (gerenteDep.getDNI().equals(dni))
		       {
		    	   gerentesDep.remove(i); 
		    	   System.out.println("El gerente de departamento con DNI " + dni + " ha sido elimindo correctamente.");
		          return;
		       }
		 }
	
		 for (int i = 0; i < trabajadores.size(); i++) 
		 {
		     Trabajador trabajador = trabajadores.get(i);
		     if (trabajador.getDNI().equals(dni)) 
		     {
		    	 trabajadores.remove(i);
		    	 System.out.println("Trabajador con DNI " + dni + " eliminado correctamente.");
		    	 return;
		     }
		 }
		     System.out.println("No se encontró ningún trabajador con DNI " + dni + " en la empresa.");

	}
	
    public void mostrarInformacionGeneral() //METODO MOSTRAR INFORMACION GENERAL EMPRESA
    {
        System.out.println("Información general de la empresa:");
        System.out.println("Nombre: " + nombreEmpresa);
        System.out.println("CIF: " + CIF);
        System.out.println("Fecha de Fundacion: " + fechaFundacion);
    }
    
    
    public void mostrarOrganigrma() //organigrama
    {
        
        System.out.println("\nTrabajadores Normales:");
        for (Trabajador trabajador : trabajadores) 
        {
          
          if (!(trabajador instanceof Director) && !(trabajador instanceof GereneteDep)) 
          {
                System.out.println(trabajador);
          }
        }
        
        System.out.println("\nDirector:");
        if (director != null) 
        {
            System.out.println(director);
        }
        
        
        System.out.println("\nGerentes de Departamento:");
        for (GereneteDep gerenteDep : gerentesDep)
        {
            System.out.println(gerenteDep);
        }
    }
    
    
    
    public int numeroTrabajadoresActuales() //MOSTRAR NUMERO TRABAJADORES ACTUALES
    {
        return trabajadores.size();
    }
   
    

    
    public Enumerado obtenerTipoDepartamento(String tipoDepartamentoString)
    {
        
        switch (tipoDepartamentoString.toUpperCase())
        {
            case "INFORMATICA":
                return Enumerado.INFORMATICA;
            case "GESTION":
                return Enumerado.GESTION;
            case "MARKETING":
                return Enumerado.MARKETING;
            default:
                return null; 
        }
	

    }
	
    
    public void mostrarInfoDepartamento(String departamento)
	{
		Enumerado tipoDepartamento = Enumerado.valueOf(departamento.toUpperCase());
        System.out.println("Información del departamento " + departamento + ":");

        for (int i = 0; i < trabajadores.size(); i++) 
        {
            Trabajador trabajador = trabajadores.get(i);
            if (trabajador.getTipoDepartamento() == tipoDepartamento) 
            {
                System.out.print("Nombre: " + trabajador.getNombre() + ", DNI: " + trabajador.getDNI());
                if (trabajador instanceof GereneteDep)
                {
                    System.out.println(", Tipo: Gerente de Departamento");
                } 
                else 
                {
                    System.out.println(", Tipo: Trabajador Normal");
                }
            }
        }

        
       for (int i = 0; i < gerentesDep.size(); i++) 
        {
            GereneteDep gerenteDep = gerentesDep.get(i);
            if (gerenteDep.getTipoDepartamento() == tipoDepartamento) 
            {
                System.out.print("Nombre: " + gerenteDep.getNombre() + ", DNI: " + gerenteDep.getDNI());
                System.out.println(", Tipo: Gerente de Departamento");
            }
        }
       
    }//METODO INFO DEPARTAMENTO
    
    
   
    
    
}//CLASE EMPRESA
