import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) 
	{
		
		Agenda a = new Agenda();
		
		System.out.println("Bienvenidos a la Agenda de Decroly");
		Scanner entrada = new Scanner(System.in);
		
		int seleccion;
		boolean salir = false;
		
		
		do 
		{
			
			System.out.println("Seleccione una opcion del menu del escogiendola por su num (1-3)");
    		System.out.println("1. Añadir contacto");
    		System.out.println("2. Buscar contacto ");
    		System.out.println("3. Eliminar contacto");
    		System.out.println("4. Visualizar agenda");
    		System.out.println("5. Número de contactos de mi agenda");
    		System.out.println("6. Salir");
    		seleccion = entrada.nextInt();
    		
    		
    		switch (seleccion) 
    		{
    		
	    		case 1:
					entrada.nextLine();
					
					System.out.println("Introduzca los datos del contacto a añadir");
					System.out.println("-----------------");
	
					
					System.out.println("Introduzca el nombre del contacto a añadir");
					String nombreContacto  = entrada.nextLine();
					
					Pattern pat = Pattern.compile("^[A-Z][a-zA-Z]*$");
	    	        pat.matcher(nombreContacto);
	    	        Matcher mat = pat.matcher(nombreContacto);
	    	        while(!mat.matches())
	    	        {
	    	            System.out.println("Nombre no válido. Introduzcalo de nuevo:");
	    	            nombreContacto = entrada.next();
	    	            mat = pat.matcher(nombreContacto);
	    	        }
	    		
	    	        
	    	        
	    	       
	    	        
	    	        System.out.println("Introduzca el numero de telefono del contacto a añadir");
					String numTelefonoContacto  = entrada.nextLine();
					
					Pattern pat2 = Pattern.compile("^[6,7,9][0-9]{8}");
	    	        pat2.matcher(numTelefonoContacto);
	    	        Matcher mat2 = pat2.matcher(numTelefonoContacto);
	    	        while(!mat2.matches())
	    	        {
	    	            System.out.println("Numero no válido. Introduzcalo de nuevo:");
	    	            numTelefonoContacto = entrada.next();
	    	            mat2 = pat2.matcher(numTelefonoContacto);
	    	        }
	    	        
	    	        
	    	        
	    	      
	    	        
	    	        System.out.println("Introduzca el correo electronico del contacto a añadir");
					String correoElContacto  = entrada.nextLine();
					
					Pattern pat3 = Pattern.compile("^[A-Z][a-zA-Z]*$");
	    	        pat3.matcher(correoElContacto);
	    	        Matcher mat3 = pat3.matcher(correoElContacto);
	    	        while(!mat3.matches())
	    	        {
	    	            System.out.println("Correo no válido. Introduzcalo de nuevo:");
	    	            correoElContacto = entrada.next();
	    	            mat3 = pat3.matcher(correoElContacto);
	    	        }
	    	        
	
	    	        
	    	        if (a.anadirContacto(nombreContacto,new Contacto(nombreContacto, numTelefonoContacto, correoElContacto)))
	    	        {
	                    System.out.println("Contacto con nombre " + nombreContacto + " añadido correctamente.");
	                } 
	    	        
	    	        else 
	                {
	                    System.out.println("Ya existe un contacto con el mismo nombre en la agenda");
	                }
	    	        
					
				break;
				
				
				
	    		case 2:
	    			entrada.nextLine();
	    			
	    			
	    			System.out.println("Introduzca el nombre a buscar en la agenda");
	    			String nombreBuscar = entrada.nextLine();
	    			
	    			Contacto contactEncontrado = a.buscarContacto(nombreBuscar);
	    			
	    			if (contactEncontrado != null )
		    	    {
		                System.out.println("Contacto con nombre " + nombreBuscar + " encontrado en la agenda correctamente.");
		            } 
		    	        
		    	    else 
		            {
		                System.out.println("Contacto no encontrado");
		            }
    	        
	    		break;
	    		
	    		
	    		
	    		case 3:
	    			entrada.nextLine();
	    			System.out.println("Introduzca el nombre del contacto a eliminar de la agenda");
    				String nombreContactoEliminar  = entrada.nextLine();
    				
    				Pattern pat5 = Pattern.compile("^[A-Z][a-zA-Z]*$");
	    	        pat5.matcher(nombreContactoEliminar);
	    	        Matcher mat5 = pat5.matcher(nombreContactoEliminar);
	    	        while(!mat5.matches())
	    	        {
	    	            System.out.println("Nombre no válido. Introduzcalo de nuevo:");
	    	            nombreContacto = entrada.next();
	    	            mat5 = pat5.matcher(nombreContacto);
	    	        }
    				
        	        
        	        if (a.eliminarContacto(nombreContactoEliminar)) 
        	        {
        	            System.out.println("Contacto con nombre " + nombreContactoEliminar + " eliminado correctamente.");
        	        }
        	        
        	        else 
        	        {
        	            System.out.println("No se pudo eliminar el contacto.");
        	        }
	    			
	    		break;
    	        
	    		
	    		
	    		case 4:
    	        
    	        a.MostrarAgenda();
    	        
    	        break;
    	        
    	        
	    		case 5:
	    			
	    		System.out.println("Numero de contactos de mi agenda");
    	        a.NumContactosAgenda();
    	        
    	        break;
    	        
    	        
    	        
	    		case 6:
	    		
    				System.out.println("Usted salió del programa correctamente");
                    salir = true;
                    
                break;
    	        
    		
    		}//Switch
    		
    	

		}while(!salir);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
