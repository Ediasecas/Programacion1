import java.time.LocalDate;

public class Pelicula {

	
	private String Cod;
	private String Titulo;
	private Genero genero; 
	private LocalDate FechaRegistro;
	private LocalDate FechaBaja;
	private LocalDate FechaAlquiler;
	private boolean IsAlquilada = false;
	private boolean Pelidispo;
	
	
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


	public String getCod() {
		return Cod;
	}


	public void setCod(String cod) {
		Cod = cod;
	}


	public String getTitulo() {
		return Titulo;
	}


	public void setTitulo(String titulo) {
		Titulo = titulo;
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
		FechaBaja = fechaBaja;
	}


	public LocalDate getFechaAlquiler() {
		return FechaAlquiler;
	}


	public void setFechaAlquiler(LocalDate fechaAlquiler) {
		FechaAlquiler = fechaAlquiler;
	}


	public boolean isIsAlquilada() {
		return IsAlquilada;
	}


	public void setIsAlquilada(boolean isAlquilada) {
		IsAlquilada = isAlquilada;
	}
	
	public void mostrarInfoPeli()
	{
		String peli = "Cod" + this.Cod;
		System.out.println(peli);
	}
	
	public void darBajaPeli()
	{
		this.Pelidispo = false;
		this.FechaBaja = LocalDate.now();
	}
	
	
}//clase PELICULA

