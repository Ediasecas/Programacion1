import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;

public class Inventario 
{
	static LinkedList <Producto> miListaProductos = new LinkedList<Producto>();
	
	public static void main(String[] args)
	{
		
		Scanner entrada = new Scanner(System.in);
		

		final String almacenDatPath = "./Recursos/almacen.dat";
        final String inventarioMyFile = "./inventario.dat";
		
		
        cargarDatosBinarios(almacenDatPath);
		
        miListaProductos.add(new Producto("REF001", "Libro de Java", "Libro", 10, 29.99, 0, 7, false));
        miListaProductos.add(new Producto("REF002", "Mouse inalámbrico", "Accesorio", 50, 15.99, 0, 7, true));
        miListaProductos.add(new Producto("REF003", "Teclado mecánico", "Accesorio", 20, 49.99, 0, 7, true));
        
		int seleccionar;
		boolean salir = false;
		
		do 
		{
			
			System.out.println("---------Biblioteca Daw--------------");
			System.out.println("1.Mostrar productos existentes");
			System.out.println("2.Eliminar productos por referencia");	
			System.out.println("3.Guardar y Salir de la aplicacion");
			System.out.println("4.Registrar producto en el inventario");
			System.out.println("Selceccione una opcion del menu escogiendola por su numero");
			
			seleccionar = entrada.nextInt();
			
			switch(seleccionar)
			{
				case 1:
					
					entrada = new Scanner(System.in);
					
					System.out.println("Mostrando productos existentes...");
					
					for(Producto p: miListaProductos)
					{
						System.out.println(p.toString());
					}
						
					System.out.println("\n");
					
				break;
				
				
				
				case 2:
					
					entrada = new Scanner(System.in);
					

					System.out.println("Eliminando producto...");
					
					System.out.println("Introduzca la referencia  del producto a borrar");
					String referenciaEliminar = entrada.nextLine();
					
					boolean EliminarOK = false;
					for(int i =0; i < miListaProductos.size(); i++)
					{
						if(miListaProductos.get(i).getReferencia().equals(referenciaEliminar))
						{
							miListaProductos.remove(i);
							EliminarOK = true;
						}
					}
					
					if(EliminarOK = true)
					{
						System.out.println("Producto con referencia " + referenciaEliminar + " eliminado correctamente");
						
					}
					
					else
					{
	                    System.out.println("No se encontró ningún producto con la referencia proporcionada");
	                }
					
					System.out.println("\n");
					
				break;
				
				
				
				case 3:
					
					entrada = new Scanner(System.in);
					
					System.out.println("Guardando productos en el inventario...");
					guardarDatosBinarios(inventarioMyFile);
					
					System.out.println("\n");
					
				break;	
				
				
				case 4:
					entrada = new Scanner(System.in);
					
			
					
					System.out.println("Registrando producto...");
					
					System.out.println("Introduzca la referencia del producto");
					String referencia = entrada.nextLine();
					
					System.out.println("Introduzca la descripcion");
					String descripcion = entrada.nextLine();
					
					System.out.println("Introduzca el tipo de producto que es");
					String tipo = entrada.nextLine();
					
					System.out.println("Introduzca la cantidad de producto");
					int cantidad = entrada.nextInt();
					
					System.out.println("Introduzca el precio del producto");
					double precio = entrada.nextDouble();
					
					System.out.println("Introduzca el descuento del producto");
					int descuento = entrada.nextInt();
					
					System.out.println("Introduzca el IVA del producto");
					int IVA = entrada.nextInt();
					
					System.out.println("¿Se le aplica el descuento?");
					boolean aplicarDto = entrada.nextBoolean();
				
					Producto producto = new Producto(referencia, descripcion, tipo, cantidad, precio, descuento, IVA, aplicarDto);
					registrarProducto(producto);
					
					System.out.println("\n");
				break;
				
		
				
			}
	
		}
		
		while(!salir);
		
		
	}//Main 

	//METODOS A CONTINUACION
	
	public static void registrarProducto(Producto producto) 
	{
	    boolean referenciaRepetida = false;
	    for (Producto prods : miListaProductos)
	    {
	        if (prods.getReferencia().equals(producto.getReferencia()))
	        {
	        	referenciaRepetida = true;
	            break;
	        }
	    }

	    if (referenciaRepetida)
	    {
	       System.out.println("No se pudo introducir el producto, ya fue registrado, referencia repetida.");
	    } 
	    else 
	    {
	        miListaProductos.add(producto);
	        System.out.println("Producto registrado con éxito.");
	    }
	}
	
	
	
	

	 
	  public static void cargarDatosBinarios(String filePath) 
	  {
	        try (FileInputStream fileInput = new FileInputStream(filePath);
	             ObjectInputStream objectInput = new ObjectInputStream(fileInput))
	        {

	            // Leer los objetos Producto del archivo binario y agregarlos a la lista miListaProductos
	            while (true) 
	            {
	                try 
	                {
	                    Producto producto = (Producto) objectInput.readObject();
	                    miListaProductos.add(producto);
	                } 
	                catch (ClassNotFoundException e) 
	                {
	                    e.printStackTrace();
	                }
	            }
	        } 
	        catch (IOException e) 
	        {
	            // Manejar la excepción (p. ej., si el archivo no existe)
	        }
	   }
	
	  
	  public static void guardarDatosBinarios(String inventarioMyFile) 
	  {
		  try (FileOutputStream fileOutput = new FileOutputStream(inventarioMyFile);
		             ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput))
			{
	            for (Producto producto : miListaProductos) 
	            {
	            	objectOutput.writeObject(producto);
	            }
	        } 
		  	
		  	catch(IOException e) 
			{
		  		 System.out.println("Se ha producido un error al guardar los productos en " + inventarioMyFile);
		         e.printStackTrace();
			}
			
			finally 
			{
				System.out.println("La escritura del fichero ha finalizado..... \n");
			}
	    }

	
}//Clase Inventario
