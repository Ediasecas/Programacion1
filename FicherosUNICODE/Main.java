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
		
		final String myPath = "./src/Resources/";
		final String myFile = "Almacen.dat";
		
		LinkedHashSet <Producto> miListaProductos = new LinkedHashSet<Producto>();
		
		int seleccionar;
		boolean salir = false;
		
		do 
		{
			System.out.println("1.Registrar Producto");
			System.out.println("2.Mostrar Producto existente");	
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
					entrada = new Scanner(System.in);
					
					System.out.println("Mostrando productos");
					LinkedList<String> misLineas = new LinkedList();
				
					try(FileReader myreader =  new FileReader(myPath+myFile);
						BufferedReader buffer = new BufferedReader(myreader);)
						{
							String line = null;
							do
							{
	
								line = buffer.readLine();
								if(line != null)
								{
									misLineas.add(line);
									
									String [] elementos = line.split(",");
									String nom = elementos[0];
									int nota = Integer.parseInt(elementos[1]);
									int pos = Integer.parseInt(elementos[2]);
									
									System.out.println(line);
								}
								
								
							}
							while(line != null);
							
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
					
					miListaProductos.remove(codigoEliminar);
					
					
				break;	
				
				
				
			}
	
		}
		while(!salir);

	}
}