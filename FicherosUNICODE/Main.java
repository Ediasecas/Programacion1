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


	
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		
		final String myPath = "./src";
		final String myFile = "Almacen.dat";
		
		LinkedList <Producto> miListaProductos = new LinkedList<Producto>();
		
		int seleccionar;
		boolean salir = false;
		
		do 
		{
			System.out.println("1.Registrar producto");
			System.out.println("2.Mostrar producto/s existente/s");	
			System.out.println("3.Eliminar producto por codigo");
			System.out.println("4.Guardar producto/s en el fichero");
			System.out.println("5.Salir de la aplicacion");
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
					
					System.out.println("Mostrando productos existentes en el almacen");
					for(Producto p: miListaProductos)
					{
						System.out.println(p.toString());
					}
					
				break;
				
				
				
				case 3:
					
					entrada = new Scanner(System.in);
					
					System.out.println("Eliminando producto...");
					
					System.out.println("Introduzca el codigo del producto a borrar");
					String codigoEliminar = entrada.nextLine();
					
					boolean productoEliminar = false;
					for(int i =0; i < miListaProductos.size(); i++)
					{
						if(miListaProductos.get(i).getCodigo().equals(codigoEliminar))
						{
							miListaProductos.remove(i);
							productoEliminar = true;
						}
					}
					
					if(productoEliminar = true)
					{
						System.out.println("Producto con codigo " + codigoEliminar + " eliminado correctamente");
						
					}
					
					
				break;	
				
				
				case 4:
					
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
				
				
				case 5:
					
					entrada = new Scanner(System.in);
					
					System.out.println("Usted salió del programa correctamente");
                    salir = true;
                    
				break;
				
			}
	
		}
		
		while(!salir);
		
		
		

	}//main
	

	
}//clase	
	

	
	
	
	
