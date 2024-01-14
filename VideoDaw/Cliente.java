import java.time.LocalDate;

public class Cliente {

	
	 private String DNI; 
	 private String nombre;
	 private String numSocio; 
	 private String direccion;
	 private LocalDate fechaNacimiento;
	 private LocalDate fechaBaja;
	 private Pelicula[] PeliculasAlquiladas;
	 private int numPeliActual = 0;
	 private boolean clienteRegistrado = false;
	 
	 
	 public Cliente(String DNI, String Nombre, String NumSocio, String Direccion, LocalDate FechaNacimiento,
			 LocalDate FechaBaja)
	 {
		
		 this.DNI = DNI;
		 this.nombre = Nombre;
		 this.numSocio = NumSocio;
		 this.direccion = Direccion;
		 this.fechaNacimiento = FechaNacimiento;
		 this.fechaBaja = FechaBaja;
		 this.clienteRegistrado = true;
	 }


	public Cliente(String dNI2, String nombre2, String direccionCliente, String fechaNacimiento2, int contadorSocio) {
		// TODO Auto-generated constructor stub
	}


	public String getDNI() 
	{
		return DNI;
	}


	private void setDNI(String dNI) 
	{
		this.DNI = dNI;
	}



	public String getNombre() 
	{
		return nombre;
	}


	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}



	public String getNumSocio()
	{
		return numSocio;
	}


	public void setNumSocio(String numSocio) 
	{
		this.numSocio = numSocio;
	}



	public String getDireccion()
	{
		return direccion;
	}


	private void setDireccion(String direccion) 
	{
		this.direccion = direccion;
	}



	public LocalDate getFechaNacimiento()
	{
		return fechaNacimiento;
	}


	public void setFechaNacimiento(LocalDate fechaNacimiento) 
	{
		this.fechaNacimiento = fechaNacimiento;
	}



	public LocalDate getFechaBaja() 
	{
		return fechaBaja;
	}


	public void setFechaBaja(LocalDate fechaBaja)
	{
		this.fechaBaja = fechaBaja;
	}



	public Pelicula[] getPeliculasAlquiladas() 
	{
		return PeliculasAlquiladas;
	}


	public void setPeliculasAlquiladas(Pelicula[] peliculasAlquiladas) 
	{
		this.PeliculasAlquiladas = peliculasAlquiladas;
	}



	public int getNumPeliActual()
	{
		return numPeliActual;
	}



	public void setNumPeliActual(int numPeliActual) 
	{
		this.numPeliActual = numPeliActual;
	}
	 
	
	
	public boolean getClienteRegistrado() 
	{
		return clienteRegistrado;
	}


	public void setClienteRegistrado(boolean clienteRegistrado) 
	{
		this.clienteRegistrado = clienteRegistrado;
	}
	
	
	
	public String MostrarInfoCliente ()
	{
		String Clientt = "DNI" + this.DNI + " Nombre" + this.nombre + "Numero de Socio " +
				this.numSocio + " Direccion " + this.direccion + " Fecha de nacimiento " 
				+ this.fechaNacimiento ;
		
		return Clientt;
	}
	
	

	public void mostrarPeliculasAlquiladas()
	{
		System.out.println("Hay " + this.PeliculasAlquiladas + " peliculas alquiladas en total a dia de hoy");
	}
	 
	
	
	public void darBajaCliente()
	{
		this.clienteRegistrado = false;
		this.fechaBaja = LocalDate.now();
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
	
	
	public void devolverPelícula(Pelicula p) 
	{
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

