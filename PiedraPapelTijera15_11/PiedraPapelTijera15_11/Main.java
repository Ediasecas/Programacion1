package PiedraPapelTijera15_11;

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
				
				System.out.println("Para el piedra papel o tijera hay 6 casos, con 3 diferentes opciones a jugar: Piedra(P), Papel(L), Tijera(T)");
				System.out.println("Cuando el jugador escoja piedra y la maquina tijera por lo tanto el jugador ganará, o viceversa; (P>T) = (T<P)");
				System.out.println("Cuando el jugador escoja tijera y la maquina papel por lo tanto el jugador ganará, o viceversa; (T>L) = (L<T)");
				System.out.println("Cuando el jugador escoja papel y la maquina piedra por lo tanto el jugador ganará, o viceversa; (L>P) = (P<L)");
			
				break;
			

			case 2:
			
				String P, L, T;
				String jugadaPc;
				
				System.out.println("Generacion de la jugada del PC...");
			
				System.out.println("Inserte piedra(P), papel(L) ó tijera(T)");
				String jugadaJugador = entrada.nextLine();
				
				if(jugadaJugador == P)
				
				{
					
					
					
				}
			
				break;
				
			default:
				
				System.out.println("Programa finalizado");
				salir = true;
				
				break;
				
			}
			
		}
		
		while(!salir);
	
		
	}//main

}//class
