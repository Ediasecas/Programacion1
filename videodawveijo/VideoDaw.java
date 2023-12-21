import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VideoDaw{

	private String CIF;
	private String Direccion2;
	private LocalDate FechaAlta;
	private Pelicula[] PeliculasRegistradas;
	private Cliente [] ClientesRegistrados;
	private int NumPelisRegistradas;
	private int NumClientesRegistrados;
	private final int maxPeliculas = 100;
	private final int maxClientes = 100;

	
	public VideoDaw(String CIF, String Direccion2, LocalDate FechaAlta){
		
		this.CIF = CIF;
		this.Direccion2 = Direccion2;
		this.FechaAlta = LocalDate.now();
		this.ClientesRegistrados = new Cliente[100];
		this.PeliculasRegistradas = new Pelicula[this.maxPeliculas];
	}
	
	
	public String getCIF() {
		return CIF;
	}
	
	
	public void setCIF(String cIF) {
		CIF = cIF;
	}
	
	/*private boolean CIFValidator(String CIF)
	{
		boolean isFormatOk = false;
		String regex = "^(?:ISBN(?:-10)?:? )?(?=[0-9X]{10}$|(?=(?:[0-9]+[- ]){3})[- 0-9X]{13}$)[0-9]{1,5}[- ]?[0-9]+[- ]?[0-9]+[- ]?[0-9X]$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(CIF);
		if(matcher.matches())
		{
			this.CIF = CIF ;
			isFormatOk = true;
		}

		return isFormatOk;
	}
	*/
	public String getDireccion2() {
		return Direccion2;
	}
	
	
	public void setDireccion2(String direccion2) {
		Direccion2 = direccion2;
	}
	
	
	public LocalDate getFechaAlta() {
		return FechaAlta;
	}
	
	
	public void setFechaAlta(LocalDate fechaAlta) {
		FechaAlta = fechaAlta;
	}
	
	
	public Pelicula[] getPelículasRegistradas() {
		return PeliculasRegistradas;
	}
	
	
	public void setPelículasRegistradas(Pelicula[] películasRegistradas) {
		PeliculasRegistradas = películasRegistradas;
	}
	
	
	public Cliente[] getClientesRegistrados() {
		return ClientesRegistrados;
	}
	
	
	public void setClientesRegistrados(Cliente[] clientesRegistrados) {
		ClientesRegistrados = clientesRegistrados;
	}
		
	public void mostrarInfoVideoClub(){
		String infovid = "CID" + this.CIF + "Direccion" + this.Direccion2 + "Fecha de Alta de peli" + this.FechaAlta;
		System.out.println(infovid);
	}
	
	public void mostrarClientesRegistrados(){
		String clientRegistrados = "Clientes" + this.ClientesRegistrados;
		System.out.println(clientRegistrados);
	}
	
	
	
	public void registrarPelicula(Pelicula Pelicula) {
		if (Pelicula != null && this.NumPelisRegistradas < this.maxPeliculas)
		{ 
			if (this.NumPelisRegistradas == 0)
			{
				this.PeliculasRegistradas[0] = Pelicula; 
				this.NumPelisRegistradas ++;
			}
			else if (this.NumPelisRegistradas > 0)
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
	
	public void registrarCliente(Cliente cliente) {
		if(cliente != null && this.NumClientesRegistrados < this.maxClientes)
		{
			if(this.NumClientesRegistrados == 0)
			{
				this.ClientesRegistrados[0] = cliente;
				this.NumClientesRegistrados ++;
			}
		}//1er if
		
		else if (this.NumClientesRegistrados > 0)
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
	
	public Cliente obtenerDni(String DNI) {
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
		
	
	public void darBajaCliente(Cliente c) {
		c.darBajaCliente();
				
	}
	
	public Pelicula obtenerCodigo (String Codigo) {
		Pelicula p = null;
		for (int i = 0; i < this.PeliculasRegistradas.length; i++) {
			if (this.PeliculasRegistradas[i].getCod().equalsIgnoreCase(Codigo)) {
				p = PeliculasRegistradas[i];
			}
				
		}
		return p;
	}
	
	
	
	public void darBajaPelicula(Pelicula p) {
		p.darBajaPeli(); 
	}
	
	
	
	public void alquilarPelicula(Pelicula p, Cliente c) {
		
		
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
	
	public void devolverPelicula(Pelicula p, Cliente c) {
		
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
