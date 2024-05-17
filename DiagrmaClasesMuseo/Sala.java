import java.util.LinkedList;
import java.util.List;

public class Sala 
{
	private int numSala;
	private int tamaño;
	private int aforo;
	private String numTlfn;
	private List<Cuadro> listaCuadrosExps = new LinkedList<>();

	public Sala(int numSala, int tamaño, int aforo, String numTlfn) 
	{
		super();
		this.numSala = numSala;
		this.tamaño = tamaño;
		this.aforo = aforo;
		this.numTlfn = numTlfn;
	}

	public int getNumSala() {
		return numSala;
	}

	public void setNumSala(int numSala) {
		this.numSala = numSala;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public int getAforo() {
		return aforo;
	}

	public void setAforo(int aforo) {
		this.aforo = aforo;
	}

	public String getNumTlfn() {
		return numTlfn;
	}

	public void setNumTlfn(String numTlfn) {
		this.numTlfn = numTlfn;
	}

	@Override
	public String toString() {
		return "Sala [numSala=" + numSala + ", tamaño=" + tamaño + ", aforo=" + aforo + ", numTlfn=" + numTlfn + "]";
	}
	
	
	
	
}
