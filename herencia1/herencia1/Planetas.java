package herencia1;

public class Planetas extends Astros {

	private String distSol;
	private String orbitSol;
	private boolean satelites;
	
	
	public Planetas(String radEcuat, String rotEje, String masa, String tempMedia, String gravedad,String distSol, String orbitSol, boolean satelites) 
	{
		super(radEcuat, rotEje, masa, tempMedia, gravedad);
		this.distSol = distSol;
		this.orbitSol = orbitSol;
		this.satelites = satelites;
	}

	

	public String getDistSol()
	{
		return distSol;
	}


	public void setDistSol(String distSol) 
	{
		this.distSol = distSol;
	}


	
	public String getOrbitSol()
	{
		return orbitSol;
	}


	public void setOrbitSol(String orbitSol) 
	{
		this.orbitSol = orbitSol;
	}


	
	public boolean isSatelites() 
	{
		return satelites;
	}


	public void setSatelites(boolean satelites)
	{
		this.satelites = satelites;
	}
	
	public void mostrarInfoAstro()
	{
		String infoAstro = "radEcuat" + super.radEcuat + "rotEje" + super.rotEje + "tempMedia" + super.tempMedia 
				+ "gravedad" + super.gravedad;
	}
	
	
	
	
}//clase planetas
