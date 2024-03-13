import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;

public class Main
{
	static LinkedList <Libro> miListaLibros = new LinkedList<Libro>();
	
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		
		final String myPath = "./src";
		final String myFile = "Biblioteca.dat";
		final boolean modoApend = false;
		
		
		int seleccionar;
		boolean salir = false;
		
		do 
		{
			
			System.out.println("---------Biblioteca Daw--------------");
			System.out.println("1.Crear Libro y registrarlo en la Biblioteca");
			System.out.println("2.Mostrar libros existentes");	
			System.out.println("3.Eliminar libro por ISBN");
			System.out.println("4.Guardar libros en el fichero");
			System.out.println("5.Guardar y Salir de la aplicacion");
			System.out.println("Selceccione una opcion del menu escogiendola por su numero");
			
			seleccionar = entrada.nextInt();
			
			switch(seleccionar)
			{
				case 1:
					
					entrada = new Scanner(System.in);
					
					
						System.out.println("Registrando producto");
						
						System.out.println("Introduzca el ISBN");
						String ISBN = entrada.nextLine();
						
						System.out.println("Introduzca el titulo");
						String titulo = entrada.nextLine();
						
						System.out.println("Introduzca el autor");
						String autor = entrada.nextLine();
						
						System.out.println("Introduzca la fecha de publicacion");
						LocalDate fechaP = LocalDate.parse(entrada.nextLine());
					
						Libro libro = new Libro(ISBN, titulo, autor, fechaP);
						registrarLibro(libro, miListaLibros);
						
					
				break;
				
				
				
				case 2:
					
					entrada = new Scanner(System.in);
					
					System.out.println("Mostrando productos existentes en el almacen");
					
					
					for(Libro p: miListaLibros)
					{
						System.out.println(p.toString());
					}
					

					
				break;
				
				
				
				case 3:
					
					entrada = new Scanner(System.in);
					
					System.out.println("Eliminando producto...");
					
					System.out.println("Introduzca el ISBN del libro a borrar");
					String ISBNEliminar = entrada.nextLine();
					
					boolean EliminarOK = false;
					for(int i =0; i < miListaLibros.size(); i++)
					{
						if(miListaLibros.get(i).getISBN().equals(ISBNEliminar))
						{
							miListaLibros.remove(i);
							EliminarOK = true;
						}
					}
					
					if(EliminarOK = true)
					{
						System.out.println("Producto con codigo " + ISBNEliminar + " eliminado correctamente");
						
					}
					
					
				break;	
				
				
				case 4:
					entrada = new Scanner(System.in);
					
					System.out.println("Guardando Libros en el Fichero");
					
					try(FileOutputStream file = new FileOutputStream(myPath+myFile, modoApend );
							ObjectOutputStream buffer = new ObjectOutputStream(file);)
					{
						//Recorro la coleccion y escribo cada uno de sus objetos
						for(Libro t : miListaLibros)
						{
							//Escribo objeto serializable
							buffer.writeObject(t);
						}
						
					}catch(IOException e)
					{
						System.out.println("Se ha producido un error en la lectura del fichero");
						System.out.println(e.getMessage());
					}
					catch(Exception e)
					{
						System.out.println(e.getMessage());
					}
					finally {
						System.out.println("Fin de la escritura del fichero: "+myFile);
					}
					
				break;
				
				
				case 5:
					
					entrada = new Scanner(System.in);
					
					System.out.println("Usted guardó los libros en el fichero y salió del programa correctamente");
					   
					try(FileOutputStream file = new FileOutputStream(myPath+myFile, modoApend );
							ObjectOutputStream buffer = new ObjectOutputStream(file);)
					{
						//Recorro la coleccion y escribo cada uno de sus objetos
						for(Libro t : miListaLibros)
						{
							//Escribo objeto serializable
							buffer.writeObject(t);
						}
						
					}catch(IOException e)
					{
						System.out.println("Se ha producido un error en la lectura del fichero");
						System.out.println(e.getMessage());
					}
					catch(Exception e)
					{
						System.out.println(e.getMessage());
					}
					finally {
						System.out.println("Fin de la escritura del fichero: "+myFile);
					}
					
					salir = true;
                    
                    
				break;
				
			}
	
		}
		
		while(!salir);
		
		
		

	}//main
	

	public static void registrarLibro(Libro libro, LinkedList<Libro> miListaLibros)  //metodo de registrar libro para que no sea repetido
 	{
		for(Libro libr : miListaLibros) 
		{
			if(libr.getISBN().equalsIgnoreCase(libro.getISBN()))
			{
			 
				System.out.println("Libro ya registrado , ISBN repetido.");
			}
			
			else 
			{
				miListaLibros.add(libro); // Agrega el libro a la coleccion de libro
				System.out.println("Libro registrado con éxito.");
			}
		}
 	} 
	
	

}//clase	
	

	
	
	
	
