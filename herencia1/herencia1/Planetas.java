package herencia1;

public class Planetas extends Astros {

	private String distSol;
	private String orbitSol;
	private boolean satelites;
	public Satelites[] Satelites;
	
	
	public Planetas(String radEcuat, String rotEje, String masa, String tempMedia, String gravedad, String distSol, String orbitSol, boolean satelites) 
	{
		super(radEcuat, rotEje, masa, tempMedia, gravedad);
		this.distSol = distSol;
		this.orbitSol = orbitSol;
		this.satelites = satelites;
		this.Satelites = new Satelites[6];
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
	
	
	
	public Satelites[] getSatelites() 
	{
	    return Satelites;
	}

	
	public void setSatelites(Satelites[] Satelites)
	{
	    Satelites = Satelites;
	}

	
	
	public String mostrarInfoAstro()
	{
		
		String info = super.mostrarInfoAstro();
		info += ", Distancia al Sol: " + this.distSol + ", Orbita al Sol: " + this.orbitSol + ", ¿Tiene Satelites? " + this.satelites;
		return info;
	}



	@Override
	public void info(Astros a) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}//clase planetas
