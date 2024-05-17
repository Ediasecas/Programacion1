import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Cuadro 
{
	private String nombreC;
	private String id;
	private String estilo;
	private String dimensiones;
	private LocalDate fechaCreacion;
	private Autor autor;
	
	public Cuadro(String nombreC, String id, String estilo, String dimensiones, LocalDate fechaCreacion, Autor autor)
	{
		super();
		this.nombreC = nombreC;
		this.id = id;
		this.estilo = estilo;
		this.dimensiones = dimensiones;
		this.fechaCreacion = fechaCreacion;
		this.autor = autor;
	}


	public String getNombreC() {
		return nombreC;
	}


	public void setNombreC(String nombreC) {
		this.nombreC = nombreC;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getEstilo() {
		return estilo;
	}


	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}


	public String getDimensiones() {
		return dimensiones;
	}


	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}


	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}


	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


	public Autor getAutor() {
		return autor;
	}


	public void setAutor(Autor autor) {
		this.autor = autor;
	}


	@Override
	public String toString() {
		return "Cuadro [nombreC=" + nombreC + ", id=" + id + ", estilo=" + estilo + ", dimensiones=" + dimensiones
				+ ", fechaCreacion=" + fechaCreacion + ", autor=" + autor + "]";
	}
	
	
	
	
	
}
