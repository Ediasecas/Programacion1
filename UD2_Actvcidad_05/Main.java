import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		//EJERCICIO 1 
		
	   String  cadenatxt;
	   System.out.println("Introduce un texto: "); 
	   
	   cadenatxt = entrada.nextLine();
	   
	   String [] palabras = cadenatxt.split(" "); //Crear array para que almacene todas las palabras del text pedido

	   for(int i = 0; i <palabras.length; i++) //Array con longitud de la primera palabra del texto a la ultima
	      
	   {
	           
		   System.out.println(palabras[i]); //el array "palabras" en cada posicion de i 
	    	   
	   }

		
	    //EJERCICIO 2
		
	   System.out.println("Introduce el texto 1");
	   String cadena1 = entrada.nextLine();
	   
	   System.out.println("Introduce el texto  2");
	   String cadena2 = entrada.nextLine();
		
	   if (cadena1.equalsIgnoreCase(cadena2)) //Importante equalsIgnoreCase para no diferenciar entre Mayus y Minuss
		
	   {
			
		   System.out.println("La cadenas de texto 1 y 2 son iguales");

	   } 
		
	   else 
		
	   {
			
		   System.out.println("Las cadenas de texto 1 y 2 no son iguales");
		
	   }
	
	   
	   
		// EJERCICIO 3
		
		System.out.println("Introduce un nombre");
		String nombre = entrada.nextLine();
		
		System.out.println("Introduce el primer apellido");
		String prim_apellido = entrada.nextLine();
		
		System.out.println("Introduce el segundo apellido");
		String seg_apellido = entrada.nextLine();
		
		String concatenacion = nombre.substring(0,3) + prim_apellido.substring(0,3) + seg_apellido.substring(0,3);//substring para usar los 3 primeros caracteres NUÑEZ = NUÑ
		concatenacion = concatenacion.toUpperCase();//SIRVE PARA CONVERTIR EL STRING CONCAT... EN MAYUS TODO EL TEXT
		
		System.out.println("La concatenacion de los 3 primeros careacteres del nombre " + nombre + ", con "
				+ " primer apellido " + prim_apellido + "  y segundo apellido " + seg_apellido +
				" es " + concatenacion);
		
		
		
		//EJERCICIO 4
		
		System.out.println("Introduzca una oracion");
		
		String vocales = entrada.nextLine();
		vocales = vocales.replace(" ", " ");
		int num_A = 0;
		int num_E = 0;
		int num_I = 0;
		int num_O = 0;
		int num_U = 0;
		
				
		for(int i = 0; i < vocales.length(); i++)
		
		{		
			if (vocales.charAt(i)=='a') //Cuando recorremos  el  "for" cuando esté en la posicion i=a, sumar una unidad de a's
			
			{
				num_A++;
				
			}
			
			if (vocales.charAt(i)== 'e') 
			
			{
				num_E++;
				
			}
			
			if (vocales.charAt(i)=='i') 
			
			{
				num_I++;
				
			}
			
			if (vocales.charAt(i)== 'o') 
			
			{
				num_O++;
				
			}
			
			if (vocales.charAt(i)== 'u')
			
			{
				
				num_U++;
				
			}
			
		}

		System.out.println("Hay " + num_A + " A");
		System.out.println("Hay " + num_E + " E");
		System.out.println("Hay " + num_I + " I");
		System.out.println("Hay " + num_O + " O");
		System.out.println("Hay " + num_U + " U");

		
		
		//EJERCICIO 5
		
		System.out.println("Introduce una frase");
		String palindromo = entrada.nextLine();
		
		palindromo = palindromo.replace(" ", " ");//Quita espacios
		
		
		if(palindromo.equalsIgnoreCase)
		
		{
			
			
		}
		
		
		
     
     
     
	}//MAIN

}//EJERC5

