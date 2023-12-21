import java.time.LocalDate;

public class Pelicula {

	
	private String Cod;
	private String Titulo;
	private Genero genero; 
	private LocalDate FechaRegistro;
	private LocalDate FechaBaja;
	private LocalDate FechaAlquiler;
	private LocalDate FechaDevolverPeli;
	
	


	private boolean IsAlquilada = false;
	private boolean Pelidispo = false;
	
	
	public Pelicula(String Cod, String Titulo, Genero genero, LocalDate FechaRegistro, LocalDate FechaBaja,
		LocalDate FechaAlquiler, boolean IsAlquilada, boolean Pelidispo){
		
		this.Cod = Cod;
		this.Titulo = Titulo;
		this.genero = genero;
		this.FechaRegistro = FechaRegistro;
		this.FechaBaja = FechaBaja;
		this.FechaAlquiler = FechaAlquiler;
		this.IsAlquilada = false;
		this.Pelidispo = false;	
	}
	
	
	public Pelicula (String Cod, String Titulo, LocalDate FechaRegistro,  Genero genero)
	{
		this.Cod = Cod;
		this.Titulo = Titulo;
		this.FechaRegistro = FechaRegistro;
		this.genero = genero;
		this.IsAlquilada = false;
	}


	public String getCod() {
		return Cod;
	}


	public void setCod(String cod) {
		this.Cod = cod;
	}


	
	public String getTitulo() {
		return Titulo;
	}


	public void setTitulo(String titulo) {
		this.Titulo = titulo;
	}

	

	public Genero getGenero() {
		return genero;
	}


	public void setGenero(Genero genero) {
		this.genero = genero;
	}


	
	public LocalDate getFechaRegistro() {
		return FechaRegistro;
	}


	public void setFechaRegistro(LocalDate fechaRegistro) {
		FechaRegistro = fechaRegistro;
	}

	

	public LocalDate getFechaBaja() {
		return FechaBaja;
	}


	public void setFechaBaja(LocalDate fechaBaja) {
		this.FechaBaja = fechaBaja;
	}

	

	public LocalDate getFechaAlquiler() {
		return FechaAlquiler;
	}


	public void setFechaAlquiler(LocalDate fechaAlquiler) {
		this.FechaAlquiler = fechaAlquiler;
	}

	
	
	public LocalDate getFechaDevolverPeli() {
		return FechaDevolverPeli;
	}


	public void setFechaDevolverPeli(LocalDate localDate) {
		this.FechaDevolverPeli = localDate;
	}

	
	
	public boolean isIsAlquilada() {
		return IsAlquilada;
	}


	public void setIsAlquilada(boolean isAlquilada) {
		this.IsAlquilada = isAlquilada;
	}
	
	public boolean getIsAlquilada() {
		return Pelidispo;
	}
	
	
	public boolean isPelidispo() {
		return Pelidispo;
	}


	public void setPelidispo(boolean pelidispo) {
		this.Pelidispo = pelidispo;
	}


	
	public void mostrarInfoPeli()
	{
		String peli = "Cod" + this.Cod + "titulo" + this.Titulo + "genero" + this.genero + "fecha alquiler" 
				+ this.FechaAlquiler + "esta alquilada¿?" + this.IsAlquilada ;
		System.out.println(peli);
	}
	
	
	
	public void darBajaPeli()
	{
		this.Pelidispo = false;
		this.FechaBaja = LocalDate.now();
	}
	
	
}//clase PELICULA

