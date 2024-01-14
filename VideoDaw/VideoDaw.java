import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VideoDaw{

	private String CIF;
	private String direccion2;
	private LocalDate fechaAlta;
	private Pelicula[] PeliculasRegistradas;
	private Cliente [] ClientesRegistrados;
	private int numPelisRegistradas;
	private int numClientesRegistrados;
	private final int maxPeliculas = 100;
	private final int maxClientes = 100;

	
	public VideoDaw(String CIF, String direccion2, LocalDate fechaAlta){
		
		this.CIF = CIF;
		this.direccion2 = direccion2;
		this.fechaAlta = LocalDate.now();
		this.ClientesRegistrados = new Cliente[100];
		this.PeliculasRegistradas = new Pelicula[this.maxPeliculas];
	}
	
	
	public String getCIF()
	{
		return CIF;
	}
	
	
	public void setCIF(String cIF)
	{
		CIF = cIF;
	}
	

	public String getDireccion2() 
	{
		return direccion2;
	}
	
	
	public void setDireccion2(String direccion2) 
	{
		direccion2 = direccion2;
	}
	
	
	public LocalDate getFechaAlta() 
	{
		return fechaAlta;
	}
	
	
	public void setFechaAlta(LocalDate fechaAlta) 
	{
		fechaAlta = fechaAlta;
	}
	
	
		
	public int getNumClientesRegistrados() {
		return numClientesRegistrados;
	}


	public void setNumClientesRegistrados(int numPelisRegistradas) {
		this.numClientesRegistrados = numClientesRegistrados;
	}

	
	
	public int getNumPelisRegistradas() {
		return numPelisRegistradas;
	}


	public void setNumPelisRegistradas(int numPelisRegistradas) {
		this.numPelisRegistradas = numPelisRegistradas;
	}


	
	public String mostrarInfoVideoClub()
	{
		String infovid = "CID" + this.CIF + "Direccion" + this.direccion2 + "Fecha de Alta de peli" + this.fechaAlta;
		return infovid;
	}
	
	public String mostrarClientesRegistrados()
	{
		String clientRegistrados = "Clientes" + this.ClientesRegistrados;
		return clientRegistrados;
	}
	
	
	
	public void registrarPelicula(Pelicula Pelicula)
	{
		if (Pelicula != null && this.numPelisRegistradas < this.maxPeliculas)
		{ 
			if (this.numPelisRegistradas == 0)
			{
				this.PeliculasRegistradas[0] = Pelicula; 
				this.numPelisRegistradas ++;
			}
			else if (this.numPelisRegistradas > 0)
			{
				boolean peliculaYaExistente = false; 
				for (int i = 0; i < this.PeliculasRegistradas.length; i++)
				{
					if ( this.PeliculasRegistradas[i] != null) 
					{
						if (this.PeliculasRegistradas[i].getCod().equalsIgnoreCase(Pelicula.getCod()))
						{
						peliculaYaExistente = true;
						}
					}
				}
			}
			
		}
			
	}
	
	public void registrarCliente(Cliente cliente) 
	{
		if(cliente != null && this.numClientesRegistrados < this.maxClientes)
		{
			if(this.numClientesRegistrados == 0)
			{
				this.ClientesRegistrados[0] = cliente;
				this.numClientesRegistrados ++;
			}
		}//1er if
		
		else if (this.numClientesRegistrados > 0)
		{
			boolean clienteRepetido = false;
			for(int i = 0 ; i < this.ClientesRegistrados.length; i++)
			{
				if(this.ClientesRegistrados[i] != null)
				{
					if(this.ClientesRegistrados[i].getDNI().equalsIgnoreCase(cliente.getDNI() ) )
					{
						clienteRepetido = true;
					}
					
				}
			}
		}//else if
			
	}//metodo Registrar Cliente	
	
	public Cliente obtenerDni(String DNI)
	{
		Cliente c = null;
		for(int i = 0; i < this.ClientesRegistrados.length; i++)
		{
			if (this.ClientesRegistrados[i].getDNI().equalsIgnoreCase(DNI))
			{
				c = ClientesRegistrados[i];
			}
		}
		
		return c;
	}
		
	
	public void darBajaCliente(Cliente c) 
	{
		c.darBajaCliente();
				
	}
	
	public Pelicula obtenerCodigo (String Codigo) 
	{
		Pelicula p = null;
		for (int i = 0; i < this.PeliculasRegistradas.length; i++) {
			if (this.PeliculasRegistradas[i].getCod().equalsIgnoreCase(Codigo)) {
				p = PeliculasRegistradas[i];
			}
				
		}
		return p;
	}
	
	
	
	public void darBajaPelicula(Pelicula p) 
	{
		p.darBajaPeli(); 
	}
	
	
	
	public void alquilarPelicula(Pelicula p, Cliente c) 
	{
		
		
		for (int i = 0; i < this.PeliculasRegistradas.length; i++) {//recorrer array películas
			if (this.PeliculasRegistradas[i].getCod().equalsIgnoreCase(p.getCod()) && this.PeliculasRegistradas[i].getIsAlquilada() == false && this.ClientesRegistrados[i].getClienteRegistrado() == true) { //comprobar si el cliente y la pelicula estan acivo  
				this.PeliculasRegistradas[i].setIsAlquilada(true);; //se marca como alquilada
				p.setFechaAlquiler(LocalDate.now());
				c.alquilarPelicula(p);
				System.out.println("¡Película alquilada con éxito!");
				
			}else {
				System.out.println("Esta película ya está alquilada.");
			}
		}
	}
	
	
	
	public void devolverPelicula(Pelicula p, Cliente c) 
	{
		
		for (int i = 0; i < this.PeliculasRegistradas.length; i++) {
			if (this.PeliculasRegistradas[i].getCod().equalsIgnoreCase(p.getCod()) && this.PeliculasRegistradas[i].getIsAlquilada() == true && this.ClientesRegistrados[i].getClienteRegistrado() == true) {
				this.PeliculasRegistradas[i].setIsAlquilada(false);
				p.setFechaDevolverPeli(LocalDate.now());
				c.devolverPelícula(p);
				System.out.println("¡Película devuelta con éxito!");
			}

		}
	}
	
	
	
	
	
}
