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
					
					
						System.out.println("Registrando producto...");
						
						System.out.println("Introduzca el ISBN");
						int ISBN = entrada.nextInt();
						entrada = new Scanner(System.in);
						
						System.out.println("Introduzca el titulo");
						String titulo = entrada.nextLine();
						entrada = new Scanner(System.in);
						
						System.out.println("Introduzca el autor");
						String autor = entrada.nextLine();
						
						System.out.println("Introduzca la fecha de publicacion");
						LocalDate fechaP = LocalDate.parse(entrada.nextLine());
					
						Libro libroN = new Libro(ISBN, titulo, autor, fechaP);
						registrarLibro(libroN);
						
					
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
					int ISBNEliminar = entrada.nextInt();
					
					boolean EliminarOK = false;
					for(int i =0; i < miListaLibros.size(); i++)
					{
						if(miListaLibros.get(i).getISBN() == (ISBNEliminar))
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
					
					escribirFicheroObjetos(myPath+myFile, miListaLibros);
					
				break;
				
				
				case 5:
					
					entrada = new Scanner(System.in);
					
					System.out.println("Usted guardó los libros en el fichero y salió del programa correctamente");
					escribirFicheroObjetos(myPath+myFile, miListaLibros);
				
					salir = true;
                    
                    
				break;
				
			}
	
		}
		
		while(!salir);
		
		
		

	}//main
	
	

	public static void registrarLibro(Libro libro) 
	{
	    boolean ISBNRepetido = false;
	    
	    for (Libro libr : miListaLibros) 
	    {
	        if (libr.getISBN() == libro.getISBN()) 
	        {
	            ISBNRepetido = true;
	            break;
	        }
	    }

	    if (ISBNRepetido) 
	    {
	        System.out.println("No se pudo registrar el libro su ISBN ya esta repetido.");
	    } 
	    
	    else
	    {
	        miListaLibros.add(libro);
	        System.out.println("Libro registrado con éxito.");
	    }
	}
	
	
	

	
	
	
	public static void escribirFicheroObjetos(String fullPath, LinkedList<Libro> miListaLibros)
	{
		//Escritura de objetos serializables
		try(FileOutputStream file = new FileOutputStream(fullPath);
				ObjectOutputStream buffer = new ObjectOutputStream(file);)
		{
	
			for(Libro t : miListaLibros)
			{
				
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
			System.out.println("Fin de la escritura del fichero: "+fullPath);
		}
	}

	
	
	
	
}//clase	
	

	
	
	
	
