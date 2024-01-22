
import java.util.Scanner;

public class ProgramaAgenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Agenda agendaNueva = new Agenda(100);
		
		

        System.out.println("¡Bienvenidos a la agenda de contactos!");
        Scanner entrada = new Scanner(System.in);
		
        int seleccion;
        boolean salir = false;
        
        do {

            System.out.println("Seleccione una opción del menú eligiéndola por su número (1-8)");
            System.out.println("1. Añadir Contacto.");
            System.out.println("2. Eliminar Contacto. ");
            System.out.println("3. ¿Existe Contacto?.");
            System.out.println("4. Mostrar agenda ");
            System.out.println("5. Buscar Posicion del Contacto .");
            System.out.println("6. Salir del programa. ");
            seleccion = entrada.nextInt();

            
            switch (seleccion) {

                case 1:
                	entrada.nextLine();
                	
                	
                	System.out.println("Introduce los datos del contacto a añadir:");
                	
                	System.out.println("Introduce el nombre del contacto a añadir");
                	String nombreContacto = entrada.nextLine();
                	
                	System.out.println("Introduce el numero  del contacto a añadir");
                	String numContacto = entrada.nextLine();

                	Contacto nuevoContacto = new Contacto(nombreContacto, numContacto);
                	agendaNueva.añadirContacto(nuevoContacto);
                    break;

               
                case 2:
                	entrada.nextLine();
                   
                    System.out.println("Ingrese el nombre del contacto que desea eliminar:");
                    String nombreContactoEliminar = entrada.nextLine();
                    agendaNueva.eliminarContacto(nombreContactoEliminar);
                    
                    break;

                case 3:
                	entrada.nextLine();
                	
                	System.out.println("Introduzca el contacto a buscar en la agenda");
                	String buscarContacto = entrada.nextLine();
                	agendaNueva.existeContacto(buscarContacto);
                	
                	break;

                case 4:
                	entrada.nextLine();
                	
                    System.out.println("Mostando por pantalla toda la agenda");
                    agendaNueva.mostrarTodosDatos();
                    
                    break;

                case 5:
                	entrada.nextLine();
                	
                    System.out.println("Ingrese el nombre del contacto a buscar en la agenda para saber su posicion:");
                    String contactoBuscar = entrada.nextLine();
                    agendaNueva.posicionContacto(contactoBuscar);
  
                    break;


                case 6:

                    System.out.println("Usted salió del programa correctamente");
                    salir = true;

                    break;

            }

        } while (!salir);
		
		
	}

	
	
}

