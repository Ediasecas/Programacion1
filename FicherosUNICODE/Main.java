import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static LinkedList <Producto> miListaProductos = new LinkedList<Producto>();
	
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		
		final String myPath = "./src";
		final String myFile = "Almacen.dat";
		
		
		
		int seleccionar;
		boolean salir = false;
		
		do 
		{
			System.out.println("1.Registrar Producto");
			System.out.println("2.Mostrar Productos existente");	
			System.out.println("3.Eliminar prducto por codigo");
			System.out.println("4.Salir de la aplicacion");
			System.out.println("Selceccione una opcion del menu escogiendola por su numero");
			seleccionar = entrada.nextInt();
			
			switch(seleccionar)
			{
				case 1:
					
					entrada = new Scanner(System.in);
					
					
					System.out.println("Registrando producto");
					
					System.out.println("Introduzca el codigo");
					String codigo = entrada.nextLine();
					
					System.out.println("Introduzca el nombre");
					String nombre = entrada.nextLine();
					
					System.out.println("Introduzca la cantidad");
					int cantidad = entrada.nextInt();
					
					System.out.println("Introduzca el precio");
					double precio = entrada.nextDouble();
					
					miListaProductos.add(new Producto(codigo, nombre, cantidad, precio));
				break;
				
				
				
				case 2:
					
					try(FileWriter myWriter = new FileWriter(myPath+myFile, false);
							BufferedWriter buffer = new BufferedWriter(myWriter);)
					{
						for(Producto producto : miListaProductos)
						{
							
							 buffer.write(producto + ",0," + miListaProductos.indexOf(producto));
							 buffer.newLine(); 
						}

						
					}
					catch(IOException e)
					{
						System.out.println("Se ha producido un error en el manejo del fichero");
						System.out.println(e.getMessage());
					}
					
					finally 
					{
						System.out.println("La escritura ha finalizado con exito.");
					}
			
				break;
				
				
				
				case 3:
					
					entrada = new Scanner(System.in);
					
					System.out.println("Eliminando producto...");
					
					System.out.println("Introduzca el codigo del producto a borrar");
					String codigoEliminar = entrada.nextLine();
					
					eliminarProducto(codigoEliminar);
					
					
				break;	
				
				
				case 4:
					
					entrada = new Scanner(System.in);
					
					System.out.println("Usted salió del programa correctamente");
                    salir = true;
					
				break;
			}
	
		}
		while(!salir);
		
		
		

	}//main
	

	public static void eliminarProducto(String codigoEliminar)
	{
		
			if(codigoEliminar != null)
			{
				miListaProductos.remove(codigoEliminar);
			}
			
			else
			{
				System.out.println("Esta codigo no se encuentra en el la lista de productos");
			}	
			
	}
	
	
	
}//clase	
	

	
	
	
	
