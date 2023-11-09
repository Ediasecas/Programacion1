package Examen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		int numInicial;
		
		
		
		System.out.println("Ingrese la cantidad de números a almacenar al iniciar el programa");
		numInicial = entrada.nextInt();
		
		int seleccionar;
		boolean salir = false;
		int numeros;
		int array1[] = new int[numInicial];
		int num_borr;
		int array2[] = new int[num_borr];
		int posic ;
		int num_borr1;
		
		do {
		
			System.out.println("1.Modificar la coleccion");
			System.out.println("2.Estadísticas de la coleccion");
			System.out.println("3.Ampliar el valor de la coleccion");
			System.out.println("4.Salir");
			System.out.println("Seleccione una opcion escogiendola por su numero");
			
			seleccionar = entrada.nextInt();
			
			switch(seleccionar)
			
			{
				
					case 1:
				
						System.out.println("Introduzca un numero/numeros");
						numeros = entrada.nextInt();
					
						for(int i=0; i<numInicial; i++)
					
						{
						
							System.out.println(array1[i]);
						
						}
					
						System.out.println("Que numero desea borrar de los numeros introducidos en una posicion especifica");
						num_borr1 = entrada.nextInt();
					
						array2[num_borr1] = new int[numInicial];
						
						System.out.println("La nueva coleccion es" + ( array2[num_borr1] = new int[numInicial]));
						
					
						System.out.println("Inserte la posicion de la coleccion a modificar");
						posic = entrada.nextInt();
					
						for(int i; i<numInicial; i++)
							
						{
						
							System.out.println("La coleccion con  numero modificado de la posicion" + posic +
									" es " + array2[i]);
						
						}
					
					
					break;
					
					
					case 2:
						
						int suma = 0;
						int media;
						
						for(int i=0; i<array1.length; i++)
						
						{
							
							suma += array1[i];
							media = suma / array1.length;
							
							System.out.println("La media de los valores no nulos es " + media);
							
							System.out.println("La suma de los valroes es "+ (suma += array1[i]));
							
						}
						
						
						
						System.out.println("El valor maximo de la coleccion es" + Math.max(array1[]));
						
						System.out.println("El valor minimo de la coleccion es" + Math.min(array1)[]);
						
						
					break;
					
					case 3:
						
						int num_ampliado;
						
						System.out.println("Introduce el numero en el que quieres ampliar la coleeccion");
						num_ampliado = entrada.nextInt();
						
						int array3 [] = new int[numInicial + num_ampliado];
						
								System.out.println(array3[]);
						
					break;
						
					case 4:
						
						System.out.println("Usted salió del programa correctamente");
						salir = true;
						
					break;
				
				
			}
			
			
			
			
		}
		
		while(!salir);
		
		
	}

}
