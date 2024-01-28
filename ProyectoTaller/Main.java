import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) 
	{
		

		Taller t = new Taller();
		
		
		System.out.println("¡Bienvenidos al taller de Decroly!!");
		Scanner entrada = new Scanner(System.in);
		
		int seleccion;
		boolean salir = false;
		
		
		do 
		{
			
			System.out.println("Seleccione una opcion del menu del escogiendola por su num (1-3)");
    		System.out.println("1. Añadir coche.");
    		System.out.println("2. Eliminar coche. ");
    		System.out.println("3. Salir.");
    		seleccion = entrada.nextInt();
    		switch (seleccion) 
    		{
    			case 1:
    				entrada.nextLine();
    				
    				System.out.println("Introduzca los datos del coche a añadir");
    				System.out.println("-----------------");
    				
    				System.out.println("Introduzca el color del coche a añadir");
    				String colorCoche  = entrada.nextLine();
    				
    				System.out.println("Introduzca la marca del coche a añadir");
    				String marcaCoche  = entrada.nextLine();
    				
    				System.out.println("Introduzca la matrícula del coche a añadir");
    				String matriculaCoche  = entrada.nextLine();
    				
    				Pattern pat = Pattern.compile("[0-9]{4}[A-Z]{3}");
        	        pat.matcher(matriculaCoche);
        	        Matcher mat = pat.matcher(matriculaCoche);
        	        while(!mat.matches())
        	        {
        	            System.out.println("Matrícula no válida. Introduzcalo de nuevo:");
        	            matriculaCoche = entrada.next();
        	            mat = pat.matcher(matriculaCoche);
        	        }
        	        
        	        
        	        if (t.anadirCoche(matriculaCoche, new Coche(colorCoche, marcaCoche)))
        	        {
                        System.out.println("Coche con matrícula" + matriculaCoche + "añadido correctamente.");
                    } else 
                    {
                        System.out.println("Ya existe un coche con la misma matrícula en la colección.");
                    }
        	        
    				
    			break;
		
    			
    			case 2: 
    				entrada.nextLine();
    				
    				System.out.println("Introduzca la matricula del coche a eliminar del taller");
    				String matriculaCocheEliminar  = entrada.nextLine();
    				
    				Pattern pat1 = Pattern.compile("[0-9]{4}[A-Z]{3}");
        	        pat1.matcher(matriculaCocheEliminar);
        	        Matcher mat1 = pat1.matcher(matriculaCocheEliminar);
        	        while(!mat1.matches())
        	        {
        	            System.out.println("Matrícula no válida. Introduzcalo de nuevo:");
        	            matriculaCocheEliminar = entrada.next();
        	            mat1 = pat1.matcher(matriculaCocheEliminar);
        	        }
    				
        	        
        	        if (t.eliminarCoche(matriculaCocheEliminar)) 
        	        {
        	            System.out.println("Coche con matrícula " + matriculaCocheEliminar + " eliminado correctamente.");
        	        } else 
        	        {
        	            System.out.println("No se pudo eliminar el coche.");
        	        }
        	       
    			break;
		
    			
    			case 3:
    	
    				System.out.println("Usted salió del programa correctamente");
                    salir = true;

               break;
    				
    	
    				
    		}//Switch		
		
		
		}while(!salir);
		
		
		System.out.println("\n \n ");
		
		t.MostrarMatriculas();
		System.out.println("\n  ");
		
		t.MostrarCoche();
		System.out.println("\n  ");
		 
		t.MostrarTaller();
		
		
	}//do while

	
}
