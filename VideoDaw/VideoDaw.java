import java.time.LocalDate;

public class VideoDaw{

	private String CIF;
	private String Direccion2;
	private LocalDate FechaAlta;
	private Pelicula[] PelículasRegistradas;
	private Cliente [] ClientesRegistrados;
	private int NumPelisRegistradas;
	private int NumClientesRegistrados;

	
	public VideoDaw(String CIF, String Direccion2, LocalDate FechaAlta){
		
		this.CIF = CIF;
		this.Direccion2 = Direccion2;
		this.FechaAlta = LocalDate.now();
		this.ClientesRegistrados = new Cliente[100];
		this.PelículasRegistradas = new Pelicula[100];
	}
	
	
	public String getCIF() {
		return CIF;
	}
	
	
	public void setCIF(String cIF) {
		CIF = cIF;
	}
	
	
	public String getDireccion2() {
		return Direccion2;
	}
	
	
	public void setDireccion2(String direccion2) {
		Direccion2 = direccion2;
	}
	
	
	public LocalDate getFechaAlta() {
		return FechaAlta;
	}
	
	
	public void setFechaAlta(LocalDate fechaAlta) {
		FechaAlta = fechaAlta;
	}
	
	
	public Pelicula[] getPelículasRegistradas() {
		return PelículasRegistradas;
	}
	
	
	public void setPelículasRegistradas(Pelicula[] películasRegistradas) {
		PelículasRegistradas = películasRegistradas;
	}
	
	
	public Cliente[] getClientesRegistrados() {
		return ClientesRegistrados;
	}
	
	
	public void setClientesRegistrados(Cliente[] clientesRegistrados) {
		ClientesRegistrados = clientesRegistrados;
	}
		
	public void mostrarInfoVideoClub(){
		String infovid = "CID" + this.CIF + "Direccion" + this.Direccion2 + "Fecha de Alta de peli" + this.FechaAlta;
		System.out.println(infovid);
	}
	
	public void mostrarClientesRegistrados(){
		String clientRegistrados = "Clientes" + this.ClientesRegistrados;
		System.out.println(clientRegistrados);
	}
	
	public void alquilarPelicula(Pelicula p, Cliente c) {
		
	}
	
	
	
	
}
