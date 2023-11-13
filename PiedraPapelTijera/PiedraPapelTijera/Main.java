package PiedraPapelTijera;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner entrada = new Scanner(System.in);
		
		int seleccionar;
		boolean salir = false;
				
	
		
		do
		
		{
			
			System.out.println("JUEGO PIEDRA, PAPEL, TIJERA VS PC");
			
			System.out.println("1.Explicacion del juego ");
			System.out.println("2.Jugar: ");
			
			System.out.println("Selecciona una opcion 1 ó 2:");
			seleccionar = entrada.nextInt();
			
			switch (seleccionar)
			
			{
			
			case 1:
				System.out.println("Para el piedra papel o tijera hay 3 casos");
				
			

			case 2:
			System.out.println("Generacion de la jugada del PC");
			
			System.out.println("Inserte piedra(P), papel(L) ó tijera(T)");
			String jugada = entrada.nextLine();
			
			}
			
		}
		
		while(!salir);
	
		
	}

}
