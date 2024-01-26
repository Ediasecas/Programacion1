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
    				
    				System.out.println("Introduzca la matricula del coche a añadir");
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
        	        
        	        Map<String,Coche> parejas = new HashMap<String,Coche>();
        	        
        	        parejas.put(matriculaCoche, new Coche(colorCoche, marcaCoche));
        	        
    				
    			break;
		
    			
    			case 2: 
    				entrada.nextLine();
    				
    				System.out.println("Inttroduzca la matricula del coche a eliminar del taller");
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
    				
        	       t.eliminarCoche(matriculaCocheEliminar);
        	       
    			break;
		
    			
    			case 3:
    	
    				System.out.println("Usted salió del programa correctamente");
                    salir = true;

               break;
    				
    			case 4:
    				System.out.println("cambios");
    				
    		}//Switch		
		
		
		}while(!salir);
		
		 t.MostrarMatriculas();
		 t.MostrarCoche();
		 
		
		
	}//do while

	
}
