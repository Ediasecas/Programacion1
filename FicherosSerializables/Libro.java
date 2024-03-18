import java.time.LocalDate;

public class Libro 
{

	private int ISBN;
	private String titulo;
	private String autor;
	private LocalDate fechaPublicacion;
	
	
	public Libro(int iSBN, String titulo, String autor, LocalDate fechaPublicacion) 
	{
		super();
		this.ISBN = iSBN;
		this.titulo = titulo;
		this.autor = autor;
		this.fechaPublicacion = fechaPublicacion;
	}


	public int getISBN() 
	{
		return ISBN;
	}

	public void setISBN(int iSBN) 
	{
		ISBN = iSBN;
	}

	
	
	public String getTitulo()
	{
		return titulo;
	}

	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}

	

	public String getAutor()
	{
		return autor;
	}

	public void setAutor(String autor) 
	{
		this.autor = autor;
	}

	

	public LocalDate getFechaPublicacion()
	{
		return fechaPublicacion;
	}

	public void setFechaPublicacion(LocalDate fechaPublicacion) 
	{
		this.fechaPublicacion = fechaPublicacion;
	}


	
	@Override
	public String toString() 
	{
		return "Libro [ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", fechaPublicacion="
				+ fechaPublicacion + "]";
	}
	
	
	
	
	
	
	
	
}//clase libro
