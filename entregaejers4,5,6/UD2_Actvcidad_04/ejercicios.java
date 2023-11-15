package ud2_actividad3;

import java.util.Scanner;

public class ejercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
	//EJERCICIO 1 	
		
		System.out.println("Introduzca una cantidad de dinero multiplo de 5");
		int dinero = entrada.nextInt();
		
		if ( dinero % 5 == 0) 
		
		{
			
		int dineroRes = dinero;
		int billetes500 = 0;
		int billetes200= 0;
		int billetes100= 0;
		int billetes50= 0;
		int billetes20= 0;
		int billetes10= 0;
		int billetes5= 0;
		
			int din500 = dinero / 500;
			if (din500 >= 1) 
			
			{
				
				billetes500 = din500;
				dineroRes = dinero % 500;
				
			}
			
			
			int din200 = dineroRes / 200;
			if (din200 >= 1)
			
			{
				billetes200 = din200;
				dineroRes = dineroRes % 200;
			
			}
			
			
			int din100 = dineroRes / 100;
			if (din100 >= 1) 
			
			{
				billetes100 = din100;
				dineroRes = dineroRes % 100;
				
			}
			
			int din50 = dineroRes / 50;
			if (din100 >= 1) 
			
			{
				
				billetes50 = din50;
				dineroRes = dineroRes % 50;
				
			}
			
			int din20 = dineroRes / 20;
			if (din20 >= 1) 
			
			{
				
				billetes20 = din20;
				dineroRes = dineroRes % 20;
				
			}
			
			int din10 = dineroRes / 10;
			if (din10 >= 1)
			
			{
				
				billetes10 = din10;
				dineroRes = dineroRes % 10;
				
			}
			
			int din5 = dineroRes / 5;
			if (din5 >= 1)
			
			{
				
				billetes5 = din5;
				dineroRes = dineroRes % 5;
				
			}
			
			
			System.out.println("Hay " + billetes500 + " billete/s de 500," + billetes200 + " billete/s de "
					+ "200," + billetes100 + " billete/s de 100," + billetes50 + " billete/s de 50," + billetes20 + ""
					+ " billete/s de 20," + billetes10 + " billete/s de 10 y " + billetes5 + " billete/s de 5");
			
		}
		
		else  
		
		{
			
			System.out.println ("El importe no es multiplo de 5");
		
		
		}
	
	
	
		
		//EJERCICIO2
		
		boolean salir = false;
		int seleccionar; //escoger entre todas las opciones
		int num1; //num1 introducido
		int num2; //num2 introducido
		int total; //resultado de la operacion 
		
		do {
        	
	    		System.out.println("1. Sumar.");
	    		System.out.println("2. Restar.");
	    		System.out.println("3. Multiplicar.");
	    		System.out.println("4. Dividir.");
	    		System.out.println("5. Salir.");
	    		System.out.println("Seleccione una opción, escogiendola por su numero");
	    		
	    		seleccionar = entrada.nextInt();
	    	
	    		switch (seleccionar)
	    	
	    		{
	           
	    		case 1:
	                
	    				System.out.println("SUMA:");
	    			
	    				System.out.println("Primer Número: ");
	    				num1 = entrada.nextInt();
	                
	    				System.out.println("Segundo Número: ");
	    				num2 = entrada.nextInt();
	                
	    				total = num1 + num2;
	    				System.out.println("El resultado de la operacion es "+ total);
	                
	    				break;
	                
	    		case 2:
	               
	    				System.out.println("RESTA: ");
	    			
	    				System.out.println("Primer Número: ");
	    				num1 = entrada.nextInt();
	                
	    				System.out.println("Segundo Número: ");
	    				num2 = entrada.nextInt();
	                
	    				total = num1 - num2;
	    				System.out.println("El resultado de la operacion es "+ total);
	                
	    				break;
	                
	    		case 3:
	    		
	    				System.out.println("MULTIPLICAR: ");
	                
	    				System.out.println("Primer Número: ");
	    				num1 = entrada.nextInt();
	                
	    				System.out.println("Segundo Número: ");
	    				num2 = entrada.nextInt();
	                
	    				total = num1 * num2;
	    				System.out.println("El resultado de la operacion es "+ total);
	                
	    				break;
	               
	    		case 4:
	    		
	                	System.out.println("DIVIDIR");
	                
		                System.out.println("Primer Número");
		                num1 = entrada.nextInt();
		                
			                System.out.println("Segundo Número");
			                num2 = entrada.nextInt();
		                
		                total = num1 / num2;
		                System.out.println("El resultado de la operacion es "+ total);
		                
		                break;
		                
		    	case 5:
		    		
		            	System.out.println("Programa finalizado");
		            	salir = true;
		                break;
	         
	                
	    		}
        
			}
		
		while (!salir);
	
	}//cuerpo del ejercicio
}//acttividad3

		
	
		
	