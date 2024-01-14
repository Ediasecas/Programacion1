package herencia1;

public abstract class Astros {

	
	private String radEcuat;
	private String rotEje;
	private String masa;
	private String tempMedia;
	private String gravedad;
	
	
	public Astros( String radEcuat, String rotEje, String masa, String tempMedia, String gravedad)
	{
		super();
		this.radEcuat = radEcuat;
		this.rotEje = rotEje;
		this.masa = masa;
		this.tempMedia = tempMedia;
		this.gravedad = gravedad;
	}


	
	public String getRadEcuat() 
	{
		return radEcuat;
	}


	public void setRadEcuat(String radEcuat) 
	{
		this.radEcuat = radEcuat;
	}

	

	public String getRotEje()
	{
		return rotEje;
	}


	public void setRotEje(String rotEje) 
	{
		this.rotEje = rotEje;
	}


	
	public String getMasa() 
	{
		return masa;
	}


	public void setMasa(String masa)
	{
		this.masa = masa;
	}


	
	public String getTempMedia()
	{
		return tempMedia;
	}


	public void setTempMedia(String tempMedia) 
	{
		this.tempMedia = tempMedia;
	}


	
	public String getGravedad() 
	{
		return gravedad;
	}


	public void setGravedad(String gravedad) 
	{
		this.gravedad = gravedad;
	}
	
	
	public abstract void info (Astros a);
	
	public String mostrarInfoAstro()
	{
		String info = "";
		info =  "Radio Ecuatorial: " + this.radEcuat + "km, " + "Rotacion sobre su Eje: " + this.rotEje + "horas en dar una vuelta sobre si mismo, " + "Masa: " + this.masa +"kg, "+ "Temperatura Media: " + this.tempMedia +"ºC, "
					+ "gravedad: " + this.gravedad + "m/s^2";
		return info;
	}

	
	
}//clase Astros
