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
            System.out.println("5. Buscar Contacto por nombre.");
            System.out.println("6. Salir del programa. ");
            seleccion = entrada.nextInt();

            
            switch (seleccion) {

                case 1:
                	
                	System.out.println("Introduce los datos del contacto a añadir:");
                	
                	System.out.println("Introduce el nombre del contacto a añadir");
                	String nombreContacto = entrada.nextLine();
                	
                	System.out.println("Introduce el num  del contacto a añadir");
                	String numContacto = entrada.nextLine();

                	Contacto nuevoContacto = new Contacto(nombreContacto, numContacto);
                	agendaNueva.añadirContacto(nuevoContacto);
                    break;

               
                case 2:
                   
                    System.out.println("Ingrese el nombre del contacto que desea eliminar:");
                    String nombreContactoEliminar = entrada.nextLine();
                   
                    agendaNueva.eliminarContacto();
                    break;

                case 3:
                	
                	System.out.println("Introduzca el contacto a buscar en la agenda");
                	String buscarContacto = entrada.nextLine();
                	
                	i.getInventario().mostrarTodosDatos();

                	break;

                case 4:
                    
                	entrada.nextLine();
                    System.out.println("Ingrese los detalles del nuevo animal:");
                   
                    System.out.print("Nombre: ");
                    String nuevoNombre = entrada.nextLine();
                    System.out.print("Edad: ");
                    String nuevaEdad = entrada.nextLine();
                    System.out.print("Estado: ");
                    String nuevoEstado = entrada.nextLine();
                    System.out.print("Fecha de nacimiento: ");
                    String nuevaFechaNacimiento = entrada.nextLine();
                    
                    Mascotas nuevaMascota = new Perro(nuevoNombre, nuevaEdad, nuevoEstado, nuevaFechaNacimiento, "Raza", false);
                   
                    i.getInventario().añadirMascota(nuevaMascota);
                    System.out.println("Nuevo animal añadido correctamente.");
                    
                    break;

                case 5:
                    
                	entrada.nextLine();
                    System.out.println("Ingrese el nombre del animal a eliminar:");
                    String nombreEliminar = entrada.nextLine();
                    i.getInventario().borrarAnimal(nombreEliminar);
                    System.out.println("Animal eliminado correctamente.");
                   
                    break;


                case 6:

                    System.out.println("Usted salió del programa correctamente");
                    salir = true;

                    break;

            }// selección

        } while (!salir);
		
		
	}

	
	
}
