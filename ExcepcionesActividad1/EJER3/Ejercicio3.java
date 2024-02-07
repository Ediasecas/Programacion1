package EJER3;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		double vector [] = new double[5];


		for(int i = 0; i< 6; i++)
		try 
		{
			System.out.println("Introduzca el valor " + (i + 1) + " del vector");
            vector[i] = entrada.nextDouble();
		}
		
		catch (NumberFormatException e) 
		{
            System.out.println("Ocurrio una excepcion debido a que no se introdujo un numero en el formato correcto, souble");
            entrada.nextLine();
            i--;
        }
		
		catch(InputMismatchException e)
		{
			System.out.println("Ocurrio una excepcion debido que no se introdujo un numero ");
			entrada.nextLine();
			 i--;
		
		}
		
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Se ha extendido la dimension  del array");
		}
		
		
		System.out.println("Vector final:");
	        for (double valor : vector) 
	        {
	            System.out.print(valor + " ");
	        }
		
	}

}
