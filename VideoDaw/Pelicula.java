import java.time.LocalDate;

public class Pelicula {

	
	private String cod;
	private String titulo;
	private Genero genero; 
	private LocalDate fechaRegistro;
	private LocalDate fechaBaja;
	private LocalDate fechaAlquiler;
	private LocalDate fechaDevolverPeli;
	
	


	private boolean IsAlquilada = false;
	private boolean Pelidispo = false;
	
	
	public Pelicula(String Cod, String Titulo, Genero genero, LocalDate FechaRegistro, LocalDate FechaBaja,
		LocalDate FechaAlquiler, boolean IsAlquilada, boolean Pelidispo)
	{
		
		this.cod = Cod;
		this.titulo = Titulo;
		this.genero = genero;
		this.fechaRegistro = FechaRegistro;
		this.fechaBaja = FechaBaja;
		this.fechaAlquiler = FechaAlquiler;
		this.IsAlquilada = false;
		this.Pelidispo = false;	
	}
	
	
	public Pelicula (String cod, String titulo, LocalDate fechaRegistro,  Genero genero)
	{
		this.cod = cod;
		this.titulo = titulo;
		this.fechaRegistro = fechaRegistro;
		this.genero = genero;
		this.IsAlquilada = false;
	}


	public String getCod() 
	{
		return cod;
	}


	private void setCod(String cod) 
	{
		this.cod = cod;
	}


	
	public String getTitulo() 
	{
		return titulo;
	}


	private void setTitulo(String titulo) 
	{
		this.titulo = titulo;
	}

	

	public Genero getGenero()
	{
		return genero;
	}


	public void setGenero(Genero genero) 
	{
		this.genero = genero;
	}


	
	public LocalDate getFechaRegistro() 
	{
		return fechaRegistro;
	}


	public void setFechaRegistro(LocalDate fechaRegistro) 
	{
		fechaRegistro = fechaRegistro;
	}

	

	public LocalDate getFechaBaja() 
	{
		return fechaBaja;
	}


	public void setFechaBaja(LocalDate fechaBaja) 
	{
		this.fechaBaja = fechaBaja;
	}

	

	public LocalDate getFechaAlquiler() 
	{
		return fechaAlquiler;
	}


	public void setFechaAlquiler(LocalDate fechaAlquiler) 
	{
		this.fechaAlquiler = fechaAlquiler;
	}

	
	
	public LocalDate getFechaDevolverPeli() 
	{
		return fechaDevolverPeli;
	}


	public void setFechaDevolverPeli(LocalDate localDate) 
	{
		this.fechaDevolverPeli = localDate;
	}

	
	
	public boolean isIsAlquilada()
	{
		return IsAlquilada;
	}


	public void setIsAlquilada(boolean isAlquilada) 
	{
		this.IsAlquilada = isAlquilada;
	}
	
	public boolean getIsAlquilada()
	{
		return Pelidispo;
	}
	
	
	public boolean isPelidispo()
	{
		return Pelidispo;
	}


	public void setPelidispo(boolean pelidispo) 
	{
		this.Pelidispo = pelidispo;
	}


	
	public String mostrarInfoPeli()
	{
		String peli = "Cod" + this.cod + "titulo" + this.titulo + "genero" + this.genero + "fecha alquiler" 
				+ this.fechaAlquiler + "esta alquilada¿?" + this.IsAlquilada ;
		return peli;
	}
	
	
	
	public void darBajaPeli()
	{
		this.Pelidispo = false;
		this.fechaBaja = LocalDate.now();
	}
	
	
}//clase PELICULA

