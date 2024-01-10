package herencia1;

import java.util.Scanner;

public class main {

	private static final String a = null;

	public static void main(String[] args) 
	{
		
		System.out.println("Sistema solar");
		Scanner entrada = new Scanner(System.in);

		Astros[] AstrosColeccion;
		
		int seleccionar;
		boolean salir = false;
		
		do {
			
    		System.out.println("1. Astros. ");
    		System.out.println("2. Planetas. ");
    		System.out.println("3. Satelites.");
    		System.out.println("4. Salir. ");
    		
    		seleccionar = entrada.nextInt();
			 
			switch(seleccionar)
			{
			
				case 1:
					System.out.println("Informacion del astro");
					
					
				break;
			
			}
    		
    		
		}while(!salir);
		
		
		
		
		
		
	}

}//main
