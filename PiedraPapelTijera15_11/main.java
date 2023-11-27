import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
		Scanner r1 = new Scanner(System.in);
		boolean salir = false;
		int seleccion;
		String eleccion; 
		System.out.println("¡Bienvenid@ a Piedra, Papel y Tijera!");
		do {
			
			System.out.println("");
        	System.out.println("Menu principal");
    		System.out.println("1. Jugar.");
    		System.out.println("2. Instrucciones.");
    		System.out.println("3. Salir.");
    		System.out.println("Seleccione una opción");
    		seleccion = r1.nextInt();
    	
    	switch (seleccion) {
            case 1:
            	int seleccionRival = (int)(Math.random() * 3);
                System.out.println("Jugar:");
                System.out.println("Elige piedra [P], papel[L] o tijera[T].");
                eleccion = r1.next();
                String jugadaPC = "";
                
                if(seleccionRival == 0) {
                	jugadaPC = "P";
                }
                if(seleccionRival == 1) {
                	jugadaPC = "L";
                }
                if(seleccionRival == 2) {
                	jugadaPC = "T";
                }
                j
                System.out.println("El rival ha seleccionado " + jugadaPC);
               
                if (eleccion.equals(jugadaPC)) {
              System.out.println ("Empate");
                }
                
                if (eleccion.equals("P")) {
                	if (jugadaPC.equals("L")) {
                		System.out.println("El rival ha seleccionado papel. PERDISTE.");
                	}if (jugadaPC.equals("T")){
                		System.out.println("El rival ha seleccionado tijera. GANASTE.");
                	}
                }
                if (eleccion.equals("L")) {
                	if (jugadaPC.equals("P")) {
                		System.out.println("El rival ha seleccionado piedra. GANASTE.");
                	}if (jugadaPC.equals("T")){
                		System.out.println("El rival ha seleccionado tijera. PERDISTE.");
                	}
                }
                if (eleccion.equals("T")) {
     				if (jugadaPC.equals("P")){
     					System.out.println("El rival ha seleccionado piedra. PERDISTE.");
     				}if (jugadaPC.equals("L")) {
     					System.out.println("El rival ha seleccionado papel. GANASTE.");
     				}
                }
     			
     			break;
    		
        
            case 2:
            	System.out.println ("Instrucciones:");
            	System.out.println ("1. Elija un elemento y acontinuación, el rival escojerá otro.");
            	System.out.println ("2. Dependiendo del elemento seleccionado cada uno, se ganará, perderá o empatará.");
            	System.out.println ("3. Ranking: ");
            	System.out.println ("3.1: Piedra gana tijera y pierde contra papel.");
            	System.out.println ("3.2: Papel gana a piedra y pierde contra tijera.");
            	System.out.println ("3.3: Tijera gana a papel y pierde contra piedra.");
            	break;
            	
            case 3:
            	salir = true;
            	System.out.println ("¡Hasta luego!");
		} 
		
		}while(!salir);
		
}//class
}//main
	




	



	




