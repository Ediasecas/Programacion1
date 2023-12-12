import java.time.LocalDate;

public class Cliente {

	
	 private String DNI; 
	 private String Nombre;
	 private String NumSocio; 
	 private String Direccion;
	 private LocalDate FechaNacimiento;
	 private LocalDate FechaBaja;
	 private Pelicula[] PeliculasAlquiladas;
	 private int numPeliActual = 0;
	 private boolean clienteRegistrado = false;
	 
	 
	 public Cliente(String DNI, String Nombre, String NumSocio, String Direccion, LocalDate FechaNacimiento,
			 LocalDate FechaBaja){
		
		 this.DNI = DNI;
		 this.Nombre = Nombre;
		 this.NumSocio = NumSocio;
		 this.Direccion = Direccion;
		 this.FechaNacimiento = FechaNacimiento;
		 this.FechaBaja = FechaBaja;
		 this.clienteRegistrado = true;
	 }



	public Cliente(String dNI2, String nombre2, String direccion2, String fechaNacimiento2, int contadorSocio) {
		// TODO Auto-generated constructor stub
	}



	public String getDNI() {
		return DNI;
	}


	public void setDNI(String dNI) {
		this.DNI = dNI;
	}



	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}



	public String getNumSocio() {
		return NumSocio;
	}


	public void setNumSocio(String numSocio) {
		this.NumSocio = numSocio;
	}



	public String getDireccion() {
		return Direccion;
	}


	public void setDireccion(String direccion) {
		this.Direccion = direccion;
	}



	public LocalDate getFechaNacimiento() {
		return FechaNacimiento;
	}


	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.FechaNacimiento = fechaNacimiento;
	}



	public LocalDate getFechaBaja() {
		return FechaBaja;
	}


	public void setFechaBaja(LocalDate fechaBaja) {
		this.FechaBaja = fechaBaja;
	}



	public Pelicula[] getPeliculasAlquiladas() {
		return PeliculasAlquiladas;
	}


	public void setPeliculasAlquiladas(Pelicula[] peliculasAlquiladas) {
		this.PeliculasAlquiladas = peliculasAlquiladas;
	}



	public int getNumPeliActual() {
		return numPeliActual;
	}



	public void setNumPeliActual(int numPeliActual) {
		this.numPeliActual = numPeliActual;
	}
	 
	
	
	public boolean getClienteRegistrado() {
		return clienteRegistrado;
	}


	public void setClienteRegistrado(boolean clienteRegistrado) {
		this.clienteRegistrado = clienteRegistrado;
	}
	
	
	
	public void MostrarInfoCliente (){
		String Clientt = "DNI" + this.DNI + " Nombre" + this.Nombre + "Numero de Socio " +
				this.NumSocio + " Direccion " + this.Direccion + " Fecha de nacimiento " 
				+ this.FechaNacimiento ;
		
		System.out.println(Clientt);
	}
	
	

	public void mostrarPeliculasAlquiladas(){
		System.out.println("Hay " + this.PeliculasAlquiladas + " peliculas alquiladas en total a dia de hoy");
	}
	 
	
	
	public void darBajaCliente() {
		this.clienteRegistrado = false;
		this.FechaBaja = LocalDate.now();
	}
	 
	 
	public void alquilarPelicula(Pelicula p)
	{
		if(p != null) 
		{
			if(this.numPeliActual < this.PeliculasAlquiladas.length)
			{
				this.PeliculasAlquiladas[this.numPeliActual] = p;
				this.numPeliActual ++;
			}
			
			
		}
	}
	
	public void devolverPelícula(Pelicula p) {
		if(p != null) 
		{
			if(this.numPeliActual < this.PeliculasAlquiladas.length)
			{
				this.PeliculasAlquiladas[this.numPeliActual] = p;
				this.numPeliActual--;
			}
			
			
		}
	}
	 
	 
	 
	 
	 
	
}//clase CLIENTE

