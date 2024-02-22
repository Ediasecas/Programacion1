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
	    // Agrega al trabajador a la lista de trabajadores
	    trabajadores.add(trabajador);
	    // Imprime un mensaje indicando que el trabajador ha sido registrado con éxito.
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
	    // Verifica si el número de gerentes de departamento es menor que 3
	    if (gerentesDep.size() < 3) 
	    {
	        // Agrega al gerente de departamento a la lista de gerentes
	        gerentesDep.add(gerenteDep);
	        // Agrega al gerente de departamento a la lista de trabajadores
	        trabajadores.add(gerenteDep); 
	        // Imprime un mensaje indicando que el gerente de departamento ha sido registrado con éxito.
	        System.out.println("Gerente de departamento registrado con éxito.");
	    } 
	    else 
	    {
	        // Si se ha alcanzado el límite de 3 gerentes de departamento, imprime un mensaje de advertencia.
	        System.out.println("Se ha alcanzado el máximo de 3 gerentes de departamento.");
	    }
	}

	public void registrarDirector(Director director)
	{
	   // Verifica si ya hay un director registrado en la empresa
	   if (this.director == null) 
	   {
	       // Si no hay director registrado, establece al nuevo director
	       this.director = director;
	       // Agrega al director a la lista de trabajadores
	       trabajadores.add(director);
	       // Imprime un mensaje indicando que el director ha sido registrado con éxito.
	       System.out.println("Director registrado con éxito.");
	   } 
	   else 
	   {
	      // Si ya hay un director registrado, imprime un mensaje de advertencia.
	      System.out.println("Ya hay un director registrado en la empresa, no se puede añadir otro.");
	   }
	}

	public void eliminarTrabajador(String dni) 
	{
	    // Verifica si el trabajador a eliminar es el director
	    if (director != null && director.getDNI().equals(dni))
	    {
	        // Si el trabajador a eliminar es el director, establece el director como null
	        director = null; 
	        // Imprime un mensaje indicando que el director ha sido eliminado correctamente.
	        System.out.println("El director con DNI " + dni + " ha sido eliminado correctamente.");
	        return;
	    }

	    // Busca entre los gerentes de departamento
	    for (int i = 0; i < gerentesDep.size(); i++) 
	    {
	        GereneteDep gerenteDep = gerentesDep.get(i);
	        if (gerenteDep.getDNI().equals(dni))
	        {
	            // Si se encuentra al gerente de departamento con el DNI especificado, se elimina de la lista
	            gerentesDep.remove(i); 
	            // Imprime un mensaje indicando que el gerente de departamento ha sido eliminado correctamente.
	            System.out.println("El gerente de departamento con DNI " + dni + " ha sido eliminado correctamente.");
	            return;
	        }
	    }

	    // Busca entre los trabajadores normales
	    for (int i = 0; i < trabajadores.size(); i++) 
	    {
	        Trabajador trabajador = trabajadores.get(i);
	        if (trabajador.getDNI().equals(dni)) 
	        {
	            // Si se encuentra al trabajador con el DNI especificado, se elimina de la lista
	            trabajadores.remove(i);
	            // Imprime un mensaje indicando que el trabajador ha sido eliminado correctamente.
	            System.out.println("Trabajador con DNI " + dni + " eliminado correctamente.");
	            return;
	        }
	    }
	    // Si no se encontró ningún trabajador con el DNI especificado, se imprime un mensaje de advertencia.
	    System.out.println("No se encontró ningún trabajador con DNI " + dni + " en la empresa.");
	}
	
	
	public void mostrarInformacionGeneral() // Método para mostrar la información general de la empresa
	{
	    System.out.println("Información general de la empresa:");
	    System.out.println("Nombre: " + nombreEmpresa);
	    System.out.println("CIF: " + CIF);
	    System.out.println("Fecha de Fundacion: " + fechaFundacion);
	}


	public void mostrarOrganigrama() // Método para mostrar el organigrama de la empresa
	{
	    System.out.println("\nTrabajadores Normales:");
	    // Itera sobre la lista de trabajadores para imprimir los trabajadores normales
	    for (Trabajador trabajador : trabajadores) 
	    {
	        // Verifica si el trabajador no es director ni gerente de departamento
	        if (!(trabajador instanceof Director) && !(trabajador instanceof GereneteDep)) 
	        {
	            System.out.println(trabajador);
	        }
	    }
	    
	    System.out.println("\nDirector:");
	    // Imprime al director si existe
	    if (director != null) 
	    {
	        System.out.println(director);
	    }
	    
	    System.out.println("\nGerentes de Departamento:");
	    // Itera sobre la lista de gerentes de departamento para imprimirlos
	    for (GereneteDep gerenteDep : gerentesDep)
	    {
	        System.out.println(gerenteDep);
	    }
	}


	public int numeroTrabajadoresActuales() // Método para obtener el número actual de trabajadores en la empresa
	{
	    return trabajadores.size();
	}


	public Enumerado obtenerTipoDepartamento(String tipoDepartamentoString) // Método para obtener el tipo de departamento a partir de su nombre
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


	public void mostrarInfoDepartamento(String departamento) // Método para mostrar la información de un departamento específico
	{
	    Enumerado tipoDepartamento = Enumerado.valueOf(departamento.toUpperCase());
	    System.out.println("Información del departamento " + departamento + ":");

	    // Itera sobre los trabajadores para imprimir la información de los que pertenecen al departamento especificado
	    for (int i = 0; i < trabajadores.size(); i++) 
	    {
	        Trabajador trabajador = trabajadores.get(i);
	        if (trabajador.getTipoDepartamento() == tipoDepartamento) 
	        {
	            System.out.print("Nombre: " + trabajador.getNombre() + ", DNI: " + trabajador.getDNI());
	            // Verifica si el trabajador es gerente de departamento para imprimir su tipo
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

	    // Itera sobre los gerentes de departamento para imprimir la información de los que pertenecen al departamento especificado
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
