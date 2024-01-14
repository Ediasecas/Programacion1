package herencia2;

import java.util.Scanner;

public class InventarioMain 
{

    private inventarioClases inventario1;  

		    public InventarioMain() 
		    {
		        this.inventario1 = new inventarioClases("Nombre", "tipo");
		    }

    
    
    public static void main(String[] args) {

        System.out.println("Mascotas");

        System.out.println("¡Bienvenidos al inventario de nuestras Mascotas!");
        Scanner entrada = new Scanner(System.in);

        int seleccion;
        boolean salir = false;

        InventarioMain i = new InventarioMain();

        Perro nPerro;
        Gato nGato;
        Loro nLoro;
        Canario nCanario;

        nPerro = new Perro("Mike ", "2 ", "vivo ", "07/03/2022 ", "Beagle ", false);
        nGato = new Gato("Garfield ", "1 ", "vivo", "09/01/2023 ", "Naranja ", false);
        nLoro = new Loro("Rio ", "4 ", "muerto ", "25/05/2019", "Curvo y Puntiagudo", true, "Brasil ", true);
        nCanario = new Canario("Quevedo ", "8 7"
        		+ "", "vivo ", "15/08/2016", "Paralelo y Puntiagudo", true, "Amarillo ", true);

        i.getInventario().añadirMascota(nPerro);
        i.getInventario().añadirMascota(nGato);
        i.getInventario().añadirMascota(nLoro);
        i.getInventario().añadirMascota(nCanario);

        do {

            System.out.println("Seleccione una opción del menú eligiéndola por su número (1-8)");
            System.out.println("1. Mostrar lista de animales.");
            System.out.println("2. Mostrar datos de un animal en concreto. ");
            System.out.println("3. Mostrar datos de todos los animales.");
            System.out.println("4. Insertar animales al inventario. ");
            System.out.println("5. Eliminar animales del inventario.");
            System.out.println("6. Vaciar el inventario. ");
            System.out.println("7. Salir del programa. ");
            seleccion = entrada.nextInt();

            switch (seleccion) {

                case 1:
                    
                	i.getInventario().mostrarListaTipoNombre();

                    break;

                case 2:
                   
                	entrada.nextLine();
                    System.out.println("Ingrese el nombre del animal:");
                    String nombreAnimal = entrada.nextLine();
                    i.getInventario().mostrarDatosAnimal(nombreAnimal);

                    break;

                case 3:
                	
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
                	
                	i.getInventario().vaciarInventario();
                    System.out.println("Inventario vaciado correctamente.");
                   
                    break;

                case 7:

                    System.out.println("Usted salió del programa correctamente");
                    salir = true;

                    break;

            }// selección

        } while (!salir);
    }

    public inventarioClases getInventario() {
        return inventario1;
    }
}