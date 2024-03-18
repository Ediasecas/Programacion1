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
						
						System.out.println("Introduzca la fecha de publicacion (EJ: 1999-01-01)");
						LocalDate fechaP = LocalDate.parse(entrada.nextLine());
					
<<<<<<< HEAD
						Libro libroN = new Libro(ISBN, titulo, autor, fechaP);
						registrarLibro(libroN);
=======
						Libro libro = new Libro(ISBN, titulo, autor, fechaP);
						registrarLibro(libro);
>>>>>>> 2116436f7c306e4922de467a57a60220e1f74e36
						
					
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
						System.out.println("Libro con ISBN " + ISBNEliminar + " eliminado correctamente");
						
					}
					
					
				break;	
				
				
				case 4:
					entrada = new Scanner(System.in);
					
					System.out.println("Guardando Libros en el Fichero");
<<<<<<< HEAD
					
					escribirFicheroObjetos(myPath+myFile, miListaLibros);
=======
					escribirFicheroObjetos(myPath + myFile);
			
>>>>>>> 2116436f7c306e4922de467a57a60220e1f74e36
					
				break;
				
				
				case 5:
					
					entrada = new Scanner(System.in);
					
					System.out.println("Usted guardó los libros en el fichero y salió del programa correctamente");
<<<<<<< HEAD
					escribirFicheroObjetos(myPath+myFile, miListaLibros);
				
=======
					escribirFicheroObjetos(myPath + myFile);
			
>>>>>>> 2116436f7c306e4922de467a57a60220e1f74e36
					salir = true;
                    
                    
				break;
				
			}
	
		}
		
		while(!salir);
		
		
		

	}//main
	
	

	public static void registrarLibro(Libro libro) 
	{
	    boolean ISBNRepetido = false;
<<<<<<< HEAD
	    
	    for (Libro libr : miListaLibros) 
	    {
	        if (libr.getISBN() == libro.getISBN()) 
=======
	    for (Libro libr : miListaLibros)
	    {
	        if (libr.getISBN().equals(libro.getISBN()))
>>>>>>> 2116436f7c306e4922de467a57a60220e1f74e36
	        {
	            ISBNRepetido = true;
	            break;
	        }
	    }

<<<<<<< HEAD
	    if (ISBNRepetido) 
	    {
	        System.out.println("No se pudo registrar el libro su ISBN ya esta repetido.");
	    } 
	    
	    else
=======
	    if (ISBNRepetido)
	    {
	       System.out.println("No se pudo introducir el libro, ya fue registrado, ISBN repetido.");
	    } 
	    else 
>>>>>>> 2116436f7c306e4922de467a57a60220e1f74e36
	    {
	        miListaLibros.add(libro);
	        System.out.println("Libro registrado con éxito.");
	    }
	}
	
	
	
<<<<<<< HEAD

	
	
	
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
=======
    public static void escribirFicheroObjetos(String fullPath)
    {
    	try(FileOutputStream file = new FileOutputStream(fullPath);
				ObjectOutputStream buffer = new ObjectOutputStream(file);)
        {
            for (Libro libro : miListaLibros)
            {
                buffer.writeObject(libro);
            }
          
        } 
        
        catch (IOException e) 
        {
            System.out.println("Se ha producido un error al guardar los libros en el fichero.");
            System.out.println(e.getMessage());
        }
    	
    	catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
    	
		finally 
		{
			System.out.println("Fin de la escritura del fichero: "+fullPath);
		}
    }
	
>>>>>>> 2116436f7c306e4922de467a57a60220e1f74e36

	
	
	
	
}//clase	
	

	
	
	
	
