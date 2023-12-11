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



	public String getDNI() {
		return DNI;
	}



	public void setDNI(String dNI) {
		DNI = dNI;
	}



	public String getNombre() {
		return Nombre;
	}



	public void setNombre(String nombre) {
		Nombre = nombre;
	}



	public String getNumSocio() {
		return NumSocio;
	}



	public void setNumSocio(String numSocio) {
		NumSocio = numSocio;
	}



	public String getDireccion() {
		return Direccion;
	}



	public void setDireccion(String direccion) {
		Direccion = direccion;
	}



	public LocalDate getFechaNacimiento() {
		return FechaNacimiento;
	}



	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}



	public LocalDate getFechaBaja() {
		return FechaBaja;
	}



	public void setFechaBaja(LocalDate fechaBaja) {
		FechaBaja = fechaBaja;
	}



	public Pelicula[] getPeliculasAlquiladas() {
		return PeliculasAlquiladas;
	}



	public void setPeliculasAlquiladas(Pelicula[] peliculasAlquiladas) {
		PeliculasAlquiladas = peliculasAlquiladas;
	}



	public int getNumPeliActual() {
		return numPeliActual;
	}



	public void setNumPeliActual(int numPeliActual) {
		this.numPeliActual = numPeliActual;
	}
	 
	public void MostrarInfoCliente (){
		String Clientt = "DNI" + this.DNI;
		System.out.println(Clientt);
	}
	
	public void mostrarPeliculasAlquiladas(){
		System.out.println("Hay " + this.PeliculasAlquiladas + " peliculas alquiladas en total a dia de hoy");
	}
	 
	public void darBajaCliente() {
		this.clienteRegistrado = false;
		this.FechaBaja = LocalDate.now();
	}
	 
	 
	 
	 
	 
	 
	 
	 
	
}//clase CLIENTE

