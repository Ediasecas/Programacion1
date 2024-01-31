import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		int numA;
		int numB;
		int operacion;

		try 
		{
			System.out.println("Introduzca un valor entero A");
			numA = entrada.nextInt();
			
			System.out.println("Introduzca otro valor entero B");
			numB = entrada.nextInt();
			
			operacion = (numA/numB);
			System.out.println("El reusltado truncado de la operacion A/B es " + operacion);
		}
		
		catch(InputMismatchException e) 
		{
			entrada = new Scanner(System.in);
			System.out.println("Ocurrío una excepcion debido a que no se introdujeon numeros entero correcto, introduzcalos de nuevo(A y B consecutivamente)");
			
			System.out.println("Introduzca un valor entero A");
			numA = entrada.nextInt();
			
			System.out.println("Introduzca otro valor entero B");
			numB = entrada.nextInt();
			
			operacion = (numA/numB);
			System.out.println("El reusltado truncado de la operacion A/B es " + operacion);
			
		}
		
		catch(ArithmeticException e)
		{
			entrada = new Scanner(System.in);
			System.out.println("Ocurrío una excepcion debido a que se esta dividiendo por cero, introduzca los numeros de nuevo");
			
			System.out.println("Introduzca un valor entero A");
			numA = entrada.nextInt();
			
			System.out.println("Introduzca otro valor entero B");
			numB = entrada.nextInt();
			
			operacion = (numA/numB);
			System.out.println("El reusltado truncado de la operacion A/B es " + operacion);
		}
		
		
		catch(Exception e)
		{
			System.out.println("Ocurrío una excepcion, repita el programa");
		}
		
		
	}

}
