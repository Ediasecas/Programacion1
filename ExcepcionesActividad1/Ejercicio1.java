import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		int num;
		

		try 
		{
			System.out.println("Introduzca un valor entero");
			num = entrada.nextInt();
		}
		
		catch(InputMismatchException e) 
		{
			entrada = new Scanner(System.in);
			System.out.println("Ocurrío una excepcion debido a que no se introdujo un numero entero correcto, introduzcalo de nuevo");
			num = entrada.nextInt();
		}
		
		
		
	}

}
