package herencia1;

public class Satelites extends Astros{

	
	private String distPlanet;
	private String orbitPlanetaria;
	private String planetPertenece;
	
	
	public Satelites(String radEcuat, String rotEje, String masa, String tempMedia, String gravedad,String distPlanet, String orbitPlanetaria, String planetPertenece) 
	{
		super(radEcuat, rotEje, masa, tempMedia, gravedad);
		this.distPlanet = distPlanet;
		this.orbitPlanetaria = orbitPlanetaria;
		this.planetPertenece = planetPertenece;
	}


	
	public String getDistPlanet()
	{
		return distPlanet;
	}


	public void setDistPlanet(String distPlanet) 
	{
		this.distPlanet = distPlanet;
	}

	

	public String getOrbitPlanetaria() 
	{
		return orbitPlanetaria;
	}


	public void setOrbitPlanetaria(String orbitPlanetaria)
{
		this.orbitPlanetaria = orbitPlanetaria;
	}

	

	public String getPlanetPertenece() 
	{
		return planetPertenece;
	}


	public void setPlanetPertenece(String planetPertenece)
	{
		this.planetPertenece = planetPertenece;
	}
	
	public String mostrarInfoAstro()
	{
		String info = super.mostrarInfoAstro();
		info += ", Distancia al Planeta: " + this.distPlanet + ", Orbita al Planeta: " + this.orbitPlanetaria + ", Planeta al que pertenece: " + this.planetPertenece;
		return info;
	}



	@Override
	public void info(Astros a) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}//class Satelites
