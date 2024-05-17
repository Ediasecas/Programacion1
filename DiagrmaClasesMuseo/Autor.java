import java.util.LinkedList;
import java.util.List;

public class Autor 
{
	private String nombreA;
	private String generacion;
	private List<Cuadro> listaCuadrosExps = new LinkedList<>();

	public Autor(String nombreA, String generacion) 
	{
		super();
		this.nombreA = nombreA;
		this.generacion = generacion;
	}

	public String getNombreA() {
		return nombreA;
	}

	public void setNombreA(String nombreA) {
		this.nombreA = nombreA;
	}

	public String getGeneracion() {
		return generacion;
	}

	public void setGeneracion(String generacion) {
		this.generacion = generacion;
	}

	@Override
	public String toString() {
		return "Autor [nombreA=" + nombreA + ", generacion=" + generacion + "]";
	}
	
	
	
}
