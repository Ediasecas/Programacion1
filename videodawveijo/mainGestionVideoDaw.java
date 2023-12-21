import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mainGestionVideoDaw {

	public static void main(String[] args) 
	
	{
		
		System.out.println("¡Bienvenidos a VideoDAW!");
		Scanner entrada = new Scanner(System.in);
		
		int seleccion;
		boolean salir = false;
		VideoDaw e1 = null;
		Pelicula peli = null;
		Cliente client = null;
		
		do {
			System.out.println("");
    		System.out.println("1. Crear y registrar VideoClub en la franquicia.");
    		System.out.println("2. Registrar película en videoclub. ");
    		System.out.println("3. Crear y registrar cliente en videoclub.");
    		System.out.println("4. Alquilar película. ");
    		System.out.println("5. Devolver película.");
    		System.out.println("6. Dar de baja cliente.");
    		System.out.println("7. Dar de baja película.");
    		System.out.println("8. Salir.");
    		seleccion = entrada.nextInt();
    		switch (seleccion) {
    		case 1:
    			System.out.println("");
    			System.out.println("Introduzca información sobre su videoclub: ");
    			System.out.println("Nombre: ");
    			String nombre =  entrada.next();
    			System.out.println("CIF: ");
    			String CIF = entrada.next();
    			Pattern pat = Pattern.compile("[A-Z]{1}[0-9]{8}");
    	        pat.matcher(CIF);
    	        Matcher mat = pat.matcher(CIF);
    	        while(!mat.matches()){
    	            System.out.println("CIF no válido. Introduzcalo de nuevo:");
    	            CIF = entrada.next();
    	            mat = pat.matcher(CIF);
    	        }
    	        System.out.println("Direccion: ");
    	        String Direccion2 = entrada.next();
    	        LocalDate FechaAlta =  LocalDate.now();
    	        System.out.println("Fecha de alta del videoclub: " + FechaAlta);
    			e1 = new VideoDaw (CIF, Direccion2, FechaAlta);
    	        break;    
    	        
    		case 2:
    			System.out.println("");
    			System.out.println("Nombre de la película: ");
    			String Titulo = entrada.next();
    			System.out.println("Codigo identificador de la película: ");
    			String Cod = entrada.next();
    			Pattern pat1 = Pattern.compile("[A-Z]{1}[0-9]{4}");
    	        pat1.matcher(Cod);
    	        Matcher mat1 = pat1.matcher(Cod);
    	        while(!mat1.matches()){
    	            System.out.println("Código no válido. Introduzcalo de nuevo:");
    	            Cod = entrada.next();
    	            mat1 = pat1.matcher(Cod);
    	        }
    	        
    	        LocalDate FechaRegistro = LocalDate.now();
    	        System.out.println("Fecha de registro de la película: " + FechaRegistro);
    	        System.out.println("Tipo de película: ");
    	        int genero;
    	        Genero generoPelicula = null;
    	        do {
    	        System.out.println("Seleccione el género de la película: ");
    	        System.out.println("");
    	        System.out.println("1.Terror");
    	        System.out.println("2.Ciencia Ficción");
    	        System.out.println("3.Comedia");
    	        System.out.println("4.Española");
    	        System.out.println("5.Thriller");
    	        System.out.println("6.Drama");
	    	    genero = entrada.nextInt();
	    	        if (genero == 0) {
	    	        	generoPelicula = Genero.TERROR;
	    	        }else if (genero == 1) {
	    	        	generoPelicula = Genero.CIENCIAFICCION;
	    	        }else if (genero == 3) {
	    	        	generoPelicula = Genero.COMEDIA;
	    	        }else if (genero == 4) {
	    	        	generoPelicula = Genero.ACCION;
	    	        }else if (genero == 5) {
	    	        	generoPelicula = Genero.AVENTURAS;
	    	        }
    	        }while(genero >= 7);
    	        
    	        peli = new Pelicula(Cod, Titulo, FechaRegistro, generoPelicula);
    	        e1.registrarPelicula(peli);
    	        break;
    	     
    	        
    		case 3: 
    			System.out.println("");
    			System.out.println("Nombre del cliente: ");
    			String Nombre = entrada.next();
    			System.out.println("DNI: ");
    			String DNI = entrada.next();    			
    			Pattern pat4 = Pattern.compile("[A-Z]{8}[0-9]{1}");
    	        pat4.matcher(DNI);
    	        Matcher mat4 = pat4.matcher(DNI);
    	        while(!mat4.matches()){
    	            System.out.println("DNI no válido. Introduzcalo de nuevo:");
    	            DNI = entrada.next();
    	            mat4 = pat4.matcher(DNI);
    	        }
    			System.out.println("Direccion: ");
    			String Direccion = entrada.next();
    			System.out.println("Fecha de nacimiento: ");
    			String FechaNacimiento = entrada.next();
    			int contadorSocio = 0;
    			client = new Cliente (DNI, Nombre, Direccion, FechaNacimiento, contadorSocio);
    			e1.registrarCliente(client);
    			break;
    			
    			
    		case 4:
    			System.out.println("");
    			System.out.println("Código de la película: ");
    			String Codigo = entrada.next();
    			Pattern pat3 = Pattern.compile("[A-Z]{8}[0-9]{1}");
    	        pat3.matcher(Codigo);
    	        Matcher mat3 = pat3.matcher(Codigo);
    	        while(!mat3.matches()){
    	            System.out.println("Código no válido. Introduzcalo de nuevo:");
    	            Codigo = entrada.next();
    	            mat1 = pat3.matcher(Codigo);
    	        }
    	        e1.alquilarPelicula(peli, client);
    	        System.out.println("¡Película Alquilada!");
    		case 5:
    			System.out.println("");
    			System.out.println("Código de la película a devolver: ");
    			String Codigo2 = entrada.next();
    			Pattern pat5 = Pattern.compile("[A-Z]{8}[0-9]{1}");
    	        pat5.matcher(Codigo2);
    	        Matcher mat5 = pat5.matcher(Codigo2);
    	        while(!mat5.matches()){
    	            System.out.println("Código no válido. Introduzcalo de nuevo:");
    	            Codigo2 = entrada.next();
    	            mat5 = pat5.matcher(Codigo2);
    	        }
    	        e1.devolverPelicula(peli, client);
    	        System.out.println("¡Película devuelta!");
    	        
    		case 6:
    			System.out.println("");
    			System.out.println("Escriba el DNI de la persona a la cual quieras dar de baja");
    			String dni = entrada.next();
    			Pattern pat2 = Pattern.compile("[A-Z]{8}[0-9]{1}");
    	        pat2.matcher(dni);
    	        Matcher mat2 = pat2.matcher(dni);
    	        while(!mat2.matches()){
    	            System.out.println("DNI no válido. Introduzcalo de nuevo:");
    	            dni = entrada.next();
    	            mat2 = pat2.matcher(dni);
    	        }
    			Cliente c_borrar = e1.obtenerDni(dni);
    			e1.darBajaCliente(c_borrar);
    			//
    		case 7:
    			System.out.println("");
    			System.out.println("Escriba el Código de la persona a la cual quieras dar de baja");
    			String Codigo1 = entrada.next();
    			Pattern pat6 = Pattern.compile("[A-Z]{8}[0-9]{1}");
    	        pat6.matcher(Codigo1);
    	        Matcher mat6 = pat6.matcher(Codigo1);
    	        while(!mat6.matches()){
    	            System.out.println("Código no válido. Introduzcalo de nuevo:");
    	            Codigo1 = entrada.next();
    	            mat6 = pat6.matcher(Codigo1);
    	        }
    	        Pelicula p_borrar = e1.obtenerCodigo(Codigo1);
    	        e1.darBajaPelicula(p_borrar);
    
    			
    		}//selección
		
		}while(!salir);
		// TODO Auto-generated method stub

	}

}
