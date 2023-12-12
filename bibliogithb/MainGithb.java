import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Biblioteca [] bibliosSantander = new Biblioteca[100];
		
		bibliosSantander[0] = new Biblioteca(25);
		
		final String formatoCif = "";
		final String formatoDni = "";
		final String formatoIban = "";		
		Biblioteca miBiblio;
		
		//Opcion 1 registrar
		
		validadorTexto("X123456789iok", formatoCif);
		
		
		Biblioteca jadoBiblio = new Biblioteca(50);
		jadoBiblio.setNombre("Biblioteca Jado");
		jadoBiblio.setDireccion("Paseo de General Davila, 73");
		jadoBiblio.setTelefono("942-33-33-33");
		jadoBiblio.setEmail("bibliotecajado@santander.com");
		jadoBiblio.setHorario("9H a 20H");
		
		Libro l1 = new Libro("El señor de los anillos", 532, "JRR Tolkien",
				Genero.OBRA_MAESTRA, "Minotauro", "EDSLA001", 1945);
		Libro l2 = new Libro("Las Dos Torres", 567, "JRR Tolkien",
				Genero.OBRA_MAESTRA, "Minotauro", "EDSLA002", 1947);
		Libro l3 = new Libro("El Retorno del Rey", 589, "JRR Tolkien",
				Genero.OBRA_MAESTRA, "Minotauro", "EDSLA003", 1950);
		
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Inserte el titulo del libro: ");
		String titulo = reader.nextLine();
		
		System.out.println("Inserte el Autor del libro: ");
		String autor = reader.nextLine();
		
		System.out.println("Inserte la editorial del libro: ");
		String editorial = reader.nextLine();
		
		System.out.println("Inserte el ISNB del libro: ");
		String ISBN = reader.nextLine();
		
		
		System.out.println("Inserte el numero de paginas del libro: ");
		int nPaginas = reader.nextInt();
		
		System.out.println("Inserte el año de publicacion del libro: ");
		int aPublicacion = reader.nextInt();
		
		System.out.println("Inserte el genero del libro: ");
		String genero = reader.nextLine();
		
		Genero generoSeleccionado = Genero.OTROS;
		if(genero.equalsIgnoreCase(Genero.FANTASIA.toString())) 
		{
			generoSeleccionado = Genero.FANTASIA;
		}
		else if(genero.equalsIgnoreCase("scifi")) {
			generoSeleccionado = Genero.SCIFI;
			
		}
		
		Libro l4 = new Libro(titulo,nPaginas, autor, generoSeleccionado, editorial, ISBN, aPublicacion);
		

		if(jadoBiblio.insertarLibro(l1) == true)
		{
			System.out.println("El libro se ha insertado correctamente");
		}
		else {
			System.out.println("El libro NO se ha insertado correctamente");
			
		}
		
		if(jadoBiblio.insertarLibro(l2) == true)
		{
			System.out.println("El libro se ha insertado correctamente");
		}
		else {
			System.out.println("El libro NO se ha insertado correctamente");
			
		}
		
		if(jadoBiblio.insertarLibro(l3) == true)
		{
			System.out.println("El libro se ha insertado correctamente");
		}
		else {
			System.out.println("El libro NO se ha insertado correctamente");
			
		}
		
		if(jadoBiblio.insertarLibro(l3) == true)
		{
			System.out.println("El libro se ha insertado correctamente");
		}
		else {
			System.out.println("El libro NO se ha insertado correctamente");
			
		}

		jadoBiblio.mostrarInfoBiblioteca();
		
		jadoBiblio.eliminarLibro(l3);
		
		jadoBiblio.mostrarInfoBiblioteca();
		
		jadoBiblio.eliminarLibro(l1);
		
		jadoBiblio.mostrarInfoBiblioteca();
				

		if(jadoBiblio.insertarLibro(l3) == true)
		{
			System.out.println("El libro se ha insertado correctamente");
		}
		else {
			System.out.println("El libro NO se ha insertado correctamente");
			
		}
		
		jadoBiblio.mostrarInfoBiblioteca();
		
		

	}

	
	public static boolean validadorTexto(String texto, String patron)
	{
		return true;
	}
}
